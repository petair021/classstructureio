package timeclass;

public class Time {
    private int hours;

    private int minutes;

    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Az elsőnek megadott időpont értékét percekben adja vissza, de a másodperceket figyelmen kívül hagyja.
    public int getInMinutes () {
        return (hours * 60 + minutes);
    }

    // A teljes időpontot másodpercben adja vissza
    public int getInSecond () {
        return ((hours * 60*60) + (minutes * 60) + seconds );
    }

    // A metódus paraméterként egy másik Time típusú objektumot kap.
    // Amennyiben az adott objektum által reprezentált időpont korábbi, mint a paraméterül kapott,
    // igazat ad vissza, különben hamisat.
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public boolean earlierThan(Time other){
        int first = this.getInSecond();
        int second = other.getInSecond();
        return first < second;
    }

}
