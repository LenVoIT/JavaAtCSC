package org.example.OOP.Bai2;

public class TaiKhoanNganHang {
    private String soTaiKhoan;
    private String tenChuTaiKhoan;
    private String soDienThoai;
    private double soDu;

    public TaiKhoanNganHang() {
    }

    public TaiKhoanNganHang(String soTaiKhoan, String tenChuTaiKhoan, String soDienThoai, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDienThoai = soDienThoai;
        this.soDu = soDu >= 0 ? soDu : 0;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public String getTenChuTaiKhoan() {
        return tenChuTaiKhoan;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public double getSoDu() {
        return soDu;
    }
    public void napTien(double soTien){
        if(soTien > 0){
            soDu += soTien;
            System.out.println("Nạp tiền thành công");
        }else {
            System.out.println("Nạp tiền không thành công");
        }
    }
    public void rutTien(double soTien){
        if(soTien > 0 && soTien <= soDu){
            soDu -= soTien;
            System.out.println("Rút tiền thành công");
        }else {
            System.out.println("Rút tiền thất bại!");
        }
    }
    public void hienThiThongTin(){
//        System.out.println("Số tài khoản\t\tChủ tài khoản \t\t\t SĐT\t\t Số dư");
//        System.out.println("========================================================================");
        System.out.printf("%-15s\t\t%-20s %-10s\t %,.2f\n",soTaiKhoan,tenChuTaiKhoan,soDienThoai,soDu);
    }

}
