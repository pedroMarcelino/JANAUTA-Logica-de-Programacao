package etapaContrucao;

public class plantaCasa {
    //atributos
    public int metragem;
    public int numQuartos;
    public int numBanheiros;
    public String cor;
    public String material;

    public void contruir(){
        System.out.println("Metragem: " + metragem );
        System.out.println("Numero de quartos: " + numQuartos );
        System.out.println("Numero de banheiros: " + numBanheiros);
        System.out.println("Material: " + material);
    }

    public void pintar () {
        System.out.println("Cor: " + cor);
    }

    public void mudarCorParede (String novaCor){
        cor = novaCor;
        pintar();
    }

    public int somarMetragem(){
        return metragem * numBanheiros + numQuartos;
    }

    public void alterarCaracteristicas (int metro, int quartos, int banheiro, String mat) {
        metragem = metro;
        numQuartos = quartos;
        numBanheiros = banheiro;
        material = mat;

        contruir();
    }
}
