package timeclass;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        System.out.println("Adja meg az első időpontot - óra: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        System.out.println("Adja meg az első időpontot - perc: ");
        int minutes = scanner.nextInt();
        System.out.println("Adja meg az első időpontot - másodpercperc: ");
        int seconds = scanner.nextInt();

        Time time = new Time(hours, minutes, seconds);
        System.out.println("Az első időpont: " + (time.toString()) + "=" + (time.getInMinutes()));

        System.out.println("Adja meg az első időpontot - óra: ");
        int hours2 = scanner.nextInt();
        System.out.println("Adja meg az első időpontot - perc: ");
        int minutes2 = scanner.nextInt();
        System.out.println("Adja meg az első időpontot - másodpercperc: ");
        int seconds2 = scanner.nextInt();


        Time newTime = new Time(hours2, minutes2, seconds2);
        System.out.println("A második időpont: " + (newTime.toString()) + "=" + (newTime.getInSecond()));

        System.out.println(time.earlierThan(newTime));
    }

}

    //Az első időpont 12:3:43 = 723 perc
    //A második időpont 4:21:38 = 15698 másodperc
    // Az első korábbi, mint a második: false