package practice3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Cuong",21,"TN");
        Student s2 = new Student("Long",22,"HP");
        Student s3 = new Student("Huyen",19,"HN");
        Student s4 = new Student("Dung",20,"TB");

        List<Student> lists = new ArrayList<Student>();
        lists.add(s1);
        lists.add(s2);
        lists.add(s3);
        lists.add(s4);
        Collections.sort(lists);

        for (Student a: lists) {
            System.out.println(a);
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi");
        for (Student s: lists) {
            System.out.println(s);
        }


    }
}
