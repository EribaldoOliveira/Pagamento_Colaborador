
public class Colaborador {
	public String nome;
	public Double valorPorHora;
	public int quantidadeHoras;
	
	public double total() {
		return valorPorHora * quantidadeHoras;
	}
}
