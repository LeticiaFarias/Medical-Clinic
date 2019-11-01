package exemplo;

import java.util.List;

public interface ContatoDAO extends GenericDAO<Contato> {

	public List<Contato> findByNome(String nome);

	public List<Contato> findByParteDoNome(String nome);
}
