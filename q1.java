import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        int lado = scan.nextInt();
        System.out.println("O lado do quadrado é: " + lado*lado);
        scan.close();
    }
}