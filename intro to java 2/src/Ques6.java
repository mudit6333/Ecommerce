// WAP showing try, multi-catch and finally
public class Ques6 {
    public static void main(String args[]) {

        try {
            int b = 25 / 0;
        } catch (ArithmeticException e) {
            System.out.println("CATCH BLOCK1");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("CATCH BLOCK2");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("CATCH BLOCK3");
            System.out.println(e);
        } finally {
            System.out.println(" ");
            System.out.println("INSIDE FINALLY");
        }
    }
}
