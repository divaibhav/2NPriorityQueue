package implementation;

public class Employee implements Comparable<Employee> {
    int empid;
    String name;
    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
