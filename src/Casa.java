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
        casa.pintar();
    }
}
