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
	//M�todo para exibi��o dos dados do objeto
	void exibeEstado(){
		
		System.out.println("Nome " + nome + " M�dia " + media);
		
	}
	
	
}
