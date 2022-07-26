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
public class Orangutan {

    String Omnivora = "Omnivora (pemakan segala)";
    int Tangan = 2;
    int Kaki = 2;
    String Vivipar = "Vivipar (berkembang biak dengan cara melahirkan)";
    String Keunikan1 = "orangutan memiliki kecendereungan untuk banyak tidur di atas pohon. ";
    String Keunikan2 = "Mereka tidak hanya tidur panjang di waktu malam mulai dari matahari tenggelam hingga terbit keesokan harinya, ";
    String Keunikan3 = "namun juga bahkan mengaatur waktu untuk tidur siang disela waktu aktivitas siang mereka";

    void makan() {
        System.out.println("Orangutan adalah jenis hewan " + Omnivora);
    }

    void otonomi() {
        System.out.println("Orangutan memiliki " + Tangan + " tangan");
        System.out.println("Orangutan memiliki " + Kaki + " kaki");
    }

    void reproduksi() {
        System.out.println("Orangutan berkembang biak dengan cara " + Vivipar);
    }

    void fyi() {
        System.out.println("Keunikan yang dimiliki orangutan adalah " + Keunikan1);
        System.out.println(Keunikan2);
        System.out.println(Keunikan3);
    }
}
