package  br.newtonpaiva.poo.u5.lab5b.holerite ;


import  javax.persistence.Entity ;
import  javax.persistence.GeneratedValue ;
import  javax.persistence.GenerationType ;
import  javax.persistence.Id ;
import  javax.persistence.ManyToOne ;
import  javax.persistence.Table ;

@Entity
@Table ( name  =  " Cargo " )
public  class  Cargo {

 @Id
 @GeneratedValue ( strategy  =  GenerationType . AUTO )
 private Integer id;

 private String codigo;
 private String nome;
 private String SalarioBaseHora;

 @ManyToOne
  private Empresa empresa;

public Cargo ( String nome, String SalarioBaseHora,String codigo){


this.codigo = codigo;
this.nome = nome;
this.SalarioBaseHora = SalarioBaseHora;

  }


    public  String  getCodigo () {
        return codigo;
    }

    public  void  setCodigo ( String  codigo ) {
        this.codigo = codigo;
    }

    public  String  getNome () {
        return nome;
    }

    public  void  setNome ( String  nome ) {
        this.nome = nome;
    }

    public  String  getSalarioBaseHora () {
        return SalarioBaseHora;
    }

    public  void  setSalarioBaseHora ( String  SalarioBaseHora ) {
        this.SalarioBaseHora = SalarioBaseHora;
    }

   @Override
    public String toString() {
      return "Cargo [codigo=" + codigo + ", nome=" + nome + ", SalarioBaseHora="+ SalarioBaseHora +"]";
    }

     public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }


	public void adicionarCargo(Funcionario f) {
		
	}
}
