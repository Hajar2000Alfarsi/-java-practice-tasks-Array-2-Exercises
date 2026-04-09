import java.util.Arrays;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]=sc.nextInt();
        }
        task9 ex9=new task9();
        System.out.println("shift to left : "+ Arrays.toString(ex9.shiftLeft(nums)));
    }
    public int[] shiftLeft(int[] nums){
        int[] reverse=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            reverse[i]=nums[nums.length-1-i];
        }
        return reverse;
    }
}
