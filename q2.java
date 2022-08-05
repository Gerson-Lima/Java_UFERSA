import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        float n1 = scan.nextFloat();
        System.out.println("Digite outro valor: ");
        float n2 = scan.nextFloat();
        System.out.println("Digite outro valor, de novo: ");
        float n3 = scan.nextFloat();

        System.out.println("A soma é: " + (n1+n2+n3));
        System.out.println("A média é: " + (n1 + n2 + n3) / 3);
        scan.close();
    }
}