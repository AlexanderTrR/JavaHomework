package builder;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC").setHasBike(false).setHasBike(true).build();
    }
}
