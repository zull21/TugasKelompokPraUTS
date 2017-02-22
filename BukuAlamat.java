/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BukuAlamat;

/**
 *
 * @author COMNET
 */
import java.util.Scanner; //
public class BukuAlamat {
    String nama;
    String alamat;
    String telpon;
    String email;
    public static void main (String [] arg)
    {int n =2;
        BukuAlamat a[] = new BukuAlamat[n];
    Scanner x = new Scanner (System.in);
    for (int i=0 ; i<n ; i++)
    {a[i] = new BukuAlamat();
    System.out.print("Masukkan nama ke : " + (i+1)+" = ");
    a[i].nama = x.next ();
    System.out.print("Masukkan alamat ke : " + (i+1)+" = ");
    a[i].alamat = x.next ();
    System.out.print("Masukkan telpon ke : "+ (i+1)+" = ");
    a[i].telpon = x.next ();
    System.out.print("Masukkan e-mail ke : "+ (i+1)+" = ");
    a[i].email = x.next ();
    }
    System.out.println ("Data yang diinputkan : ");
    for (int i=0 ; i<n ; i++)
    System.out.println (a[i].nama + "\t" + a[i].alamat + "\t" + a[i].telpon + "\t" +a[i].email);
    }
}