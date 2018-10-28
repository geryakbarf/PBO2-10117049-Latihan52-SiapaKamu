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
public class Dosen extends Manusia{
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Nama Saya "+nama+" umur "+umur+" tahun sedang mengajar mata kuliah "+mataKuliah);
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
    
    
    
    
}
