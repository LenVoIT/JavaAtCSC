package org.example.OOP.KeThuaVaDaHinh.Bai1;

public class ViDienTu extends PhuongThucThanhToan{
    private String loaiVi;

    public ViDienTu(double soTien, String ngayGiaoDich, String loaiVi) {
        super(soTien, ngayGiaoDich);
        this.loaiVi = loaiVi;
    }

    public String getLoaiVi() {
        return loaiVi;
    }

    public void setLoaiVi(String loaiVi) {
        this.loaiVi = loaiVi;
    }

    public ViDienTu() {
    }

    @Override
    public String toString() {
        return String.format("Ví điện tử %s : %,.2fVND vào ngày %s" ,loaiVi, soTien, ngayGiaoDich);
    }
}
