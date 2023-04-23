import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new List<>();
        list.add(new Employee(10)); //boxing
        Employee employee = list.get(0);
        System.out.println(employee.toString());

        Utils.printEmployee(employee);
        Utils.printEmployee(new Instructor(20));

        Utils.printEmployees(new List<Instructor>());


        List<Employee> employeeList = new List<>();
        employeeList.add(new Employee(1));
        employeeList.add(new Instructor(2));
        employeeList.add(new Employee(3));

        for (Object employee1 : employeeList){
            System.out.println(employee1);
        }
        Iterator iterator = employeeList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // System.out.println(Utils.max(new Employee(10) ));
    }
}
