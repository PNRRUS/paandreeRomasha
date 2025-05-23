package HTTPTraining;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class jsonJackson {

        public static void main(String[] args) throws Exception {
            ObjectMapper mapper = new ObjectMapper();
            ObjectNode rootNode = mapper.createObjectNode();

            // Добавляем простые поля
            rootNode.put("id", 100500);
            rootNode.put("name", "Molson");
            rootNode.put("status", "available");

            // Добавляем объект category
            ObjectNode categoryNode = mapper.createObjectNode();
            categoryNode.put("id", 100500);
            categoryNode.put("name", "Molson");
            rootNode.set("category", categoryNode);

            // Добавляем массив photoUrls
            ArrayNode photoUrlsNode = mapper.createArrayNode();
            photoUrlsNode.add("string");
            rootNode.set("photoUrls", photoUrlsNode);

            // Добавляем массив объектов tags
            ArrayNode tagsNode = mapper.createArrayNode();
            ObjectNode tagNode = mapper.createObjectNode();
            tagNode.put("id", 100500);
            tagNode.put("name", "Molson");
            tagsNode.add(tagNode);
            rootNode.set("tags", tagsNode);

            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
            System.out.println(json);
        }
    }

