package movies;

public class FilmesOnline {
	public static void main(String[] args) {
		
		//teste utilizando constutor ano correto
		Filme filme1 = new Filme("A múmia", "Brendan Fraser", 2021);
		System.out.println("O filme: " + filme1.getNomeFilme() 
							+ ", estrelado por " + filme1.getAtorPrincipal() 
							+ ", foi lançado em " + filme1.getAnoLancamento() + ".");
		//final teste utilizando constutor ano correto 
		
		//teste utilizando constutor ano errado
		Filme filme2 = new Filme("Matrix", "Keanu Reeves", 2022);
		System.out.println("O filme: " + filme2.getNomeFilme() 
							+ ", estrelado por " + filme2.getAtorPrincipal() 
							+ ", foi lançado em " + filme2.getAnoLancamento() + ".");
		//final teste utilizando constutor ano errado
		
		//teste setters ano correto
		
		Filme filme3 = new Filme();
		filme3.setNomeFilme("O Auto da Compadecida");
		filme3.setAtorPrincipal("Matheus Nachtergaele");
		filme3.setAnoLancamento(2000);
		
		System.out.println("O filme: " + filme3.getNomeFilme() 
		+ ", estrelado por " + filme3.getAtorPrincipal() 
		+ ", foi lançado em " + filme3.getAnoLancamento() + ".");
		
		//final teste setters ano correto
		
		//teste setters ano errado
		Filme filme4 = new Filme();
		filme4.setNomeFilme("Xeque-mate");
		filme4.setAtorPrincipal("Josh Hartnett");
		filme4.setAnoLancamento(2022);
		
		System.out.println("O filme: " + filme4.getNomeFilme() 
		+ ", estrelado por " + filme4.getAtorPrincipal() 
		+ ", foi lançado em " + filme4.getAnoLancamento() + ".");
		
		//final teste setters ano errado

	}
}
