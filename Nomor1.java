import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai N: ");
        int N = scanner.nextInt();
        menampilkanDeret(N);
        scanner.close();
    }

    public static void menampilkanDeret(int n) {
        for (int i = 0; i <= n; i++) {
            if (i == 0){
                System.out.println(i);
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
