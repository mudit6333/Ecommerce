/*
Q7. Override the default method of the interface.
 */

interface InterfaceDefualtStatic {
    default void defaultMethod() {
        System.out.println("This is Default method!!!");
    }
}

public class Ques7 implements InterfaceDefualtStatic {

    public void defaultMethod() {
        System.out.println("This is Override Method");
    }

    public static void main(String[] args) {

        InterfaceDefualtStatic i1 = new Ques7();

        i1.defaultMethod();
    }
}