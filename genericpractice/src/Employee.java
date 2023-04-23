public class Employee implements Comparable<Employee> {
    private int point;

    public Employee(int point) {
        this.point = point;
    }

    @Override
    public int compareTo(Employee other) {
        return this.point - other.point;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "point=" + point +
                '}';
    }

    public int getPoint() {
        return point;
    }
}
