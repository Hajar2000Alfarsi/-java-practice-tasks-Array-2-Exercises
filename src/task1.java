import java.util.Scanner;

public class task1 {
    //task1
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize=sc.nextInt();
        int[] nums=new int[arraySize];
        System.out.println("Enter "+ arraySize + " numbers:");
        for(int i=0;i<arraySize;i++){
            nums[i]=sc.nextInt();
        }
        task1 ex1=new task1();
        System.out.print("Numbre of even numbers in array is: ");
        System.out.println(ex1.countEvens(nums));
    }
    public int countEvens(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
