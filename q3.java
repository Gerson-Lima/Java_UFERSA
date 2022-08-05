import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        double m;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor: ");

        m = scan.nextDouble();
        double rad = Math.toRadians(m);
        double sen = Math.sin(m);
        double cos = Math.cos(m);
        double tan = Math.tan(m);
        double acos = Math.acos(m);
        double sec = Math.asin(m);
        double cot = Math.atan(m);

        System.out.printf("rad: %.2g sen: %.2g cos: %.2g tan: %.2g acos: %.2g sec: %.2g cot: %.2g  ", rad, sen, cos, tan, acos, sec, cot);
        scan.close();
    }
}
