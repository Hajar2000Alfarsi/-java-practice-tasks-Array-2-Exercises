import java.util.Arrays;
import java.util.Scanner;

public class task13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]=sc.nextInt();
        }
        task13 ex13=new task13();
        System.out.println("big diffrence : "+ ex13.bigDiff(nums));
    }

    public int bigDiff(int[] nums){
        int max=nums[0];
        int min=nums[0];
        for (int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            } else if (nums[i]<min) {
                min=nums[i];
            }
        }
        return max-min;
    }
}
