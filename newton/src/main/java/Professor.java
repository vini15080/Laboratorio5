import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	String matricula;
	String formacao;
	Date dataNasc;
	
	public Professor(Integer id, String matricula, String formacao, Date dataNasc) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.formacao = formacao;
		this.dataNasc = dataNasc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", matricula=" + matricula + ", formacao=" + formacao + ", dataNasc=" + dataNasc
				+ "]";
	}
	
	

}
