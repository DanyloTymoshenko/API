package util;

import org.assertj.core.api.Assertions;
import io.restassured.response.Response;
public class CheckActualVsExpectedResponse {
    public static void compareActualAndExpected(String actualResponse, String expectedResponse) {
        Assertions.assertThat(actualResponse).isEqualTo(expectedResponse);
    }
}
