package People;

import java.time.LocalDate;

public class Worker extends Person {
    private int salary;
    private int hourlyRate;
    private int hoursWorked;

    public Worker(String name, String lastname, LocalDate dob, int salary, int hoursWorked, int hourlyRate) {
        super(name, lastname, dob);
        this.salary = salary;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
//        Person.totalNumberOfPeople++;
        Person.peopleList.add(this);
    }

    public Worker(String name, String lastname, LocalDate dob) {
        super(name, lastname, dob);
        this.salary = 0;
        this.hoursWorked = 0;
        this.hourlyRate = 0;
//        Person.totalNumberOfPeople++;
        Person.peopleList.add(this);
    }

    public void printInfo() {
        System.out.println(this.getName() + " " + this.getLastname());
        System.out.println("current salary: " + this.salary);
        System.out.println("hourly rate: " + this.hourlyRate);
        System.out.println("hours worked: " + this.hoursWorked);
//        System.out.println("number of employess: " + Person.totalNumberOfPeople);

        System.out.println();
    }

    public void incrementToSalary() {
        if (this.salary < 500) {
            this.addToSalary(10);
        } else {
            System.out.println("Maximum salary reached");
        }
    }

    public void incrementHoursWorked(int hours) {
        if (this.hourlyRate > 0) {
            this.addToSalary(this.hourlyRate * hours);
            this.addToHoursWorked(hours);
        }
    }

    private void addToSalary(int salaryToAdd) {
        this.setSalary((this.salary + salaryToAdd));
    }

    private void addToHoursWorked(int hoursToAdd) {
        this.setHoursWorked((this.hoursWorked + hoursToAdd));
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
