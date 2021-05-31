package br.newtonpaiva.poo.u5.lab5b.holerite;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainHolerite {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("holerite");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    private static void salvar(Object o) {
        entityManager.getTransaction().begin();
        entityManager.persist(o);
        entityManager.getTransaction().commit();
        System.out.println(o);
        System.out.println();
    }

    public static void main(String[] args) {
        // criar a empresa (obj)
        var e = new Empresa("Newton Paiva Sistemas", "123.456/0001-32", "Caiçara");
        System.out.println(e);
        System.out.println();

        var f = new Funcionario("00001", "Adão", "123.456.789-01", LocalDate.now(), "95");
        var f2 = new Funcionario("00002", "Eva", "123.456.789-02", LocalDate.now(), "97");
        

        e.adicionarFuncionario(f);
        e.adicionarFuncionario(f2);
        
        
        var c = new Cargo("01257", "Eletricista", "1520/9");
        System.out.println(c);
        System.out.println();
        
        c.adicionarCargo(f);
        

      var eds = new ExtratoDeSalario(null, "1877", null, null, null, null, null, null, null, null, f);
      System.out.println(eds);
      System.out.println();
      
      eds.adicionarExtratoDeSalario(f);
      
  
      var ies = new ItemDeExtratoDeSalario(null, null, null, null, null, eds);
 //      vamos persistir a empresa
         salvar(e);
         salvar(c);
         salvar(eds);
         salvar(ies);
//        entityManager.getTransaction().begin();
//        entityManager.persist(e);
//        entityManager.getTransaction().commit();
//        System.out.println(e);
//        System.out.println();

//       recuperar a a partir do ID
        var empresa = recuperar(e, e.getId());

        // recuperar em forma de lista - HQL
        var lista = entityManager.createQuery("select a from Empresa a", Empresa.class).getResultList();
        System.out.println(lista);
        System.out.println();

        // atualizar
        e.setEndereco("Belvedere");
        entityManager.getTransaction().begin();
        entityManager.merge(e);
        entityManager.getTransaction().commit();

        empresa = entityManager.find(Empresa.class, e.getId());
        System.out.println(empresa);
        System.out.println();

        // remover
        entityManager.getTransaction().begin();
        entityManager.remove(e);
        entityManager.getTransaction().commit();

        // encerrar
        entityManager.close();
        entityManagerFactory.close();
        
    }

    private static Object recuperar(Object e, Integer id) {
        var obj = entityManager.find(e.getClass(), id);
        System.out.println(obj);
        System.out.println();

        return obj;
    }

}