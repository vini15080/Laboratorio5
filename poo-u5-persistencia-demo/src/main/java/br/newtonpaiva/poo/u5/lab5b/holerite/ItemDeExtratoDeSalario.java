package br.newtonpaiva.poo.u5.lab5b.holerite;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;

	@Entity
	@Table(name = "ItemDeExtratoDeSalario")
	public class ItemDeExtratoDeSalario {
		 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		 private Integer id;
		 private String cod;
		 private String descricao;
		 private String ref;
		 private Float valor;
		 
		 @OneToMany
		  private ExtratoDeSalario extratoDeSalario;

		public ItemDeExtratoDeSalario(Integer id, String cod, String descricao, String ref, Float valor,
				ExtratoDeSalario extratoDeSalario) {
			super();
			this.id = id;
			this.cod = cod;
			this.descricao = descricao;
			this.ref = ref;
			this.valor = valor;
			this.extratoDeSalario = extratoDeSalario;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getCod() {
			return cod;
		}

		public void setCod(String cod) {
			this.cod = cod;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getRef() {
			return ref;
		}

		public void setRef(String ref) {
			this.ref = ref;
		}

		public Float getValor() {
			return valor;
		}

		public void setValor(Float valor) {
			this.valor = valor;
		}

		public ExtratoDeSalario getExtratoDeSalario() {
			return extratoDeSalario;
		}

		public void setExtratoDeSalario(ExtratoDeSalario extratoDeSalario) {
			this.extratoDeSalario = extratoDeSalario;
		}

		@Override
		public String toString() {
			return "ItemDeExtratoDeSalario [id=" + id + ", cod=" + cod + ", descricao=" + descricao + ", ref=" + ref
					+ ", valor=" + valor + ", extratoDeSalario=" + extratoDeSalario + "]";
		}
		 
		 

}
