public class OperadoresAritimeticos {
    public static void main(String[] args) {
        double  pao = 7.00;
        double  queijo = 5.39;
        double  acucar = 4.90;

        double   desconto = 3.50;
        int qtdVezComprasMes = 28;

        double total =  pao + queijo + acucar;
        double totalDesc =  total - desconto;
        double totalDividido = total / 2;
        double totalMensal = total * qtdVezComprasMes;

        System.out.println("Sua compra deu: R$" + total);
        System.out.println("Sua compra com desconto é : R$" + totalDesc);
        System.out.println("Sua compra dividido para 2 pessoas é : R$" + totalDividido);
        System.out.println("Total gasto no mês é : R$ " + totalMensal);
    }
}
