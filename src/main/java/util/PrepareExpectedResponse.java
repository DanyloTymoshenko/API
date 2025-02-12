package util;

import org.json.JSONObject;
public class PrepareExpectedResponse {
    public static String prepareExpectedResponse(String boardName) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", boardName);
        return jsonObject.toString();
    }
}
