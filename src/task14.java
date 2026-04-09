import java.util.Scanner;

public class task14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]=sc.nextInt();
        }
        task14 ex14=new task14();
        System.out.println("sum 6 7 : "+ ex14.sum67(nums));
    }
    public int sum67(int[] nums){
        int sum=0;
        boolean skip = false;
        for (int n:nums){
            if(n==6){
                skip=true;
            }
            if(skip==false){
                sum += n;
            }
            if(n==7 && skip==true){
                skip = false;
            }
        }
        return sum;
    }
}
