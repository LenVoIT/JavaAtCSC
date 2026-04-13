package org.example.inoutfile.baitap2;

import java.time.LocalDate;

public class VeSoThu {
    private String hoTen;
    private String email;
    private String sdt;
    private int veNguoiLon;
    private int veTreEm;
    private LocalDate ngayThamQuan;

    // ===== SETTER CÓ VALIDATE =====

    public void setHoTen(String hoTen) throws TenRongException {
        if (hoTen == null || hoTen.trim().isEmpty()) {
            throw new TenRongException("Họ tên không được rỗng.");
        }
        this.hoTen = hoTen;
    }

    public void setEmail(String email) throws EmailKhongHopLeException {
        if (!email.contains("@") || !email.contains(".")) {
            throw new EmailKhongHopLeException("Email không hợp lệ.");
        }
        this.email = email;
    }

    public void setSdt(String sdt) throws SoDienThoaiKhongHopLeException {
        if (!(sdt.matches("^0\\d{9}$") || sdt.matches("^\\+84\\d{9}$"))) {
            throw new SoDienThoaiKhongHopLeException("SĐT không hợp lệ.");
        }
        this.sdt = sdt;
    }

    public void setVeNguoiLon(int veNguoiLon) throws SoVeKhongHopLeException {
        if (veNguoiLon < 0) {
            throw new SoVeKhongHopLeException("Số vé người lớn không hợp lệ.");
        }
        this.veNguoiLon = veNguoiLon;
    }

    public void setVeTreEm(int veTreEm) throws SoVeKhongHopLeException {
        if (veTreEm < 0) {
            throw new SoVeKhongHopLeException("Số vé trẻ em không hợp lệ.");
        }
        this.veTreEm = veTreEm;
    }

    public void setNgayThamQuan(LocalDate ngay) throws NgayKhongHopLeException {
        if (!ngay.isAfter(LocalDate.now())) {
            throw new NgayKhongHopLeException("Ngày phải sau hôm nay.");
        }
        this.ngayThamQuan = ngay;
    }

    // ===== GETTER =====
    public String getHoTen() { return hoTen; }
    public String getEmail() { return email; }
    public String getSdt() { return sdt; }
    public int getVeNguoiLon() { return veNguoiLon; }
    public int getVeTreEm() { return veTreEm; }
    public LocalDate getNgayThamQuan() { return ngayThamQuan; }

    // ===== GHI FILE =====
    @Override
    public String toString() {
        return hoTen + "\t" + email + "\t" + sdt + "\t" +
                veNguoiLon + "\t" + veTreEm + "\t" + ngayThamQuan;
    }
}
