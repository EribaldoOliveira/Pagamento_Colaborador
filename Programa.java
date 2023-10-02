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
		
		double total = f1.total() + f2.total();
		
		System.out.printf("Total = %.2f%n", total);
		
		sc.close();
		
		
	}

}
