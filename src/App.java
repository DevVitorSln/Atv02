import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
 
        double numeroInformado;

        System.out.println("Informe o Número: ");
        numeroInformado = scanner.nextDouble();

        System.out.println("O número informado foi" + numeroInformado);

    }
}

//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].