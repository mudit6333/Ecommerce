import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ques1{
    public static void main(String[] args) {
        float sum=0f;
        List<Float> list = new LinkedList<Float>();
        list.add(560.8f);
        list.add(890.78f);
        list.add(300.9f);
        list.add(320.0f);
        list.add(810.6f);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            sum=sum+(float)itr.next();
        }
        System.out.println("Sum : "+sum);
    }
}