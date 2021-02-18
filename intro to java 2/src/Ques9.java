import java.util.Scanner;

interface Furniture {
    void stressTest();

    void fireTest();
}

abstract class Chair implements Furniture {
    public abstract String chairType();
}

abstract class Table implements Furniture {
    public abstract String tableType();
}

class MetalChair extends Chair {
    public void stressTest() {
        System.out.println("Passed stress Test");
    }

    public void fireTest() {
        System.out.println("Passed fire Test");
    }

    public String chairType() {
        return "this is a metal chair";
    }
}

class MetalTable extends Table {
    public void stressTest() {
        System.out.println("Passed stress Test");
    }

    public void fireTest() {
        System.out.println("Passed fire Test");
    }

    public String tableType() {
        return "this is a metal table";
    }
}

class WoodenChair extends Chair {
    public void stressTest() {
        System.out.println("Failed stress Test");
    }

    public void fireTest() {
        System.out.println("Failed fire test");
    }

    public String chairType() {
        return "this is a wooden chair";
    }
}

class WoodenTable extends Table {
    public void stressTest() {
        System.out.println("Failed stress Test");
    }

    public void fireTest() {
        System.out.println("Failed fire test");
    }

    public String tableType() {
        return "this is a wooden table";
    }
}

public class Ques9 {
    public static void main(String[] args) {


        System.out.println("Enter what details do you want : ");
        System.out.println("1.For wooden table write 'woodentable' 2. For wooden chair write 'woodenchair' 3. For metal table write 'metaltable' 4. For metal chair write 'metalchair'");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        switch (str) {
            case "woodentable": {
                Table tb = new WoodenTable();
                System.out.println(tb.tableType());
                tb.stressTest();
                tb.fireTest();
                break;
            }
            case "metaltable": {
                Table tb = new MetalTable();
                System.out.println(tb.tableType());
                tb.stressTest();
                tb.fireTest();
                break;
            }
            case "woodenchair": {
                Chair c = new WoodenChair();
                System.out.println(c.chairType());
                c.stressTest();
                c.fireTest();
                break;
            }
            case "metalchair": {
                Chair c = new MetalChair();
                System.out.println(c.chairType());
                c.stressTest();
                c.fireTest();
                break;
            }
        }

    }
}

