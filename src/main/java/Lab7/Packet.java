package Lab7;

public class Packet implements Pushable{
    private double VolumeOfPacket;

    public Packet(double volumeOfPacket) {
        VolumeOfPacket = volumeOfPacket;
    }

    @Override
    public String push(double v) {
        System.out.print("Вставить объем " + v + " л в пакет - ");
        if (v <= VolumeOfPacket ) {return "возможно";}
        return "невозможно";
    }

    @Override
    public String toString() {
        return "Объем пакета: " + VolumeOfPacket + " л";
    }
}
