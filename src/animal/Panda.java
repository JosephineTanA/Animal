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
public class Panda {

    String Herbivora = "herbivora (pemakan tumbuhan)";
    int Tangan = 2;
    int Kaki = 2;
    String Vivipar = "Vivipar (berkembang biak dengan cara melahirkan)";
    String Keunikan = "warna tubuhnya yang hitam dan putih";

    void makan() {
        System.out.println("Panda adalah jenis hewan " + Herbivora);
    }

    void otonomi() {
        System.out.println("Panda memiliki " + Tangan + " tangan");
        System.out.println("Panda memiliki " + Kaki + " kaki");
    }

    void reproduksi() {
        System.out.println("Panda berkembang biak dengan cara " + Vivipar);
    }

    void fyi() {
        System.out.println("Panda adalah hewan yang sangat lucu karena " + Keunikan);
    }
}
