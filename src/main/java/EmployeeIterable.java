import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmployeeIterable {

    private List<Worker> lw;
    private List<Freelancer> lf;

    public List<Worker> addToWorkers(int count) {
        lw = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            lw.add(new Worker());
        }
        return lw;
    }

    public List<Freelancer> addToFreelancers(int count) {
        lf = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            lf.add(new Freelancer());
        }
        return lf;
    }

    public void iterateEmployees(Collection<? extends Employee> employees) {
        for (Employee employee :
                employees) {
            System.out.println(employee);
        }
    }
}
