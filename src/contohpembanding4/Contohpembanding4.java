/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohpembanding4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Contohpembanding4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int surat,perangko;
        Scanner scan = new Scanner(System.in);
        System.out.print ("masukan banyak surat anda = ");
        surat = scan.nextInt();
        
        if (surat%5==0)
        {
            perangko = surat/5;
            System.out.println ("banyak perangko yang dibutuhkan = "+perangko);
        }
        else
        {
        perangko = surat/5+1;
        System.out.println ("banyak perangko yang dibutuhkan = "+perangko);
        }
    }
}
