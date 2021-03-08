package ifrn.com.gerenciadoreventos.model;

public class Aluno extends PublicoInterno {

	public Aluno(String cpf, String nome, String email, int telefone, Login login, String tipoParticipante,
			int matricula) {
		super(cpf, nome, email, telefone, login, tipoParticipante, matricula);
	}
	
}
