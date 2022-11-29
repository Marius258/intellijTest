package People;

import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;

class Person {
    private final String name;
    private final String lastname;
    private final LocalDate dob;

    //    static int totalNumberOfPeople = 0;
    static LinkedList<Person> peopleList = new LinkedList<>();

    protected Person(String name, String lastname, LocalDate dob) {
        this.name = name;
        this.lastname = lastname;
        this.dob = dob;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.lastname);
    }

    private int getAge() {
        LocalDate currentDate = LocalDate.now();
        if (this.dob != null) {
            return Period.between(this.dob, currentDate).getYears();
        }
        return 0;
    }

    public void compareAge(Person person) {
        if (this.getAge() > person.getAge()) {
            System.out.println(this.name + " is older than " + person.getName());
        } else {
            System.out.println(person.name + " is older than " + this.name);
        }
    }

    public static void printAllPeople() {
        System.out.println("total number of people " + Person.peopleList.size());
        for (Person person : Person.peopleList) {
            System.out.println(person.toString());
        }
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "name: " + name + ", lastname: " + lastname;
    }

}
