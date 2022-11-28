package People;

import java.time.LocalDate;
import java.time.Period;

class Person {
    private String name;
    private String lastname;
    private LocalDate dob;

//    private LocalDate startOfEmployment = LocalDate.now();

    protected Person(String name, String lastname, LocalDate dob) {
        this.name = name;
        this.lastname = lastname;
        this.dob = dob;
    }

    public void getInfo()  {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
