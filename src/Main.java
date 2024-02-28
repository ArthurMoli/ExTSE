import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.println(" Digite qual operação gostaria de fazer com os números ( + , - , * , /)");
        char operation = scanner.next().charAt(0);

        

        if ( operation == '+' ) {
            System.out.println("Resultado: " + ( n1 + n2 ) );
        }
            else if ( operation == '-' ) {
            System.out.println("Resultado: " + ( n1 - n2 ) );
        }
            else if ( operation == '*' ) {
            System.out.println("Resultado: " + ( n1 * n2 ) );
        }
            else if ( operation == '/' ) {
            System.out.println("Resultado: " + ( n1 / n2 ) );
        }

        scanner.close();
    }
}
