public class conversaoTipos {
    public static void main(String[] args) {
        int num = 10;
        double d = num;

        double d2 = 10.93;
        int int2 = (int) d2;

        System.out.println(int2);

        Integer n1 = 100;
        String n1Converte = n1.toString();

        String n2 = "234";
        Integer n2Converte = Integer.parseInt(n2);

        System.out.println(n1Converte + "  " + n2Converte);

    }
}
