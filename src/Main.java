import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sıcaklık değerini giriniz: ");
        int sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Bugün kayak yapabilirsiniz.");
        } else if (sicaklik >= 5 && sicaklik < 15) {
            System.out.println("Bugün sinemaya gidebilirsiniz.");
        } else if (sicaklik >= 15 && sicaklik < 25) {
            System.out.println("Bugün piknik yapabilirsiniz.");
        } else {
            System.out.println("Bugün yüzmeye gidebilirsiniz.");
        }
    }
}