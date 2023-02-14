package movies;

public class Filme {
	
	public Filme(String nomeFilme, String atorPrincipal, int anoLancamento) {
		
		this.nomeFilme = nomeFilme;
		this.atorPrincipal = atorPrincipal;
		if((anoLancamento<=2021) && (anoLancamento>=0)) {
			this.anoLancamento = anoLancamento;

		}else {
			this.anoLancamento = 0;
		}
		
	}
	
	public Filme() {
		
	}
	private String nomeFilme;
	private String atorPrincipal;
	private int anoLancamento;
	
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public String getAtorPrincipal() {
		return atorPrincipal;
	}
	public void setAtorPrincipal(String atorPrincipal) {
		this.atorPrincipal = atorPrincipal;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		
		if((anoLancamento<=2021) && (anoLancamento>=0)) {
			this.anoLancamento = anoLancamento;

		}else {
			this.anoLancamento = 0;
		}
	}

}
