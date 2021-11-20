
package DadosCadastrados;
import Cadastramento.AcadêmicoAbstract;

import java.util.ArrayList;


public class RepositorioAcadêmico {
    private ArrayList<Object> listaAcadêmicos;
    private Object acad;

    public ArrayList<Object> getListaAcadêmicos() {
        return this.listaAcadêmicos;
    }
    
    public RepositorioAcadêmico(){
        this.listaAcadêmicos = new ArrayList();}
    
    public void adicionarPessoa(AcadêmicoAbstract acad){
        listaAcadêmicos.add(acad);
    }
    
    public void removerPessoa(AcadêmicoAbstract acad){
        listaAcadêmicos.remove(acad);
    }
    
    @Override
    public String toString(){
        String resp = "";
        for(Object ob: listaAcadêmicos){resp +=  ob;}
        return resp;
    }
}
