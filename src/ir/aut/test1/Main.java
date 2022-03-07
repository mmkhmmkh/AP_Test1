package ir.aut.test1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<String> arr = new ArrayList<>();

        arr.add("A abc");
        arr.add("B abc");
        arr.add("C abc");
        arr.add("D abc");
        arr.add("E abc");
        arr.add("F abc");

        Iterator<String> it = arr.iterator();
        while(it.hasNext()) {
            String a = it.next();
            if (a.contains("C")) {
                it.remove();
            }
        }

        System.out.println(arr);


//        Student std1 = new Student("Mahdi", "Khancherli", "1234567");
//        Student std2 = new Student("Mohammad", "Noormohammadi", "7654321");
//
//        std1.setGrade(15);
//        std2.setGrade(20);
//
//        System.out.println(std1);
//        System.out.println(std2);
//
//        Lab lab = new Lab("MMKH", "Monday", 3);
//
//        lab.enrollStudent(std1);
//        lab.enrollStudent(std2);
//
//        lab.printLabInfo();
    }
}
