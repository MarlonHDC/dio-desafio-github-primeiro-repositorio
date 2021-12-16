public class EntradasSaidasJava {


    public static void main(String[] args) {
        // Algumas maneiras de formatar a saída
        String nomesaida = "Gustavo";
        float notasaida = 85.f;
        System.out.println("A nota é " + notasaida);
        System.out.printf("A nota de %s é %.4f \n", nomesaida, notasaida);
        System.out.format("A nota de %s é %.2f \n", nomesaida, notasaida);
    }
}
