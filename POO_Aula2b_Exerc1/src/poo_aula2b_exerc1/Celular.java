
package poo_aula2b_exerc1;

public class Celular {
    String modelo;
    String cor;
    int carga;
    boolean ligar;
    
    void status (){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma cor " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está ligado? " + this.ligar);
    }
    
    void usar(){
        if (this.ligar == true){
            System.out.println("CERTO! Posso usar");
        } else {
            System.out.println("ERRO! Não posso usar");
        }
    }
    
    void ligado(){
        this.ligar = false;
    }
    
    void desligado(){
        this.ligar = true;
    }
}
