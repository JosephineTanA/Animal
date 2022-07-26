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
public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Burung_Hantu owl = new Burung_Hantu();

        System.out.println("Fakta burung Hantu : ");
        owl.makan();
        owl.otonomi();
        owl.fyi();

        System.out.println("==============================================");

        Panda kiyowo = new Panda();

        System.out.println("Fakta panda : ");
        kiyowo.makan();
        kiyowo.otonomi();
        kiyowo.fyi();

        System.out.println("==============================================");

        Orangutan utanorang = new Orangutan();

        System.out.println("Fakta orangutan : ");
        utanorang.makan();
        utanorang.otonomi();
        utanorang.reproduksi();
        utanorang.fyi();

        System.out.println("==============================================");

        Bunglon anjay = new Bunglon();

        System.out.println("Fakta bunglon : ");
        anjay.makan();
        anjay.otonomi();
        anjay.reproduksi();
        anjay.fyi();
    }

}
