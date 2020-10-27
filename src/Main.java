import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka", 15, 2, 1993);
        Person martin = new Person("Martin", 1, 3, 1955);

        System.out.println(martin.getName() + " age " + martin.age() + " years");
        System.out.println(pekka.getName() + " age " + pekka.age() + " years");

        System.out.println(martin.getName() + " is older than " + pekka.getName() + ": " + martin.olderThan(pekka));
        System.out.println(pekka.getName() + " is older than " + martin.getName() + ": " + pekka.olderThan(martin));
    }
}