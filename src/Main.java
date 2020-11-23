import java.util.*;

public class Main {

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
        System.out.print("Enter your option: ");
        option = sc.nextInt();
        return option;
    }


    public static void main(String[] args) {
        Employee dev = new Developer(1, "Valentin", "IT", 5);
        Employee dev2 = new Developer(2, "Irina", "Frontend", 4);
        Employee booker = new Accountant(3, "Olga", "Bookers", 9);

        //int grade = ((Developer)dev).getGrade();// Интерфейс не имеет метода getName, необходимо явное приведение
        // System.out.println(grade);

        HashMap<Integer, Employee> listEmployee = new HashMap<>();
        List<String> nameList = new ArrayList<>();///просто список Имен всех сотрудников
        listEmployee.put(1, dev);
        listEmployee.put(2, dev2);
        listEmployee.put(3, booker);


        for (Employee value : listEmployee.values()) {
            nameList.add(value.getName());
        }


        int op = 0;

        do {
            //Print menu
            mainMenu();
            //Get menu options
            op = getMenuOptions();

            switch (op) {
                case 1://Add
                    System.out.println("Add");
                    break;
                case 2://Print All
                    System.out.println("Print all employee");
                    //покажем имена всех сотрудников
                    printAllEmployee(nameList);
                    System.out.println("*****");
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

    public static void printAllEmployee(List<String> nameList) {

        for (String u : nameList) {
            System.out.println(u);
        }
    }
}
