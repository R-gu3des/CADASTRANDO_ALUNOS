
package Cadastramento;

import DadosCadastrados.RepositorioAcadêmico;

public class Escola {
    private RepositorioAcadêmico repositorioPessoas;
    private static Escola instance;
    
    public Escola(RepositorioAcadêmico rep){this.repositorioPessoas = rep;}
        public RepositorioAcadêmico getRepositorioPessoas() {
        return repositorioPessoas;
    }
    public static Escola getInstance(){
        if(Escola.instance == null){
            Escola.instance = new Escola(new RepositorioAcadêmico()); 
        }
        return Escola.instance;
    }
    
    public void adicionarAluno(int id, String nome, String dataN){
        AcadêmicoAbstract aluno = new Aluno(id, nome, dataN);
        repositorioPessoas.adicionarPessoa(aluno);
    }
    
    public  void adicionarProferssor(int id, String nome, String dataN){
        AcadêmicoAbstract professor = new Professor(id, nome, dataN);
        repositorioPessoas.adicionarPessoa(professor);
    }
    
    public String imprimirInfo(){
        String resp = "";
        for(Object ob: repositorioPessoas.getListaAcadêmicos()){
            try{resp += ob.toString();}
            catch (NullPointerException erro){;}
        }
        return resp;
    }   
}
