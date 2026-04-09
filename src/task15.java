import java.util.Scanner;

public class task15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]=sc.nextInt();
        }
        task15 ex15=new task15();
        System.out.println("sum 2 8 : "+ ex15.sum28(nums));
    }
    public boolean sum28(int[] nums){
        int sum=0;
        for(int n:nums){
            if(n==2){
                sum += n;
            }
        }
        return sum==8;
    }
}
