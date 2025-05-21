package HTTPTraining;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonJsonToObject {

        public static void main(String[] args) {
            String json = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";

            ObjectMapper mapper = new ObjectMapper();
            try {
                // Преобразование JSON в объект
                Person person = mapper.readValue(json, Person.class);
                System.out.println(person.getName()); // John
                System.out.println(person.getCity()); // New York
                System.out.println(person.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class Person {
        private String name;
        private int age;
        private String city;



        // Геттеры и сеттеры
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
        public String getCity() { return city; }
        public void setCity(String city) { this.city = city; }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", city='" + city + '\'' +
                    '}';
        }

    }

