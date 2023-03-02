import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        double h, base;

        System.out.println("Digite o valor do lado da base do triângulo: ");
        base = x.nextDouble();
        System.out.println("Digite o valor da altura do triângulo");
        h = x.nextDouble();
        
        double area = (base*h)/2;

        System.out.println("O valor da área do triângulo é: " + area);
    }
}
