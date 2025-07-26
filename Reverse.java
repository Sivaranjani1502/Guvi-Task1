import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int number=scan.nextInt();
       int rev=0;
       while (number>0){
           rev=rev*10+number%10;
           number=number/10;
       }
       System.out.print("reversed number: "+rev);
    }
}
