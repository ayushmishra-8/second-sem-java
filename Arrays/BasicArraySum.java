package Java.Arrays;

public class BasicArraySum {
public static void main(String[] args) {
    

    int number[]={10,20,30,40,50};
    int sum=0;
    for(int i=0;i<number.length;i++){
        sum= sum+number[i];
    }
    System.out.println("Sum is "+sum);
}
}
