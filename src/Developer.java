public class Developer implements Employee {
    private String name;
    String job;
    int id;
    private int grade;
    private double wage;

    public String getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

       @Override
    public double setWage(double input) {
        this.wage = input;
        return input;
    }


    public double getWage() {
        return wage;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Developer(int id, String name, String job, int grade) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.grade = grade;
    }

    @Override
    public int getGrade() {
        return grade;
    }

    @Override
    public void work() {
        System.out.println("Я работаю как гусь");
        writeCode();
        analyzeCode();
    }

    @Override
    public void coffeeTime() {

    }

    @Override
    public void print() {

    }

    public void analyzeCode() {
        int a = 1;
        int b = 2;
        System.out.println(a + b);
    }

    public void writeCode() {

    }
}
