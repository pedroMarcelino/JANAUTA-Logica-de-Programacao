public class Variaveis {
    public static void main(String[] args) {
        String name = "Pedro Marcelino";
        int age = 24;
        double height = 1.79;
        boolean hasJob = true;
        char gender = 'm';

        System.out.println("Olá meu nome é: " + name + ", tenho " + age + " anos e possuo " + height + " de altura!" );
        System.out.println(name + " tem um emprego ? " + hasJob );
        System.out.println(name + " é do genero " + gender );

        if(hasJob){
            System.out.println(name + " tem um emprego");
        }else {
            System.out.println(name + " não tem um emprego");
        }


    }
}
