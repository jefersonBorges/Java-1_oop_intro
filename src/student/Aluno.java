package student;

public class Aluno {
	
	String nome;
	double media;
	
	//Construtor
	public Aluno() {
		
		
	}
	
	//Construtor
		public Aluno(String nome) {
			
			this.nome = nome;
			
		}
	//Método para exibição dos dados do objeto
	void exibeEstado(){
		
		System.out.println("Nome " + nome + " Média " + media);
		
	}
	
	
}
