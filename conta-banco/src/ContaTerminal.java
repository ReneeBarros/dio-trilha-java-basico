import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-Vindo ao Conta Banco!");

        System.out.println("Vamos criar agora a sua conta, precisamos de algumas informações: ");

        System.out.println("Por favor, digite o número de sua conta !");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome !");
        String nome = scanner.next();

        //scanner.next();

        System.out.println("Por favor, digite o saldo !");
        BigDecimal saldo = scanner.nextBigDecimal();

        String contaCriada = "Olá ".concat(nome)+ 
        ", Obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia) + 
        ", conta " + conta + " e seu saldo " + saldo + " já está disponivel para saque.";
        scanner.close();

        System.out.println(contaCriada);

    }
}
