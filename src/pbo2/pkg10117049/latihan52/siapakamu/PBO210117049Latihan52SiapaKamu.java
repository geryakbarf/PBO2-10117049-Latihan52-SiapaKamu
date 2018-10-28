/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan52.siapakamu;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk mengetahui siapa kamu
 */
public class PBO210117049Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setNip("41227829930");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        System.out.println("NIP DOSEN "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Gery Akbar Fauzi");
        mhs.setKelas("IF-2");
        mhs.setNim("10117049");
        mhs.setUmur(20);
        System.out.println("NIM MAHASISWA "+mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
