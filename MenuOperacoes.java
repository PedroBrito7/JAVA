import java.util.Scanner;

public class MenuOperacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc;

        System.out.println("Digite uma opção:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Sair");

        opc = sc.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Você escolheu soma!");
                break;
            case 2:
                System.out.println("Você escolheu subtração!");
                break;
            case 3:
                System.out.println("Você escolheu multiplicação!");
                break;
            case 4:
                System.out.println("Você escolheu divisão!");
                break;
            case 5:
                System.out.println("Obrigado por usar nosso programa!");
                break;
            default:
                System.out.println("Você digitou uma opção inválida.");
        }

        sc.close();
    }
}
