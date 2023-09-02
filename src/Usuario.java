public class Usuario {
    public static void main(String[] args) {


        SmartTv smartTv = new SmartTv ();

        System.out.println("A TV está ligada ? " + smartTv.ligada);
        System.out.println("Qual o canal ? " + smartTv.canal);
        System.out.println("Qual o volume da Tv ? " + smartTv.volume);


        smartTv.ligar();

        System.out.println("Novo status da TV -> a tv está ligada ? " + smartTv.ligada);
    }
}
