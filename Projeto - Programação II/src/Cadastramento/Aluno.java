
package Cadastramento;

public class Aluno extends AcadêmicoAbstract implements AcadêmicoInterface{
    
    public Aluno(int id, String nome, String dataN, int periodo){
        super(id, nome, dataN);
        this.setPeriodo(periodo);
    }
    
    public Aluno(int id, String nome, String dataN){
        super(id, nome, dataN);
        this.setPeriodo(1);
    }
    
    
    private int periodo;

    public int getPeriodo() {return periodo;}
    public void setPeriodo(int periodo) {this.periodo = periodo;}

    @Override
    public void setId() {}

    @Override
    public void setNome() {}

    public String getClasse(){
        return "aluno";
    }

    @Override
    public String toString(){
        return super.toString() + "\nPeríodo: " + this.getPeriodo();
    }
    
}
