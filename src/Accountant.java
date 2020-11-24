import java.util.HashMap;

public class Accountant implements Employee {
    private String name;
    String job;
    int id;
    private int grade;
    private double wage;

    public Accountant(int id, String name, String job, int grade) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.grade = grade;
    }

   static void giveSalary(HashMap<Integer, Employee> employee) {

        for (Employee value : employee.values()) {
            if (value.getGrade() == 5) {
                value.setWage(50000);
            } else if (value.getGrade() == 4) {
                value.setWage(40000);
            } else if (value.getGrade() == 9) {
                value.setWage(90000);
            }
            System.out.println(value.getName() + " Начислена зарплата с учетом Грэйда: " + value.getWage());
        }
    }

    @Override
    public int getGrade() {
        return grade;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setWage(double input) {
        this.wage= input;
    }

    @Override
    public double getWage() {
       return wage;
    }
    @Override
    public String getJob() {
        return job;
    }

    @Override
    public void work() {
    }

    @Override
    public void coffeeTime() {
    }

    @Override
    public void print() {
    }
}
