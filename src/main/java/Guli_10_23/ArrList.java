package Guli_10_23;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Bildings.*;
public class ArrList {

           public static void main(String[] args) {

               List<Map<String, Object>> listOfMaps = new ArrayList<>();

// Добавление элементов:
               Map<String, Object> row1 = new HashMap<>();
               row1.put("id", 1);
               row1.put("name", "Alice");
               row1.put("age", 25);

               Map<String, Object> row2 = new HashMap<>();
               row2.put("id", 2);
               row2.put("name", "Bob");
               row2.put("age", 30);

               listOfMaps.add(row1);
               listOfMaps.add(row2);

               Map<String, Object> firstRow = listOfMaps.get(0);  // Получаем первую "строку"
               String name = (String) firstRow.get("name");      // "Alice"
               int age = (int) firstRow.get("age");              // 25

               for (Map<String, Object> row : listOfMaps) {
                   System.out.println(
                           "ID: " + row.get("id") +
                                   ", Name: " + row.get("name") +
                                   ", Age: " + row.get("age")
                   );
               }



            ArrayList<String> people = new ArrayList<String>();
            // добавим в список ряд элементов
            people.add("Tom");
            people.add("Alice");
            people.add("Kate");
            people.add("Sam");
            people.add("Roma");
            people.add("Peter");

               ArrayList diff_objects = new ArrayList();
               diff_objects.add(1);
               diff_objects.add("asd");
               University lomonosova = new University();
               lomonosova.setFieldIsThereADormNearby(true);
               lomonosova.setNumbersOfUniversity(2);
               lomonosova.setWhatStudy("Higher mathematics");
               lomonosova.setNumberOfStudents(2000);
               lomonosova.setNumberOfPersonInGroup(20);
               lomonosova.setNumberOfStudyYears(5);
               diff_objects.add(lomonosova);

               Library pushinskaya = new Library();
               pushinskaya.isWarAndPeace = true;
               pushinskaya.numberOfBooks = 900;
               pushinskaya.numberOfbooksAWeek = 20;
               pushinskaya.numberOfFamilyMembers = 15;
               diff_objects.add(pushinskaya);

               for(Object person : diff_objects){
                   System.out.println(person);
               }


            //people.add(1, "Bob"); // добавляем элемент по индексу 1

            //System.out.println(people.get(1));// получаем 2-й объект
            //people.set(1, "Robert"); // установка нового значения для 2-го объекта

//            System.out.printf("ArrayList has %d elements \n", people.size());
//            for(String person : people){
//
//                System.out.println(person);
//            }
//            // проверяем наличие элемента
//            if(people.contains("Tom")){
//
//                System.out.println("ArrayList contains Tom");
//            }

            // удалим несколько объектов
            // удаление конкретного элемента
            //people.remove("Robert");
            // удаление по индексу
            //people.remove(3);
            people.add(3, "Bob"); // добавляем элемент по индексу 3

               people.add("Pavel");

//            Object[] peopleArray = people.toArray();
//            for(Object person : peopleArray){
//
//                System.out.println(person);
//            }
               System.out.println(people.size());
               people.add("Kaneki");
               System.out.println(people.size());


               //Object[] peopleArray2 = people.toArray();
               for(String person : people){
                   System.out.println(person);
               }

               String[] beatles = {"John", "Paul", "Ringo", "George"};

               for (String person: beatles) {
                   System.out.println(person);
               }
int counter = 0;
               int[] arr = {5, 5, 8, 4, 7, 4, 5};
               for (int garonimo: arr) {
                   System.out.println(garonimo);
                    counter += garonimo;

               }
               System.out.println(counter);
             System.out.println((double)Math.round((double)counter/arr.length * 100)/100);



        }

    public interface CanFly {
        boolean canFly();

        void fly();
    }
    }

