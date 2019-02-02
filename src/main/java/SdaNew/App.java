package SdaNew;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        EmployeeService service = new EmployeeService();
        service.add(new Employee("Jan","Nowak"));
        service.add(new Employee("fasd","sdfg"));
        service.add(new Employee("fas","gsdfg"));
        service.add(new Employee("Jafn","gsdf"));
        service.add(new Employee("fasd","gfs"));
        service.add(new Employee("fasd","gsdf"));
        service.add(new Employee("asdf","fsg"));

        System.out.println(service.find(123));
        System.out.println(service.find(321));
        System.out.println(service.find(132));
    }
}
