import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do {
            System.out.println("1.Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdrawel Money");
            System.out.println("4. Exit");
        } while (n!=4);
    }
}
