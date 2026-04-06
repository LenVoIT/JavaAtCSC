package org.example.OOP.KeThuaVaDaHinh.Bai1;

public class TienMat extends PhuongThucThanhToan{
    public TienMat(double soTien, String ngayGiaoDich) {
        super(soTien, ngayGiaoDich);
    }

    @Override
    public String toString() {
        return String.format("Thanh toán tiền mặt: %,.2fVND vào ngày %s" ,soTien, ngayGiaoDich);
    }
}
