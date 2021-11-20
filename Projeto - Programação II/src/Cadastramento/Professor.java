package Cadastramento;

public class Professor extends AcadêmicoAbstract{
    
    public Professor(int id, String nome, String dataN,String cargo){
        super(id, nome, dataN);
        this.setCargo(cargo);
    }
    
    public Professor(int id, String nome, String dataN){
        super(id, nome, dataN);
        this.setCargo("PROGRAMAÇÃO II");
    }
    
    private String cargo;

    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {this.cargo = cargo;}
    
     
    @Override
    public String toString(){
        return super.toString() + "\nCargo: " + this.getCargo();
    }

    @Override
    public void setId() {}

    @Override
    public void setNome() {}
}
