
package InterfaceTextual;

import Cadastramento.Escola;

public class ExecutandoPrograma {
    
    public static void main(String[] args) {
        Escola escola = Escola.getInstance();
        escola.adicionarAluno(123, "Marília Moura", "22/04/1999");
        escola.adicionarProferssor(1234, "Rogério Aguiar", "30/12/1985");
        System.out.println(escola.imprimirInfo());
    }
}
