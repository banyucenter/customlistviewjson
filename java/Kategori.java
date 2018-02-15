package com.yourpackage.com.yourpackage;

/**
 * Created by ipungpurwono on 2/13/18.
 */

public class Kategori {
    private String id_kategori;
    private String nama_kategori;
    private String sub_judul;
    private String keterangan;
    private String foto;

    public Kategori(String foto, String nama_kategori, String sub_judul, String keterangan, String id_kategori) {
        this.foto = foto;
        this.nama_kategori = nama_kategori;
        this.sub_judul = sub_judul;
        this.keterangan = keterangan;
        this.id_kategori = id_kategori;

    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    public String getSub_judul() {
        return sub_judul;
    }

    public void setSub_judul(String sub_judul) {
        this.sub_judul = sub_judul;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(String id_kategori){
        this.id_kategori = id_kategori;
    }
}
