/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobil;

/**
 *
 * @author COMNET
 */
import java.util.Scanner;
public class Jalan {
    private static int pilih;
    private static int i;
    public static void main (String[] args) {
        Mobil Jalan1 = new Mobil(180, 0, 0);
        Mobil Jalan2 = new Mobil ();
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("1. Start Mobil");
            System.out.println("2. Ganti Gigi");
            System.out.println("3. Gas Mobil");
            System.out.println("4. Rem Mobil");
            System.out.println("5. Stop Mobil"
                    + "");
            System.out.println("");
            System.out.println("Kecepatan Mobil " +Jalan1.getKecActual());
            System.out.println("Masukan Pilihan");
            pilih = in.nextInt();
            switch (pilih){
                case 1:
                    System.out.println("ENGINE START");
                   Jalan1.start();
                    break;
                    
                case 2:
                        System.out.println("Masukan Perseneling");
                    int Gigi = in.nextInt();
                   Jalan1.gantiGigi (Gigi);
                break;
                
                case 3:
                  Jalan1.gas();
                break;
                
                case 4:
                  Jalan1.rem();
                break;
                
                case 5:
                    System.out.println("ENGINE STOP");
                   Jalan1.stop();
            }
            }while (!Jalan1.isStarted());
        }
}

