package tests;
import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.ConnectionConfig;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected static final String BASE_URL = "https://api.trello.com/1";
    protected static final String API_KEY = "820a1faab4e1b32f2573ded26ac486f2";
    protected static final String API_TOKEN = "ATTA87bd24a98ede18927c083d0bd08cf435c9777b145816cc6b88326ccb77d9de8352CE0445";
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://api.trello.com/1";
        RestAssured.config = RestAssuredConfig.config().connectionConfig(new ConnectionConfig().closeIdleConnectionsAfterEachResponse());


    }
}
