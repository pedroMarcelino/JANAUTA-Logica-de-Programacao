public class estruturaIfElse {
    public static void main(String[] args) {
//        int idade = 40;
//
//        if(idade >= 18){
//            System.out.println("Você é maior de idade");
//        }else{
//            System.out.println("Você é menor de idade");
//        }




//        boolean estaChovendo = true;
//
//        if(!estaChovendo){
//            System.out.println("nao esta chovendo");
//        }else{
//            System.out.println("esta chovendo");
//        }

        boolean temDinheiro = false;
        boolean temCartao = false;

        if(temDinheiro && temCartao){
            System.out.println("Temos os 2, pede ifood e zeDelivery");
        } else if (temDinheiro || temCartao) {
            System.out.println("temos apenas 1, Pede ifood");
        }else {
            System.out.println("nao sobrou nada pro betinha, nao pede nada");
        }


    }
}
