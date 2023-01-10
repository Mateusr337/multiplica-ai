import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Insira um número inteiro: ");
            int number = scanner.nextInt();

            System.out.println("Tabela de multiplicação de " + number);
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " * " + number + " = " + number * i);
            }

        } catch (Exception error) {
            System.out.println("Algum erro ocorreu. Tente novamente!");
        }
    }
}
