package ir.aut.test1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student std1 = new Student("Mahdi", "Khancherli", "1234567");
        Student std2 = new Student("Mohammad", "Noormohammadi", "7654321");

        std1.setGrade(15);
        std2.setGrade(20);

        System.out.println(std1);
        System.out.println(std2);

        Lab lab = new Lab("MMKH", "Monday", 3);

        lab.enrollStudent(std1);
        lab.enrollStudent(std2);

        lab.printLabInfo();
    }
}
