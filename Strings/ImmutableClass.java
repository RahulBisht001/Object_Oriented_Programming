public class ImmutableClass {

    public static void main(String[] args) {

        Employee emp = new Employee("FLJPBFCC534");
        String number = emp.getPanNumber();
        System.out.println(number);

        System.out.println(emp);

    }
}

final class Employee {

    final String panNumber;

    public Employee(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public String toString() {
        return "Employee's PAN is :" + panNumber;
    }
}