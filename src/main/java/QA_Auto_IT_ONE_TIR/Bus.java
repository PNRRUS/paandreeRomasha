package QA_Auto_IT_ONE_TIR;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Optional;


//Описание:
//
//        Есть список из остановок и времени стоянки на них.
//        Красный автобус едет по нечетным остановкам, а желтый - по четным, при этом каждый автобус
//        имеет список только своих остановок со временем стоянки на каждой.
//
//
//        Необходимо реализовать методы в классе Bus:
//        - getLongestStop(), который будет возвращать максимальное время стоянки на остановке
//        - getSumOfStopTime(), который будет возвращать суммарное время стоянок на всех остановках
//
//        Необходимо выполнить в методе main:
//        - создание красного и желтого автобуса с соответствующими только им остановками
class Bus {

    private final Map<Integer, Integer> stops;
    private String color = null;

    public Bus(Map<Integer, Integer> stops) {
        this.stops = stops;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Map<Integer, Integer> getStops() {
        return stops;
    }

    public Integer getLongestStop() {
        Optional<Integer> result = stops.values().stream().max(Comparator.comparing(Integer::valueOf));
        return result.isPresent() ? result.get() : null;
    }

    public Integer getSumOfStopTime() {
        Optional<Integer> result =  stops.values().stream().reduce(Integer::sum);
        return result.isPresent() ? result.get() : null;
    }
}

class Main {
    // вариант метода для окружения с поддержкой метода nextInt()
    // static Map<Integer, Integer> initStopMap() {
    //       Random random = new Random();
    //       Map<Integer, Integer> stopTime = new HashMap<>();
    //       IntStream.range(1, 9).forEach(index -> stopTime.put(index, random.nextInt(20, 60)));
    //       return stopTime;
    //   }

    static Map<Integer, Integer> initStopMap() {
        Map<Integer, Integer> stopTime = new HashMap<>();
        stopTime.put(1, 21);
        stopTime.put(2, 34);
        stopTime.put(3, 45);
        stopTime.put(4, 56);
        stopTime.put(5, 66);
        stopTime.put(6, 23);
        stopTime.put(7, 54);
        stopTime.put(8, 65);
        return stopTime;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> stopsMap = initStopMap();
        Bus yellowBus = new Bus(stopsMap.entrySet().stream().filter(e -> (e.getKey() % 2 == 0)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
        Bus redBus = new Bus(stopsMap.entrySet().stream().filter(e -> (e.getKey() % 2 == 1)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));

        Integer yellowMax = yellowBus.getLongestStop();
        Integer redMax = redBus.getLongestStop();
        Integer yellowSum = yellowBus.getSumOfStopTime();
        Integer redSum = redBus.getSumOfStopTime();
        boolean maxFlag = yellowMax >= redMax;
        boolean sumFlag = yellowSum >= redSum;

        System.out.printf(("""
                        Остановки желтого автобуса: %s
                        Самая долгая остановка желтого автобуса: %s
                        Сумма времен остановок желтого автобуса: %s
                        Остановки красного автобуса: %s
                        Самая долгая остановка красного автобуса: %s
                        Сумма времен остановок красного автобуса: %s
                        """),
                yellowBus.getStops(),
                yellowMax ,
                yellowSum ,
                redBus.getStops(),
                redMax ,
                redSum);

        System.out.printf("Самая долгая остановка из всех автобусов была у %s автобуса: %s%n", maxFlag ? "желтого" : "красного", maxFlag ? yellowMax : redMax);
        System.out.printf("Самая большая сумма времен остановок из всех автобусов была у %s автобуса: %s%n", sumFlag ? "желтого" : "красного", sumFlag ? yellowSum : redSum);     }
}