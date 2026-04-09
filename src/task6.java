import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arrays size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers of first array:");
        int[] nums1=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums1[i]=sc.nextInt();
        }
        System.out.println("Enter " + arraySize + " numbers of second array:");
        int[] nums2=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums2[i]=sc.nextInt();
        }
        task6 ex6=new task6();
        System.out.println("match Up : "+ ex6.matchUp(nums1,nums2));
    }
    public int matchUp(int[] nums1,int[] nums2){
        int count=0;
        for(int i=0;i<nums2.length;i++){
            if (nums1[i]!=nums2[i] && Math.abs(nums1[i]-nums2[i])<=2){
                count++;
            }
        }
        return count;
    }
}
