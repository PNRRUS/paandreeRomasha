package Lab7;

/*
Сделать сумку и пакет, в которые можно положить некую сущность
Т.к. класть можно не только в сумку и пакет, но и в автомобиль, ящик, карман и т.п., сделать интерфейс
Если «объем» объекта меньше объема пакета, то «положить» и вернуть true, иначе вернуть «false»
Если вы хотите, чтобы вас можно было положить в сумку и пакет, вам нужно предоставить возможность определить ваш объем

 */

public class Lab7 {

    public static void main(String[] args) {

        Bag bag1 = new Bag(2.5);
        Packet packet1 = new Packet(1.2);
        Car volvo = new Car(50);


        System.out.println(bag1);
        System.out.println(bag1.push(1));
        System.out.println();

        System.out.println(packet1);
        System.out.println(packet1.push(3));
        System.out.println();

        System.out.println(volvo);
        System.out.println(volvo.push(40));
    }


}
