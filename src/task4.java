import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class task4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();

        task4 ex4=new task4();
        System.out.print("fizz Array : ");
        System.out.print(Arrays.toString(ex4.fizzArray(arraySize)));
    }
    public int[] fizzArray(int n){
        int[] newArray=new int[n];
        for(int i=0;i<n;i++){
            newArray[i]=i;
        }
    return newArray;
    }
}
