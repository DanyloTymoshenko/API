package util;

import io.restassured.specification.RedirectSpecification;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BuildRequest {

    public static RequestSpecification buildRequest(String key, String token){
     return RestAssured.given()
             .queryParam("ODIwYTFmYWFiNGUxYjMyZjI1NzNkZWQyNmFjNDg2ZjI=",key)
             .queryParam("QVRUQTg3YmQyNGE5OGVkZTE4OTI3YzA4M2QwYmQwOGNmNDM1Yzk3NzdiMTQ1ODE2Y2M2Yjg4MzI2Y2NiNzdkOWRlODM1MkNFMDQ0NQ==",token)
             .queryParam("application/json");

    }
}
