package ir.aut.test1;

import java.util.ArrayList;
import java.util.List;

public class Lab {
    private final List<Student> students;
    private String teacherName;
    private String dayOfWeek;
    private int maxSize;
    private double avgGrade;


    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;

        this.students = new ArrayList<Student>();
    }

    public void enrollStudent(Student student) {
        if (students.size() + 1 <= this.maxSize)
            students.add(student);
    }

    public void calAvg() {
        setAvgGrade(0);
        for (Student student : students) {
            setAvgGrade(student.getGrade() + this.avgGrade);
        }
        setAvgGrade(this.avgGrade / students.size());
    }

    public void printLabInfo() {
        calAvg();
        StringBuilder sb = new StringBuilder();
        sb.append("TeacherName: ").append(this.teacherName).append("\n");
        sb.append("dayOfWeek: ").append(this.dayOfWeek).append("\n");
        sb.append("maxSize: ").append(this.teacherName).append("\n");
        sb.append("avgGrade: ").append(this.avgGrade).append("\n");
        sb.append("Students list: \n");

        for (Student student: students) {
            sb.append(student.toString()).append("\n");
        }

        System.out.println(sb);
    }

    public int getCurrentSize() {
        return students.size();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void setAvgGrade(double avgGrade) {
        if (avgGrade < 10)
            this.avgGrade = 10;
        else
            this.avgGrade = avgGrade;
    }

}
