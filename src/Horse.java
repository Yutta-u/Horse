import java.util.Scanner;

public class Horse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); // a = 4
        int b = scan.nextInt(); // b = 4
        int a1 = scan.nextInt();
        int b1 = scan.nextInt();

        if ((a-1)==a1 && (b+2)==b1 || (a+1)==a1 && (b+2)==b1
                ||
           (a-2)==a1 && (b+1)==b1 || (a-2)==a1 && (b-1)==b1
                ||
           (a+2)==a1 && (b+1)==b1 || (a+2)==a1 && (b-1)==b1
                ||
           (a-1)==a1 && (b-2)==b1 || (a+1)==a1 && (b-2)==b1)
        {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
