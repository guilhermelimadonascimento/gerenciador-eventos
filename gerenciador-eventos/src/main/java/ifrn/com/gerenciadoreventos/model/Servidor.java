package ifrn.com.gerenciadoreventos.model;

public class Servidor extends PublicoInterno {

	public Servidor(String cpf, String nome, String email, int telefone, Login login, String tipoParticipante,
			int matricula) {
		super(cpf, nome, email, telefone, login, tipoParticipante, matricula);
	}
}
