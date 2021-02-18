//Create 3 sub class of bank SBI,BOI,ICICI
// all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks
class Bank {
    public void getDetails() {
        System.out.println("Details of the bank :");
    }
}
class BOI extends Bank {
    public void getDetails() {
        System.out.println("====================================");
        System.out.println("Name: BOI");
        System.out.println("Interest Rate: 6%");
    }
}
class SBI extends Bank {
    public void getDetails() {
        System.out.println("====================================");
        System.out.println("Name: State Bank of India");
        System.out.println("Interest Rate: 7%");
    }
}
class ICICI extends Bank {
    public void getDetails() {
        System.out.println("====================================");
        System.out.println("Name: ICICI");
        System.out.println("Interest Rate: 9%");
    }
}

public class Ques11 {
    public static void main(String[] args) {
        Bank d = new Bank();
        Bank b = new BOI();
        Bank s = new SBI();
        Bank i = new ICICI();
        d.getDetails();
        b.getDetails();
        s.getDetails();
        i.getDetails();
    }
}
