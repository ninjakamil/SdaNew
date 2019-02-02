package SdaNew;

import java.security.PrivateKey;
import java.util.*;

public class EmployeeService {

    private Map<Integer, Employee> employeeMap = new HashMap<>();
    private static int id = 123;

    public void add(Employee employee){
        employeeMap.put(id++,employee);
    }

    public List<Employee> find(Integer id){
        char[] parsedId = String.valueOf(id).toCharArray();
        List<Employee> findedEmployees = new ArrayList<>();
        List<Character> charId = new ArrayList<>();

        for(int i=0; i<parsedId.length;i++){
            charId.add(parsedId[i]);
        }

        for(Integer key: employeeMap.keySet()){
            char[] parsedKey = String.valueOf(key).toCharArray();

            List<Character> charKey = new ArrayList<>();
            for(int i=0; i<parsedKey.length;i++){
                charKey.add(parsedKey[i]);
            }

            Collections.sort(charId);
            Collections.sort(charKey);
            if(charId.equals(charKey)){
                findedEmployees.add(employeeMap.get(key));
            }
        }

        return findedEmployees;
    }
}
