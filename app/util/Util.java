package util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
import play.libs.Json;

public class Util {

    public static ObjectNode createResponse(Object response, boolean ok) {
        ObjectNode result = Json.newObject();
        result.put("isSuccessfull", ok);
        if (response instanceof String) {
            result.put("body", (String) response);
            }
        else {
                result.put("body", (JsonNode) response);
        }
        return result;
    }
    public static ObjectNode createResp(User response, boolean ok) {
        ObjectNode result = Json.newObject();
        result.put("isSuccessfull", ok);
        result.put("userId",response.getUserId());
        result.put("userName",response.getUserName());
        return result;
    }
}
