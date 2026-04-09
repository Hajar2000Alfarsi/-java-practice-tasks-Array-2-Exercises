import java.util.Arrays;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]=sc.nextInt();
        }
        task10 ex10=new task10();
        System.out.println("post 4 : "+ Arrays.toString(ex10.post4(nums)));
    }
    public int[] post4(int[] nums){
        int index=0;
        for (int i=nums.length-1;i>0;i--){
            if(nums[i]==4){
                index=i;
                break;
            }
        }
        int size=nums.length-index-1;
        int[] after4=new int[size];
        for (int i=0;i<size;i++){
            after4[i]=nums[index+1+i];
                        /*  nums[6]={2, 4, 1, 4, 3, 5}
                            index=3
                            size=6-3-1=2
                            i=0-->after4[0]=num[3+1+0]=num[4]-->3
                            i=1-->after4[1]=num[3+1+1]=num[5]-->5
                         */
        }
        return after4;
    }
}
