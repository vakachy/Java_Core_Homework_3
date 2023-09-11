
/**
 * TODO: Доработать в рамках домашней работы
 */


import java.util.ArrayList;
import java.util.List;

public class Freelancer extends Employee {

    //region Fields
    private double MEAN_WORK_HOURS_PER_MONTHS = 20.8;
    private double WORK_HOURS_PER_DAY = 8;
    private double HOURLY_WAGES_SET = random.nextDouble(500.0, 1500.50);

    //endregion

    //region Constructors & Methods
    protected Freelancer(String surName, String name, double salary) {
        super(surName, name, salary);
    }

    protected Freelancer() {
        super();
    }

    public Employee instatiateFreelancer(Freelancer f) {
        f.setName(surNames[random.nextInt(surNames.length)]);
        f.setSurName(names[random.nextInt(surNames.length)]);
        f.setSalary(f.calculateSalary());
        return f;
    }

    public static List<Employee> getFreelancers(int count) {
        List<Freelancer> freelancers = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < count; i++) freelancers.add(new Freelancer());

        for (int j = 0; j < count; j++) {
            Freelancer f = freelancers.get(j);
            f.instatiateFreelancer(f);
            employees.add(f);
        }
        return employees;
    }

    @Override
    public double calculateSalary() {
        salary = this.MEAN_WORK_HOURS_PER_MONTHS * this.WORK_HOURS_PER_DAY * this.HOURLY_WAGES_SET;
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата (повременная месячная оплата, ставка %.2f): %.2f (руб.)",
                surName, name, HOURLY_WAGES_SET, salary);
    }

    public double getHOURLY_WAGES_SET(){
        return HOURLY_WAGES_SET;
    }
    //endregion
}
