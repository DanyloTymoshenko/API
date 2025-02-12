package tests;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
public class RestAssuredTests extends BaseTest {
    private static final String BOARD_ID = "67ab16b2b350fe907f3594ad";
    @Test
    public void testGetBoardDetails() {

        Response response = RestAssured.given()
                .param("key", API_KEY)
                .param("token", API_TOKEN)
                .get("/boards/" + BOARD_ID);

        Assert.assertEquals(response.getStatusCode(), 200, "Response code is not 200");

        System.out.println("Response Body: " + response.getBody().asString());

        String boardName = response.jsonPath().getString("name");
        Assert.assertNotNull(boardName, "Board name should not be null");
        System.out.println("Board Name: " + boardName);
    }
}