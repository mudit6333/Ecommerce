
// xor of same number is 0 and xor of 0 and any number is that number
public class Ques6 {
    public static void main(String[] args) {
        int[] arr={12,13,14,15,14,13,12};
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            result=result^arr[i];
        }
    System.out.println(result);
    }
}
