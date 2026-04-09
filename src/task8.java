import java.util.Scanner;

public class task8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        task8 ex8=new task8();
        System.out.println("mod of Three : "+ ex8.sameEnds(nums,n));
    }
    public boolean sameEnds(int[] nums,int n){
        for(int i=0;i<n;i++){
            if (nums[i]==nums[nums.length-n+i]){
                              // nums[5],n=2
                             // nums[0]==nums[5-2+0-->3]
                            // nums[1]==nums[5-2+1-->4]
                return true;
            }
        }
        return false;
    }
}
