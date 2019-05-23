package com.pandapol.arvi.uts.Model;

/**
 * Created by 10116282 - Arvi Ramadhan - AKB7, 18-19 Mei 2019
 */

public class GalleryItem {
    String namaFoto, infoFoto;
    int foto;

    public String getNamaFoto() {return namaFoto;}
    public String getInfoFoto() {return infoFoto;}
    public int getFoto() {return foto;}

    public GalleryItem(String namaFoto, String infoFoto, int foto) {
        this.namaFoto = namaFoto;
        this.infoFoto = infoFoto;
        this.foto = foto;
    }
}
