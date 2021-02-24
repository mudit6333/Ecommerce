//Use Synchronize block to enable synchronization
// between multiple threads trying to access method at same time.

class TablePrint {
    void printTable(int n) {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class MyThread11 extends Thread {
    int num;
    TablePrint obj;

    MyThread11(TablePrint obj, int num) {
        this.num = num;
        this.obj = obj;
    }

    public void run() {
        obj.printTable(num);
    }

}

public class Ques11 {
    public static void main(String args[]) {
        TablePrint obj = new TablePrint();
        MyThread11 t1 = new MyThread11(obj, 5);
        MyThread11 t2 = new MyThread11(obj, 10);
        t1.start();
        t2.start();
    }
}