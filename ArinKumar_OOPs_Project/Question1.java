import java.util.*;
public class Question1{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
    public static boolean isPalindrome(String str, int start, int end) {
        if(start == end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        if(start < end + 1){
            isPalindrome(str, start + 1, end - 1);
        }
        return true;
    }
}
