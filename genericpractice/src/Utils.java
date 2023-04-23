public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) > 0) ? first : second;
    }

    public static <T extends Employee> void printEmployee(T employee) {
        System.out.println("employee's point is " + employee.getPoint());
    }
    //CAP#1 extend Object *****CAP#1 extend Employee
    public static void printEmployees(List<? extends Employee> employeeList) {
        Employee employee = employeeList.get(0);
//        Comparable o = employeeList.get(0);
//        System.out.println("printed");
    }
    public static void addEmployee(List<? super Employee> employees){
       employees.add(new Employee(10));
    }
}
