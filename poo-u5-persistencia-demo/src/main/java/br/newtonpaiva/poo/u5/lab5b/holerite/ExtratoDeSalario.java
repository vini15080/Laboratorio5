package br.newtonpaiva.poo.u5.lab5b.holerite;
import java.time.LocalDate;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;

	@Entity
	@Table(name = "ExtratoDeSalario")
	public class ExtratoDeSalario {
		 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		 private Integer id;
		 private String ano;
		 private String mes;
		 private LocalDate dataAdm;
		 private String totalComDesconto;
		 private String totalSemDesconto;
		 private String horasTrabalhadas;
		 private String horasFalta;
		 private String irpf;
		 private String inss;
		 
		 @ManyToOne
		    private Funcionario funcionario;
	    

	    public ExtratoDeSalario(Integer id, String ano, String mes, LocalDate dataAdm, String totalComDesconto,
				String totalSemDesconto, String horasTrabalhadas, String horasFalta, String irpf, String inss,
				 Funcionario funcionario) {
			super();
			this.id = id;
			this.ano = ano;
			this.mes = mes;
			this.dataAdm = dataAdm;
			this.totalComDesconto = totalComDesconto;
			this.totalSemDesconto = totalSemDesconto;
			this.horasTrabalhadas = horasTrabalhadas;
			this.horasFalta = horasFalta;
			this.irpf = irpf;
			this.inss = inss;
			this.funcionario = funcionario;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getAno() {
			return ano;
		}


		public void setAno(String ano) {
			this.ano = ano;
		}


		public String getMes() {
			return mes;
		}


		public void setMes(String mes) {
			this.mes = mes;
		}


		public LocalDate getDataAdm() {
			return dataAdm;
		}


		public void setDataAdm(LocalDate dataAdm) {
			this.dataAdm = dataAdm;
		}


		public String getTotalComDesconto() {
			return totalComDesconto;
		}


		public void setTotalComDesconto(String totalComDesconto) {
			this.totalComDesconto = totalComDesconto;
		}


		public String getTotalSemDesconto() {
			return totalSemDesconto;
		}


		public void setTotalSemDesconto(String totalSemDesconto) {
			this.totalSemDesconto = totalSemDesconto;
		}


		public String getHorasTrabalhadas() {
			return horasTrabalhadas;
		}


		public void setHorasTrabalhadas(String horasTrabalhadas) {
			this.horasTrabalhadas = horasTrabalhadas;
		}


		public String getHorasFalta() {
			return horasFalta;
		}


		public void setHorasFalta(String horasFalta) {
			this.horasFalta = horasFalta;
		}


		public String getIrpf() {
			return irpf;
		}


		public void setIrpf(String irpf) {
			this.irpf = irpf;
		}


		public String getInss() {
			return inss;
		}


		public void setInss(String inss) {
			this.inss = inss;
		}


		public Funcionario getFuncionario() {
			return funcionario;
		}


		public void setFuncionario(Funcionario funcionario) {
			this.funcionario = funcionario;
		}


		@Override
		public String toString() {
			return "ExtratoDeSalario [id=" + id + ", ano=" + ano + ", mes=" + mes + ", dataAdm=" + dataAdm
					+ ", totalComDesconto=" + totalComDesconto + ", totalSemDesconto=" + totalSemDesconto
					+ ", horasTrabalhadas=" + horasTrabalhadas + ", horasFalta=" + horasFalta + ", irpf=" + irpf
					+ ", inss=" + inss + ", funcionario=" + funcionario + "]";
		}


		public void adicionarExtratoDeSalario(Funcionario f) {
			
			
		}

    
	

}
