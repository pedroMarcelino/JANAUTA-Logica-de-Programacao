import java.util.ArrayList;
import java.util.List;

public class estudoArryList {
    public static void main(String[] args) {
        List<String> listaDeCompra = new ArrayList<>();

        listaDeCompra.add("Pao");
        listaDeCompra.add("Alface");
        listaDeCompra.add("Creme de leite");

        listaDeCompra.add(2, "Elefante");

        for(String item : listaDeCompra){
            System.out.println(item);
        }

        String item3 = listaDeCompra.get(3);
        System.out.println(item3);

        boolean isEmpty = listaDeCompra.isEmpty();
        int tamanho = listaDeCompra.size();
        boolean contem = listaDeCompra.contains("arroz");

        System.out.println(isEmpty + " " +  tamanho + " " + contem);

//        listaDeCompra.clear();
//        listaDeCompra.remove("arroz");
//        System.out.println(listaDeCompra);

        listaDeCompra.forEach(produto -> System.out.println(produto));


    }
}
