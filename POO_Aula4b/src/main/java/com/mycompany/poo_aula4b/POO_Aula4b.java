
package com.mycompany.poo_aula4b;

public class POO_Aula4b {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Vermelho", 0.4f);
        c1.status();
        
        Caneta c2 = new Caneta("BIC", "Preta", 0.5f);
        c2.status();
        
        //c1.setModelo("BIC");
        //c1.setPonta(0.5f);
        //System.out.println("Tenho uma caneta "  + c1.getModelo() + " de ponta " + c1.getPonta());
    }
}
