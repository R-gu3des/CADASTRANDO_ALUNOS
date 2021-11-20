
package Cadastramento;

public abstract class AcadêmicoAbstract implements AcadêmicoInterface {
    
    
    public AcadêmicoAbstract(int id, String nome, String dataN){
        this.setId(id);
        this.setNome(nome);
        this.setDataDeNascimento(dataN);
    }
    
    
    private int id;
    private String nome;
    private String dataDeNascimento;

    @Override
    public int getId(){return this.id;}
    public void setId(int i){this.id = i;}

    @Override
    public String getNome(){return this.nome;}
    public void setNome(String n){this.nome = n;}

    @Override
    public String getDataDeNascimento(){return this.dataDeNascimento;}
    public void setDataDeNascimento(String data){this.dataDeNascimento = data;}
    
    @Override
    public String toString(){
        return "\nID: " + this.getId() + "\nNome: " + this.getNome() + "\nData de nascimento: " + this.getDataDeNascimento();
    }
    
    
    
}
