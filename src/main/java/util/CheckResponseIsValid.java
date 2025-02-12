package util;
import io.restassured.response.Response;
import org.testng.Assert;
public class CheckResponseIsValid {
    public static void checkResponseCode(Response response, int expectedStatusCode) {
        Assert.assertEquals(response.getStatusCode(), expectedStatusCode);
    }
}