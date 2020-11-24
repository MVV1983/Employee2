import java.util.*;

public class Main {

    static HashMap<Integer, Employee> listEmployee = new HashMap<>();
    static List<String> nameList = new ArrayList<>();///просто список Имен всех сотрудников
    static int personalNumber = 0;


    //Create Main menu
    public static void mainMenu() {
        System.out.println("Employee Application");
        System.out.println("********************");
        System.out.println("1: Add employee");
        System.out.println("2: Print All Amployee");
        System.out.println("3: Print all salary for employee");
        System.out.println("4: Exit");
    }

    //Create method to get Menu Option
    public static int getMenuOptions() {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  PIN: ");
        option = sc.nextInt();
        return option;
    }


    public static void main(String[] args) {
        //Employee dev = new Developer(1, "Valentin", "IT", 5);
        //Employee dev2 = new Developer(2, "Irina", "Frontend", 4);
        //Employee booker = new Accountant(3, "Olga", "Bookers", 9);

        //int grade = ((Developer)dev).getGrade();// Интерфейс не имеет метода getName, необходимо явное приведение
        // System.out.println(grade);

        //HashMap<Integer, Employee> listEmployee = new HashMap<>();
        //List<String> nameList = new ArrayList<>();///просто список Имен всех сотрудников
        //listEmployee.put(1, dev);
        //listEmployee.put(2, dev2);
        //listEmployee.put(3, booker);

        //for (Employee value : listEmployee.values()) {
        //    nameList.add(value.getName());
        //}

        int op = 0;

        do {
            //Print menu
            mainMenu();
            //Get menu options
            op = getMenuOptions();
            int personalId = 0;

            switch (op) {
                case 1://Add
                    System.out.println("********************");

                    String nameEmployee = getParam("Enter name Employee: ");
                    String job = getParam("Enter name job: ");
                    personalId++;

                    createEmployee(personalId, nameEmployee, job);

                    //for (Employee value : listEmployee.values()) {
                    //   nameList.add(value.getName());
                    //}

                    System.out.println("********************");
                    break;
                case 2://Print All
                    System.out.println("Print all employee");
                    System.out.println("********************");
                    //покажем имена всех сотрудников
                    printAllEmployee();//printAllEmployee(nameList);
                    System.out.println("********************");
                    break;
                case 3://Print salary
                    System.out.println("Print salary");
                    System.out.println("********************");
                    //начислить зарплату бухгалтером всем сотрудникам в соответствии с их грэйдом
                    Accountant.giveSalary(listEmployee);
                    System.out.println("********************");
                    break;
                case 4://Exit
                    System.out.println("System exit");
                    break;
                default:
                    System.out.println("INPUT ERROR");
            }

        }
        while (op != 4);//Exit application if press 4

    }

    public static void printAllEmployee() { //(List<String> nameList)

        if (listEmployee.size() != 0) {
            for (Employee unit : listEmployee.values())
                unit.print();
        } else {
            System.out.println("Лист сотрудников пуст");
        }
    }

    public static void createEmployee(int id, String name, String job) {
        System.out.println("Выберите подразделение сотрудника " + "\n" + " 1: Developer;2: IT;3: Job;4: Exit");
        int jobClass = 0;
        int employeeClass = 0;
        do {
            jobClass = getMenuOptions();
            switch (jobClass) {
                case 1:

                    Employee dev = new Developer(id, name, job, 5);
                    //dev.print();
                    createMapEmployee(dev);
                    System.out.println("4: Exit");
                    break;
                case 2:

                    System.out.println("4: Exit");
                    break;
                case 3:
                    Employee booker = new Accountant(id, name, job, 9);
                    createMapEmployee(booker);
                    System.out.println("4: Exits");
                    break;
                case 4://Exit
                    System.out.println("System exit");
                    break;
                default:
                    System.out.println("INPUT ERROR");
            }
        }

        while (jobClass != 4);

    }

    public static void createMapEmployee(Employee employee) {

        listEmployee.put(personalNumber, employee);
        personalNumber++;
        //for (Employee value : listEmployee.values()) {
        //    System.out.println(value.getName()+" "+value.getGrade());
        //}
    }

    public static String getParam(String input) {

        String option;
        Scanner sc = new Scanner(System.in);
        System.out.print(input);
        option = sc.nextLine();

        return option;
    }
}
