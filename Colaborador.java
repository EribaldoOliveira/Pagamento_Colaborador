
public class Colaborador {
	public String nome;
	public Double valorPorHora;
	public int quantidadehoras;
	
	public double total() {
		return valorPorHora * quantidadehoras;
	}
}
