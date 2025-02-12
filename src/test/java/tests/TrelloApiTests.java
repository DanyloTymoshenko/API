package tests;

import io.restassured.response.Response;
import models.Board;
import org.testng.annotations.Test;
import util.*;
import static org.assertj.core.api.Assertions.assertThat;
public class TrelloApiTests extends BaseTest {
    private static final String API_KEY = "your_api_key";
    private static final String TOKEN = "your_oauth_token";
    private String createdBoardId;
    @Test
    public void testCreateBoard() {
        String boardName = "Test Board";
        String expectedResponse = PrepareExpectedResponse.prepareExpectedResponse(boardName);
        var request = BuildRequest.buildRequest(API_KEY, TOKEN);
        Response response = SendRequest.sendPostRequest(request, "/", "{ \"name\": \"" + boardName + "\" }");
        CheckResponseIsValid.checkResponseCode(response, 200);
        Board board = response.as(Board.class);
        createdBoardId = board.getId();
        assertThat(board.getName()).isEqualTo(boardName);
    }
    @Test(dependsOnMethods = "testCreateBoard")
    public void testGetBoard() {
        var request = BuildRequest.buildRequest(API_KEY, TOKEN);
        Response response = SendRequest.sendGetRequest(request, "/" + createdBoardId);
        CheckResponseIsValid.checkResponseCode(response, 200);
        Board actualBoard = response.as(Board.class);
        assertThat(actualBoard.getId()).isEqualTo(createdBoardId);
    }
    @Test(dependsOnMethods = "testGetBoard")
    public void testUpdateBoard() {
        String updatedBoardName = "Updated Board";
        var request = BuildRequest.buildRequest(API_KEY, TOKEN);
        Response response = SendRequest.sendPutRequest(request, "/" + createdBoardId, "{ \"name\": \"" + updatedBoardName + "\" }");
        CheckResponseIsValid.checkResponseCode(response, 200);
        Board updatedBoard = response.as(Board.class);
        assertThat(updatedBoard.getName()).isEqualTo(updatedBoardName);
    }
    @Test(dependsOnMethods = "testUpdateBoard")
    public void testDeleteBoard() {
        var request = BuildRequest.buildRequest(API_KEY, TOKEN);
        Response response = SendRequest.sendDeleteRequest(request, "/" + createdBoardId);
        CheckResponseIsValid.checkResponseCode(response, 200);
    }
}

