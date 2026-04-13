package org.example.CollectionFramework.baitap4;

public class CongViec {
    private String ma;
    private String noiDung;

    public CongViec(String ma, String noiDung) {
        this.ma = ma;
        this.noiDung = noiDung;
    }

    public String getMa() {
        return ma;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    @Override
    public String toString() {
        return ma + ": " + noiDung;
    }
}
