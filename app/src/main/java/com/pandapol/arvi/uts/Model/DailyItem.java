package com.pandapol.arvi.uts.Model;

/**
 * Created by 10116282 - Arvi Ramadhan - AKB7, 18-19 Mei 2019
 */

public class DailyItem {
    String namaKegiatan, jamKegiatan;
    int imgFotoKegiatan;

    public String getNamaKegiatan() { return namaKegiatan; }
    public String getJamKegiatan() { return jamKegiatan; }
    public int getImgFotoKegiatan() { return imgFotoKegiatan; }

    public DailyItem(String namaKegiatan, String jamKegiatan, int imgFotoKegiatan) {
        this.namaKegiatan = namaKegiatan;
        this.jamKegiatan = jamKegiatan;
        this.imgFotoKegiatan = imgFotoKegiatan;
    }
}
