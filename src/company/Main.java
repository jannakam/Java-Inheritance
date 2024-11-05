package company;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //create employees
        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");
        Director beatrice = new Director("Beatrice", "Sales", 60000, 100000);
        Engineer mike = new Engineer("Mike", "Procurement", 55000, "Computation");
        SalesPerson alice = new SalesPerson("Alice", "Sales", 45000, 130);

        //let's try adding skills to the engineer
        mike.setSkills("Simulation");
        mike.setSkills("Tinkering");

        // basic print
        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
        System.out.println(beatrice);
        System.out.println(mike);
        System.out.println(alice);

        // print with styling
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("| Welcome to the employee directory for company X!                                             |");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("| %8s | %15s | %10s | %50s | \n", "Employee", "Department", "Salary", "Extra");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("| %8s | %15s | %10.2f | %50s | \n", emily.getName(), emily.getDepartment(), emily.getSalary(), "");
        System.out.printf("| %8s | %15s | %10.2f | %50d | \n", john.getName(), john.getDepartment(), john.getSalary(), john.getTeamSize());
        System.out.printf("| %8s | %15s | %10.2f | %50s | \n", dave.getName(), dave.getDepartment(), dave.getSalary(), dave.getUniversity());
        System.out.printf("| %8s | %15s | %10.2f | %50.2f | \n", beatrice.getName(), beatrice.getDepartment(), beatrice.getSalary(), beatrice.getBudget());
        System.out.printf("| %8s | %15s | %10.2f | %50s | \n", mike.getName(), mike.getDepartment(), mike.getSalary(), mike.getSkills());
        System.out.printf("| %8s | %15s | %10.2f | %50d | \n", alice.getName(), alice.getDepartment(), alice.getSalary(), alice.getSalesTarget());
        System.out.println("------------------------------------------------------------------------------------------------");
    }
}