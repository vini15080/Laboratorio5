
public class Principal {

	private static DaoProfessor daoProfessor;
	
	public static void main(String[] args) {
	
		daoProfessor = new DaoProfessor();
		
		daoProfessor.get(1);

	}

}
