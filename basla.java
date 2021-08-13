import java.util.Scanner;
public class basla {
    public static void main(String[] args) {
        double tutar,b;
        Scanner input= new Scanner(System.in);

        System.out.println("Toplam gidilen km: ");
        double a = input.nextDouble();
        System.out.println(a);
        b=(2.2*a)+10;
        tutar = (b>20) ? b : 20;
        System.out.println("Toplam tutar: ");
        System.out.println(tutar);
    }
}
