package util;

import io.restassured.response.Response;

public class PrepareActualResponse {
    public static String prepareResponseAsString(Response response) {
        return response.asString();
    }
}
