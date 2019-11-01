package exemplo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Foto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "foto_id")
	private int id;

	private int largura;

	private int altura;

	@OneToOne
	@JoinColumn(name = "contato_id")
	private Contato contato;

	public Foto() {
	}

	public Foto(int largura, int altura, Contato contato) {
		this(0, largura, altura, contato);
	}

	public Foto(int id, int largura, int altura, Contato contato) {
		this.id = id;
		this.largura = largura;
		this.altura = altura;
		this.contato = contato;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Foto [id=" + id + ", largura=" + largura + ", altura=" + altura + "]";
	}
}
