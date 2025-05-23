package HTTPTraining;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.Builder;
import lombok.Getter;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class JsonCreatorLombok {
    public static void main(String[] args) throws Exception {
        Tag[] tags1 = new Tag[3]; //тут я с размерностью массив создал
        tags1[0] = Tag.builder().id(100524).name("fluffy1").build();
        tags1[1] = Tag.builder().id(100525).name("fluffy2").build();
        tags1[2] = Tag.builder().id(100526).name("fluffy3").build();

        Tag[] tags = new Tag[]{
                Tag.builder().id(100521).name("fluffy").build(), //тут прям без размерности массив создается
                Tag.builder().id(100522).name("kind").build()
        };

        Pet pet = Pet.builder()
                .id(100519)
                .name("Molson")
                .status("available")
                .category(Category.builder()
                                .id(100520)
                                .name("Dog")
                                .build())
                .tags(tags1)
                .photoUrls(Arrays.asList("http://bild1.jpeg", "http://bild2.jpeg"))
                .build();

//      Этот код — стандартный способ преобразования Java-объектов в читаемый JSON с помощью Jackson.
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String json = mapper.writeValueAsString(pet);
        System.out.println(pet.toString());
        System.out.println(json);
        mapper.writeValue(new File("pet.json"), pet); // cохранить json в файл, чтобы потом послать в апи например

        String jsonContent = Files.readString(Paths.get("response.json"));
//      Преобразование JSON в объект

        try {
            // Преобразование JSON в объект
            Pet molsonFromJSON = mapper.readValue(jsonContent, Pet.class);
            System.out.println(molsonFromJSON.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

//                .PhotoUrls()
//
//        pet.setPhotoUrls(Arrays.asList("http://bild1.jpeg", "http://bild2.jpeg"));
//        Tag tag1 = new Tag();
//        tag1.setId(100521);
//        tag1.setName("fluffy");
//        Tag tag2 = new Tag();
//        tag2.setId(100522);
//        tag2.setName("kind");
//        pet.setTags(Arrays.asList(tag1, tag2));
//
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//        String json = mapper.writeValueAsString(pet);
//        System.out.println(json);