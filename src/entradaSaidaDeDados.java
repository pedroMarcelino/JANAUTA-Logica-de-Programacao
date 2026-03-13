import java.util.Scanner;

public class entradaSaidaDeDados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ola digite seu nome: ");
        String name = scanner.nextLine();
        System.out.println("nome : " + name);

        System.out.println("Ola digite sua idade : ");
        int age = scanner.nextInt();
        System.out.println("Idade : " + age );

        System.out.println("Ola digite seu salario: ");
        double salary = scanner.nextDouble();
        System.out.println("salario : " + salary );
    }
}
