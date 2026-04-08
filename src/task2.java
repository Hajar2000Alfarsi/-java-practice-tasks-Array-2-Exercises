import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]=sc.nextInt();
        }
        task2 ex2=new task2();
        System.out.println("total : "+ ex2.sum13(nums));
    }
    public int sum13(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=13){
                sum += nums[i];
            }else{
                continue;
            }
        }
        return sum;
    }
}