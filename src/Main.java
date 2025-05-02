import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        System.out.println("*********************************");
        System.out.println("Bem vindo(a) ao ConsultaCep");
        System.out.println("*********************************");

        while (true) {
            try {
                System.out.println("\nDigite o cep que deseja buscar:");
                String cep = scanner.nextLine().trim();

                Endereco novoEndereco = new ConsultaCep().buscarCep(cep);
                System.out.println(novoEndereco);

                GerarArquivo gerarArquivo = new GerarArquivo();
                gerarArquivo.criarJson(novoEndereco);

                System.out.println("\nDeeseja consultar outro CEP? (s/n)");
                String resposta = scanner.nextLine();
                if (!resposta.equalsIgnoreCase("s")){
                    System.out.println("Aplicação finalizada.");
                    break;
                }
            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Aplicação finalizada.");
                break;
            }
        }
    }
}