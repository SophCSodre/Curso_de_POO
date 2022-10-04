
package poo_aula2b_exerc2;

public class POO_Aula2b_Exerc2 {

    public static void main(String[] args) {
        Trabalho t1 = new Trabalho();
        t1.contrato = "CLT";
        t1.cargo = "Dev BackEnd";
        t1.salario = 4000;
        t1.tempo = 8.0f;
        t1.folgar();
        t1.status();
        t1.trabalhar();
        
        Trabalho t2 = new Trabalho();
        t2.contrato = "PJ";
        t2.cargo = "Dev FrontEnd";
        t2.salario = 6000;
        t2.tempo = 12.0f;
        t2.naofolgar();
        t2.status();
        t2.trabalhar();
    }
    
}
