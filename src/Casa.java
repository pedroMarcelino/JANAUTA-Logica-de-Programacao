import etapaContrucao.plantaCasa;

public class Casa {
    public static void main(String[] args) {
        //criando obejo casa

        plantaCasa casa = new plantaCasa();

        //inicializando os attributos ( variaveis ) ( caracteristicas) casa
        casa.numBanheiros = 2;
        casa.numQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Amarelo";

        casa.contruir();
        int metragem = casa.somarMetragem();
        System.out.println(metragem);
        casa.pintar();

        casa.mudarCorParede("verde");

        casa.alterarCaracteristicas(56, 3, 3, "Madeira");

        plantaCasa casaVizinho = new plantaCasa();

        casaVizinho.alterarCaracteristicas(96, 5, 4, "Granito");
        casaVizinho.mudarCorParede("Azul");
    }
}
