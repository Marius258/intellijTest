import People.Worker;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Marius", "Kavaliauskas",
                LocalDate.of(1955, 9, 13), 490, 50, 5);

        Worker worker2 = new Worker("Jonas", "Jonauskas",
                LocalDate.of(1985, 12, 10));

        worker1.incrementHoursWorked(20);
        worker1.incrementToSalary();

        worker1.getInfo();

        worker2.setHourlyRate(10);

        worker1.incrementHoursWorked(8);
        worker2.incrementHoursWorked(5);

        worker1.getInfo();
        worker2.getInfo();

        worker1.compareAge(worker2);

    }
}