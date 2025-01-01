package Bildings;

public class Library extends Bilding implements LivingHouse{
public int numberOfBooks;
public boolean isWarAndPeace;
public int numberOfbooksAWeek;
public int numberOfFamilyMembers;
    @Override
    public void display() {
       System.out.println(name + adress + architectorName + culturePlace + yearOfBuild + numberOfBooks + isWarAndPeace);
    }
    public String weeksToEnd(){
        String s = "количество книг: " + numberOfBooks + "\n" +
                " сколько книг забирают в неделю: " + numberOfbooksAWeek + "\n" +
                " cколько недель библиотека проживет: " +  numberOfBooks / numberOfbooksAWeek;
        System.out.println(s);
        return s;
    }

    @Override
    public String toString() {
        return "Library {" +
                "numberOfBooks = " + numberOfBooks + "\n" +
                ", isWarAndPeace = " + isWarAndPeace + "\n" +
                ", numberOfbooksAWeek = " + numberOfbooksAWeek +
                ", name ='" + name + '\'' +
                ", adress ='" + adress + '\'' +
                ", architectorName ='" + architectorName + '\'' +
                ", culturePlace =" + culturePlace +
                ", yearOfBuild=" + yearOfBuild +
                '}';
    }

    @Override
    public String pumPUpPump() {
        String g = "Я подкачал насос в библиотеке";
        System.out.println(g);
        return g;
    }

    @Override
    public String numberOfPersons() {
        String s = "Семейных людей посещающих библиотеку: " + numberOfFamilyMembers;
        System.out.println(s);
        return  s;
    }
}

