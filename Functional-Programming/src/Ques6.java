

//Q6 Create and access default and static method of an interface.


interface Interface {

    default void defaultMethod() {
        System.out.println("This is Default method");
    }

    static void staticMethod() {
        System.out.println("This is Static method");
    }

}

public class Ques6 implements Interface {
    public static void main(String[] args) {
        Interface iFace = new Ques6();
        iFace.defaultMethod();
        Interface.staticMethod();
    }
}