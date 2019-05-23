package com.pandapol.arvi.uts.Model;

/**
 * Created by 10116282 - Arvi Ramadhan - AKB7, 18-19 Mei 2019
 */

public class FriendlistItem {
    String namaTeman, infoTeman;
    int fotoTeman;

    public String getNamaTeman() {return namaTeman;}
    public String getInfoTeman() {return infoTeman;}
    public int getFotoTeman() {return fotoTeman;}

    public FriendlistItem(String namaTeman, String infoTeman, int fotoTeman) {
        this.namaTeman = namaTeman;
        this.infoTeman = infoTeman;
        this.fotoTeman = fotoTeman;
    }
}
