//Use Synchronize method to enable synchronization
// between multiple threads trying to access method at same time.

class Table {
    synchronized void printTable(int n) {
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

class MyThread10 extends Thread {
    int num;
    Table obj;

    MyThread10(Table obj, int num) {
        this.num = num;
        this.obj = obj;
    }

    public void run() {
        obj.printTable(num);
    }

}

public class Ques10 {
    public static void main(String args[]) {
        Table obj = new Table();
        MyThread10 t1 = new MyThread10(obj, 5);
        MyThread10 t2 = new MyThread10(obj, 10);
        t1.start();
        t2.start();
    }
}