import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        System.out.println("Selecione um dia da semana a partir de 2-8 sendo 2 segunda-feira.");
        Scanner scanner = new Scanner(System.in);
        int diaDasemana = scanner.nextInt();

        switch (diaDasemana){
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            case 8:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Você digitou errado.");
                break;






        }
    }
}
