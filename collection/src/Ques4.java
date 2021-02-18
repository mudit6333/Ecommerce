import java.util.*;

class Employees {
    Double age;
    Double salary;
    String name;

    Employees(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public String toString() {
        return this.age + " " + this.salary + " " + this.name;
    }
}

class sortbysalary implements Comparator<Employees> {
    public int compare(Employees e1, Employees e2) {
        return (int) (e1.salary - e2.salary);
    }
}

public class Ques4 {
    public static void main(String[] args) {

        ArrayList<Employees> aList = new ArrayList<Employees>();
        aList.add(new Employees(23.0, 40000.0, "Vinay"));
        aList.add(new Employees(27.5, 45000.0, "Vishal"));
        aList.add(new Employees(24.6, 35000.0, "Deepanshu"));
        aList.add(new Employees(25.0, 29000.0, "tyagi"));

        Collections.sort(aList, new sortbysalary());

        for (Employees emp : aList) {
            System.out.println(emp);
        }
    }
}