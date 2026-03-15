public class plantaCasa {
    //atributos
    int metragem;
    int numQuartos;
    int numBanheiros;
    String cor;
    String material;

    public void contruir(){
        System.out.println("Metragem: " + metragem );
        System.out.println("Numero de quartos: " + numQuartos );
        System.out.println("Numero de banheiros: " + numBanheiros);
        System.out.println("Material: " + material);
    }

    public void pintar () {
        System.out.println("Cor: " + cor);
    }
}
