import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {
//region Lesson 3
        List<Employee> employees = Worker.getEmployees(15);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee);
        }
//endregion

//region Домашнее задание 1а и 1б
        List<Employee> freelancers = Freelancer.getFreelancers(30);
        for (Employee employee : freelancers) {
            System.out.println(employee);
        }
//endregion

//region Домашнее задание 1в
        Collections.sort(freelancers, new EmployeeFullSort());
        System.out.println();

        for (Employee freelancer : freelancers) {
            System.out.println(freelancer);
        }

        System.out.println();
        System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
//endregion

//region Домашнее задание 1г
        EmployeeIterable ei = new EmployeeIterable();


        ei.iterateEmployees(ei.addToWorkers(5));
        ei.iterateEmployees(ei.addToFreelancers(3));
    }
//endregion
}