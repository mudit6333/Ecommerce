//Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
enum Mobile {
    Samsung(2000), Apple(50000), Nokia(16000), Xiaomi(1000);
     final int price;

     Mobile(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
public class Ques9 {
    public static void main(String[] args) {
        Mobile[] mobile = Mobile.values();
        for (Mobile m : mobile) {
            System.out.println("price of " + m + " :" + m.getPrice());
        }
    }
}
