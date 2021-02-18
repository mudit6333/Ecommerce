//Write a program to sort the Student objects based on Score ,
// if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age

import java.util.*;

class Student {
    String name;
    double Age;
    double score;

    public Student(String name, double Age, double score) {
        this.name = name;
        this.Age = Age;
        this.score = score;
    }

    public String toString() {
        return "\n[Name=" + this.name + ", Age=" + this.Age + ", Score=" +
                this.score + "]";
    }
}

class ScoreandAgeComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        int flag = (int) (s1.score - s2.score);
        if (flag == 0) flag = s1.name.compareTo(s2.name);
        return flag;
    }
}

public class Ques5 {
    public static void main(String args[]) {
        List<Student> student = new ArrayList<Student>();

        student.add(new Student("aVinay", 23, 90.58));
        student.add(new Student("zVinay", 21, 80.56));
        student.add(new Student("dVinay", 20, 80.56));
        student.add(new Student("sVinay", 22, 80.56));
        student.add(new Student("rVinay", 30, 95.78));

        student.sort(new ScoreandAgeComparator());
        //Collections.sort(student, new ScoreandAgeComparator());
        System.out.println("Sorted Data : ");
        for (Student student1 : student) {
            System.out.println(student1);
        }
    }
}