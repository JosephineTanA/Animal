/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author USER
 */
public class Bunglon {

    String Insektivora = "insektivora (pemakan serangga)";
    int Tangan = 2;
    int Kaki = 2;
    String Ovipar = "Ovipar (berkembang biak dengan cara bertelur)";
    String Keunikan = "warna tubuhnya dapat berubah mengikuti warna tempat di sekitarnya atau yang biasa disebut mimikri";

    void makan() {
        System.out.println("Bunglon adalah jenis hewan " + Insektivora);
    }

    void otonomi() {
        System.out.println("Bunglon memiliki " + Tangan + " tangan");
        System.out.println("Bunglon memiliki " + Kaki + " kaki");
    }

    void reproduksi() {
        System.out.println("Bunglon berkembang biak dengan cara " + Ovipar);
    }

    void fyi() {
        System.out.println("Bunglon memiliki keunikan yaitu " + Keunikan);
    }
}
