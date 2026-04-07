import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class LoadData {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Load the JSON file into a generic JsonNode tree
            JsonNode root = mapper.readTree(new File("codebook_data.json"));

            // Accessing data
            JsonNode users = root.get("users");
            for (JsonNode user : users) {
                System.out.println("User: " + user.get("name").asText());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
