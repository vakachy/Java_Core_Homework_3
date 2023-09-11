import java.util.Comparator;

public class EmployeeFullSort implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int surNames = e1.surName.compareTo(e2.surName);
        int names = e1.name.compareTo(e2.name);
        int wages = Double.compare(((Freelancer) e1).getHOURLY_WAGES_SET(), ((Freelancer) e2).getHOURLY_WAGES_SET());
        int salaries = Double.compare(e1.getSalary(), e2.getSalary());
        if (surNames == 0) return names;
        if (names == 0) return wages;
        if (wages == 0) return salaries;
        return surNames;
    }
}
