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
public class Burung_Hantu {

    String Karnivora = "karnivora (pemakan daging)";
    int Sayap = 2;
    int Kaki = 2;
    String Ovipar = "Ovipar (berkembang biak dengan cara bertelur)";
    String Keunikan = "bisa memutar lehernya 270 derajat";

    void makan() {
        System.out.println("Burung hantu adalah jenis hewan " + Karnivora);
    }

    void otonomi() {
        System.out.println("Burung hantu memiliki " + Sayap + " sayap");
        System.out.println("Burung hantu memiliki " + Kaki + " kaki");
    }

    void reproduksi() {
        System.out.println("Burung hantu berkembang biak dengan cara " + Ovipar);
    }

    void fyi() {
        System.out.println("Burung hantu juga memiliki keunikan yang harus kalian ketahui bahwa burung hantu " + Keunikan);
    }
}
