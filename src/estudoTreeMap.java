import java.util.Map;
import java.util.TreeMap;

public class estudoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> notasAlunos = new TreeMap<>();
        notasAlunos.put("Alice", 9.9);
        notasAlunos.put("Pedro", 8.9);
        notasAlunos.put("Nicolle", 10.0);

        for(Map.Entry<String, Double> nota: notasAlunos.entrySet()){
            String nome = nota.getKey();
            double valorNota = nota.getValue();

            System.out.println(nome + " : " + valorNota);
        }
    }
}
