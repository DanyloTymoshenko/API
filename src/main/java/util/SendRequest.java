package util;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class SendRequest {
    public static Response sendPostRequest(RequestSpecification request, String endpoint, String body) {
        return request.body(body).post(endpoint);
    }
    public static Response sendGetRequest(RequestSpecification request, String endpoint) {
        return request.get(endpoint);
    }
    public static Response sendPutRequest(RequestSpecification request, String endpoint, String body) {
        return request.body(body).put(endpoint);
    }
    public static Response sendDeleteRequest(RequestSpecification request, String endpoint) {
        return request.delete(endpoint);
    }
}