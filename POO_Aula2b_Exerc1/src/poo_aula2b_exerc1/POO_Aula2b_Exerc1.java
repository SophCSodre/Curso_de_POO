package poo_aula2b_exerc1;

public class POO_Aula2b_Exerc1 {

    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.modelo = "A52";
        c1.cor = "Lilás";
        c1.carga = 100;
        c1.ligado();
        c1.status();
        c1.usar();
        
        Celular c2 = new Celular();
        c2.modelo = "Redmi 9";
        c2.cor = "Azul";
        c2.carga = 70;
        c2.desligado();
        c2.status();
        c2.usar();
    }
    
}
