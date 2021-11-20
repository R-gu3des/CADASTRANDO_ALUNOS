
package Cadastramento;


interface AcadêmicoInterface {
    public int getId();
    public void setId();
    public String getNome();
    public void setNome();
    public String getDataDeNascimento();
    @Override
    public String toString();
}
