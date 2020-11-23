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
        double wage = 0;
        for (Employee value : employee.values()) {
            if (value.getGrade() == 5) {
                wage = 50000;
                value.setWage();
            } else if (value.getGrade() == 4) {
                wage = 40000;
                value.setWage();
            } else if (value.getGrade() == 9) {
                wage = 90000;
                value.setWage();
            }
            System.out.println(value.getName() + " Начислена зарплата с учетом Грэйда: " + wage);
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
    public double setWage() {
        return 0;
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