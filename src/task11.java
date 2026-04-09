import java.util.Arrays;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]=sc.nextInt();
        }
        task11 ex11=new task11();
        System.out.println("without 10 : "+ Arrays.toString(ex11.withoutTen(nums)));
    }

    public int[] withoutTen(int[] nums){
        int index=0;
        int[] without10=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=10){
                without10[index]=nums[i];
                index++;
            }
        }
        while(index<nums.length) {
            without10[index] = 0;
            index++;
        }
        return without10;
    }
}
