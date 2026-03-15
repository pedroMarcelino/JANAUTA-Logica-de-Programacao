public class Array  {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        String[] frutas;

        frutas = new String[] {"maca", "Kiwi", "Banana"};
//
//        for (int cont = 0; cont < frutas.length; cont++){
//            System.out.println(frutas[cont]);
//        }

        for(String fruta : frutas){
            System.out.println(fruta);
        }
    }
}
