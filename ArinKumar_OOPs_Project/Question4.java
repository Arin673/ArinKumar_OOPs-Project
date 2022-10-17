import java.util.*;
public class Question4{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :-");
        int num = sc.nextInt();
        System.out.println("Enter the power :-");
        int power = sc.nextInt();
        System.out.println("Required solution is :- " +powerFunction(num, power));
    }
    public static int powerFunction(int num, int power){
        if(power == 0 || num == 1){
            return 1;
        }
        if(power == 1){
            return num;
        }
        if(power%2 == 0){
            return powerFunction(num*num, power/2);
        }
        return num*powerFunction(num, power - 1);
    }
}
