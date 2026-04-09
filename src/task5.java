import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]=sc.nextInt();
        }
        task5 ex5=new task5();
        System.out.println("no 1 or 3 : "+ ex5.no14(nums));
    }
    public boolean no14(int[] nums){
        boolean has1=false;
        boolean has4=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                has1=true;
            } else if (nums[i]==4) {
                has4=true;
            }
        }
        return !(has1 && has4);
    }
}
