public class execucao {
    public static void main(String[] args) {
        Integer cpf = 456321987;
        String cpfConvertido = util.conversorString(cpf);
        System.out.println(cpfConvertido);

        int x = 78;
        int y = 34;

        int retSoma = util.somarInts(x, y);
        System.out.println(retSoma);

    }
}
