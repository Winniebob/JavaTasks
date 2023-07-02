package Task6;

import java.util.HashMap;
import java.util.Map;

public class Task {
    public static void main(String[] args) {
        Map<String,String> student = new HashMap<String,String>();
        student.put(" name "," Ivanov ");
        student.put(" country "," Russia ");
        student.put(" city "," Moscow ");
        student.put(" age "," null ");

        System.out.println(getQuery(student));

    }

    public static String getQuery(Map <String,String> student)
    {
        StringBuilder a = new StringBuilder();
        for (Map.Entry<String,String> pair : student.entrySet())
        {
            if (pair.getValue() != null)
            {
                a.append(pair.getKey() + " = " + pair.getValue() + " and ");
            }
        }
        a.delete(1,20);
        return a.toString();
    }
    
}
