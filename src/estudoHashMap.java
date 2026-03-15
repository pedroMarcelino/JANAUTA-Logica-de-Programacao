import java.util.HashMap;
import java.util.Map;

public class estudoHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> notasAlunos = new HashMap<>();
        notasAlunos.put("Alice", 9.9);
        notasAlunos.put("Pedro", 8.9);
        notasAlunos.put("Nicolle", 10.0);

        for (String nome : notasAlunos.keySet()) {
            double nota = notasAlunos.get(nome);
            System.out.println("aluno: " + nome + ", tem a nota : " + nota);

        }
//        System.out.println(notasAlunos.get("Alice"));

        for(Map.Entry<String, Double> nota: notasAlunos.entrySet()){
            String nome = nota.getKey();
            double valorNota = nota.getValue();

            System.out.println(nome + " : " + valorNota);
        }

    }
}
