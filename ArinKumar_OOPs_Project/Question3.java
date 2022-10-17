import java.util.*;
public class Question3{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : -");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the elements of the array :-");
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target :-");
        int target = sc.nextInt();
        twoSum(arr, len, target);
    }
    public static void twoSum(int[] arr, int len, int target){
        int ans[] = new int[2];
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                if((arr[i] + arr[j]) == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        System.out.println("Reuired solution is :- [" + ans[0] + "," + ans[1] + "]");
    }
}
