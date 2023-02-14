package student;

public class App {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.exibeEstado();
		
		Aluno aluno2 = new Aluno("Jeferson");
		aluno2.exibeEstado();
	}

}
