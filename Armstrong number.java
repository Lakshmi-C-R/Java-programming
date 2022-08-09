import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter n:");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0,d;
        int temp=n;
        while (n!=0)
        {
            d=n%10;
            sum=sum+d*d*d;
            n=n/10;
        }
        if (sum==temp)
            System.out.println(temp+" is a armstrong number");
        else
            System.out.println(temp+" is not a armstrong number");
    }
}
