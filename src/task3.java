import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]=sc.nextInt();
        }
        task3 ex3=new task3();
        System.out.println("lucky 1 or 3 : "+ ex3.lucky13(nums));
    }
    public boolean lucky13(int[] nums){
       // boolean result=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1 || nums[i]==3){
                return false;
            }
        }
        return true;
    }
}
