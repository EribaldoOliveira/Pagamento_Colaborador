import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Colaborador f1,f2;
		
		f1 = new Colaborador();
		f2 = new Colaborador();
		
		System.out.println("Dados do Colaborador 1: ");
		f1.nome = sc.next();
		f1.valorPorHora = sc.nextDouble();
		f1.quantidadehoras  = sc.nextInt();
		
		System.out.println("Dados do Colaborador 2: ");
		f2.nome = sc.next();
		f2.valorPorHora = sc.nextDouble();
		f2.quantidadehoras  = sc.nextInt();
		
		double totalf1 = f1.total();
		double totalf2 = f2.total();
		
		double totalGeral = f1.total() + f2.total();
		
		System.out.println();
		System.out.println("***************************");
		System.out.printf("Total_Colaborador 1: %.2f%n", totalf1);
		System.out.printf("Total_Colaborador 2: %.2f%n", totalf2);
		
		System.out.println();
		
		System.out.printf("     TotalGeral = %.2f%n", totalGeral);
		
		sc.close();
		
		
	}

}
