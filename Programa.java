import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.GERMAN); // Usar Locale.GERMAN para inverter separadores
        Scanner sc = new Scanner(System.in);

        Colaborador f1, f2;

        f1 = new Colaborador();
        f2 = new Colaborador();

        // Função para adicionar formatação ANSI (negrito e sublinhado)
        String negritoSublinhado = "\u001B[1m\u001B[4m";
        String reset = "\u001B[0m"; // Resetar a formatação para padrão

        // Imprimir "Dados do Colaborador 1" em negrito e sublinhado
        System.out.println(negritoSublinhado + "Dados do Colaborador 1" + reset);
        System.out.println();
        System.out.print("Digite o nome: ");
        f1.nome = sc.next();

        System.out.print("Digite o valor por hora: ");
        f1.valorPorHora = sc.nextDouble();

        System.out.print("Digite a quantidade de horas: ");
        f1.quantidadeHoras = sc.nextInt();
        System.out.println();

        // Calcular e imprimir o total para o colaborador 1
        double totalf1 = f1.total();
        System.out.printf("Total_Colaborador 1: %s = %s%n", f1.nome, formatarMoeda(totalf1));

        // Imprimir "Dados do Colaborador 2" em negrito e sublinhado
        System.out.println();
        System.out.println(negritoSublinhado + "Dados do Colaborador 2" + reset);
        System.out.println();
        System.out.print("Digite o nome: ");
        f2.nome = sc.next();

        System.out.print("Digite o valor por hora: ");
        f2.valorPorHora = sc.nextDouble();

        System.out.print("Digite a quantidade de horas: ");
        f2.quantidadeHoras = sc.nextInt();
        System.out.println();

        // Calcular e imprimir o total para o colaborador 2
        double totalf2 = f2.total();
        System.out.printf("Total_Colaborador 2: %s = %s%n", f2.nome, formatarMoeda(totalf2));

        // Calcular o valor total geral
        double totalGeral = totalf1 + totalf2;

        System.out.println();
        //System.out.println("********************************************");
        System.out.println();
        System.out.println("============================================");
        
        
        
        // Formate os valores como moeda usando Locale.GERMAN para inverter separadores
        System.out.printf("Total_Colaborador 1: %s = %s%n", f1.nome, formatarMoeda(totalf1));
        System.out.printf("Total_Colaborador 2: %s = %s%n", f2.nome, formatarMoeda(totalf2));
        
        System.out.println();

        // Centralize os asteriscos com base no comprimento da linha de valores
        int tamanhoLinhaValores = String.format("Total_Colaborador 1: %s = %s%n", f1.nome, formatarMoeda(totalf1)).length();
        int tamanhoLinhaAsteriscos = 27; // Tamanho total da linha de asteriscos (incluindo os asteriscos)
        int espacosEsquerdaAsteriscos = (tamanhoLinhaValores - tamanhoLinhaAsteriscos) / 2;

        StringBuilder linhaAsteriscos = new StringBuilder();
        for (int i = 0; i < espacosEsquerdaAsteriscos; i++) {
            linhaAsteriscos.append(" ");
        }
        linhaAsteriscos.append("***********************");

        System.out.println(linhaAsteriscos.toString());

        // Formate o valor total geral como moeda
        System.out.printf("     TotalGeral = %s%n", formatarMoeda(totalGeral));

        sc.close();
    }

    // Método para formatar um valor como moeda com vírgula como separador decimal e ponto como separador de milhares
    private static String formatarMoeda(double valor) {
        return String.format(Locale.GERMAN, "R$ %,.2f", valor);
    }
}