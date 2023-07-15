import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String args[]){

        Map<Employee,String> myMap = new HashMap<>();
        Employee employee = new Employee("Pranay",23);
        Employee employee1 = new Employee("Pranby",23);

        myMap.put(employee,"ABC");
        myMap.put(new Employee("Kumar",24),"DEF");
        myMap.put(new Employee("Karthik",21),"XYZ");
        System.out.println(myMap);
       // System.out.println(employee.hashCode() + " " + employee1.hashCode() );
        myMap.remove(employee.hashCode());
        System.out.println(myMap);
    }
}
