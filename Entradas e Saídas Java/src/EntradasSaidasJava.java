import java.util.Scanner; // Comando criado automaticamente clicando em "Scanner" e importando a biblioteca.

public class EntradasSaidasJava {


    public static void main(String[] args) {
        // Algumas maneiras de formatar a saída
        String nomesaida = "Gustavo";
        float notasaida = 85.f;
        System.out.println("A nota é " + notasaida);
        System.out.printf("A nota de %s é %.4f \n", nomesaida, notasaida); // O parâmetro "%s" refere-se a String "nomesaida"...
        System.out.format("A nota de %s é %.2f \n", nomesaida, notasaida); // O parâmetro "%.4f" refere-se ao número de casas decimais;

        // Algumas maneiras de formatar as entradas no Scanner util system
        Scanner teclado = new Scanner(System.in);   // Este comando força a importação da biblioteca classe "JAVA.util.scanner";
        System.out.print("\nDigite o nome do aluno: "); // Na biblioteca de Scanner os parâmetros na entrada...
        String nomeentrada = teclado.nextLine();
        System.out.print("Digite a nota do aluno: "); //... não precisa criar os parâmetros primitivos antes, estes são criados quando digitados;
        Float notaentrada = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f \n" , nomeentrada, notaentrada);

        System.out.println( "Fim do programa.");

    }
}
