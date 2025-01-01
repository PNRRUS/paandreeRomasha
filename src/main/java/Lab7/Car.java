package Lab7;

public class Car implements Pushable{

    public double v_car; //объем багажника

    public Car(double v_car) {
        this.v_car = v_car;
    }

    @Override
    public String push(double v) {
        System.out.print("Вставить объем " + v + " л в багажник -  ");
        if (v <= v_car ) {return "возможно";}
        return "невозможно";
    }

    @Override
    public String toString() {
        return "Объем багажника: " + v_car + " л";
    }
}
