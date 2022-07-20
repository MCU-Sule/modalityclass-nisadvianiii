package com.example.t03_2072051.model;

public class MenuItem {
    private String nama;
    private int harga;
    private int diskon;

    @Override
    public String toString() {
        return nama + " " + harga + ".0 " +
                " Discount: " + diskon +
                ".0%";
    }

    public MenuItem(String nama, int harga, int diskon) {
        this.nama = nama;
        this.harga = harga;
        this.diskon = diskon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getDiskon() {
        return diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }
}
