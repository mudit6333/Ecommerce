//Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
class Demo {
    static {
        System.out.println("First name: Vinay ");
    }

    public static void getLastName() {
        System.out.println("Last name : Pratap");
    }

    public static int age = 21;
}

public class Ques7 {
    public static void main(String[] args) {
        Demo.getLastName();
        System.out.println("Age: " + Demo.age);
    }
}
