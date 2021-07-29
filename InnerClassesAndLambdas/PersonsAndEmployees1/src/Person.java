import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;
    private Position position;


    protected class Position {
        String name;
        double salary;


        Position(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    public Person(String name, String date) {
        this.name = name;
        this.birthDate.parse(date);
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();

        Period p = Period.between(currentDate, this.birthDate);
        return p.getYears();
    }
}

















