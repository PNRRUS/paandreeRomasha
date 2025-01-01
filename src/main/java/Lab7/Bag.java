package Lab7;

public class Bag implements Pushable{
    private double VolumeOfBag;

    public Bag(double volumeOfBag) {
        VolumeOfBag = volumeOfBag;
    }

    @Override
    public String push(double v) {
                System.out.print("Вставить объем " + v + " л в сумку - ");
        if (v <= VolumeOfBag ) {return "возможно";}
        return "невозможно";
    }

    @Override
    public String toString() {
        return "Объем сумки: " + VolumeOfBag + " л";
    }
}
