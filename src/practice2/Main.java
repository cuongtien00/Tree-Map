package practice2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Students s1 = new Students("Cuong",21,"TN");
        Students s2 = new Students("Long",22,"HP");
        Students s3 = new Students("Vinh",19,"Japan");
        Map<Integer, Students> studentsMap = new HashMap<Integer,Students>();
        studentsMap.put(1,s1);
        studentsMap.put(2,s2);
        studentsMap.put(3,s3);

        for (Map.Entry<Integer,Students> student:studentsMap.entrySet()) {
            System.out.println(student);
        }

        Set<Students> students = new HashSet<Students>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s1);

        for (Students student :students
             ) {
            System.out.println(student);

        }

    }
}
