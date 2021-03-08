package ifrn.com.gerenciadoreventos.model;

public class PublicoInterno extends Participante{

	private int matricula;

	public PublicoInterno(String cpf, String nome, String email, int telefone, Login login, String tipoParticipante,
			int matricula) {
		super(cpf, nome, email, telefone, login, tipoParticipante);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}
