import java.util.*;
public class Question5{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : -");
        int len = sc.nextInt();
        int nums[] = new int[len];
        System.out.println("Enter the elements of the array :-");
        for(int i = 0; i < len; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(largestNumber(nums));
    }
    public static String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) return "";
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = nums[i]+"";
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                String s1 = i+j;
                String s2 = j+i;
                return s1.compareTo(s2);
            }
        });
        if (strs[strs.length-1].charAt(0) == '0') return "0";
        String res = new String();
        for (int i = 0; i < strs.length; i++) {
            res = strs[i]+res;
        }
        return res;
    }
}
