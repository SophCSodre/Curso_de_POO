
package poo_aula2b_exerc2;

public class Trabalho {
    String contrato;
    String cargo;
    float tempo;
    int salario;
    boolean trampar; //não pensei em coisa melhor :(
    
    void status (){
        System.out.println("Modelo: " + this.contrato);
        System.out.println("Um cargo " + this.cargo);
        System.out.println("Ponta: " + this.tempo);
        System.out.println("Carga: " + this.salario);
        System.out.println("Está de folga? " + this.trampar);
    }
    
    void trabalhar(){
        if (this.trampar == true){
            System.out.println("CERTO! Irei trabalhar");
        } else {
            System.out.println("ERRO! Não irei trabalhar");
        }
    }
    
    void folgar(){
        this.trampar = false;
    }
    
    void naofolgar(){
        this.trampar = true;
    }
}
