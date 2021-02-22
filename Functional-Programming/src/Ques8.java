// Implement multiple inheritance with default method inside  interface.
interface inter {
    default void interface1() {
        System.out.println("This is Default from interface");
    }
}

interface inter1 {
    default void interface2() {
        System.out.println("This is Default from interface1");
    }
}

public class Ques8 implements inter, inter1 {
    public static void main(String[] args) {
        Ques8 q = new Ques8();
        q.interface1();
        q.interface2();

    }
}