import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size(should be 3 or more): ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]=sc.nextInt();
        }
        task7 ex7=new task7();
        System.out.println("mod of Three : "+ ex7.modThree(nums));
    }
    public boolean modThree(int[] nums){
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0){
                return true;
            } else if (nums[i]%2!=0 && nums[i+1]%2!=0 && nums[i+2]%2!=0) {
                return true;
            }
        }
        return false;
    }
}
