package org.example.OOP.KeThuaInheritance;

import java.util.ArrayList;

// + Sinh viên: Họ tên, Ngày sinh, Nơi sinh, Giới tính
//        + Sinh viên CNTT: Kỹ năng lập trình (array)
//        + Sinh viên Ngoại ngữ: Ngôn ngữ phụ (array)
//        1. Tạo và in danh sách Sinh viên CNTT
//        2. Tạo và in danh sách Sinh viên Ngoại ngữ
//        3. Kiểm tra xem sinh viên CNTT có sinh viên nào có kỹ năng Python không?
//        4. Tổng hợp xem có bao nhiêu sinh viên ngoại ngữ biết tiếng Pháp?
public class Demo {
    public static void main(String[] args) {
        ArrayList<SinhVienCNTT> danhSachSVCNTT = new ArrayList<>();
        ArrayList<SinhVienNgoaiNgu> danhSachSVNN = new ArrayList<>();
        SinhVienCNTT sinhVienCNTT1 = new SinhVienCNTT("Dũng Lại", "12/10/98","Hà Nội",true,
                new String[]{"C", "Python","Java"});
        SinhVienCNTT sinhVienCNTT2 = new SinhVienCNTT("Devteria", "02/01/9x","Quảng Nam",true,
                new String[]{"C", "C#","Java","Rust"});
        SinhVienNgoaiNgu sinhVienNgoaiNgu1 = new SinhVienNgoaiNgu("MC Khánh Vy","28/02/1999","Hà Nội",
                false,new String[]{"Pháp","Đức","Hàn","Anh","Thái"});
        SinhVienNgoaiNgu sinhVienNgoaiNgu2 = new SinhVienNgoaiNgu("Phương Mỹ Chi","13/01/2003","TPHCM",
                false,new String[]{"Trung","Anh"});
        danhSachSVNN.add(sinhVienNgoaiNgu1);
        danhSachSVNN.add(sinhVienNgoaiNgu2);
        danhSachSVCNTT.add(sinhVienCNTT1);
        danhSachSVCNTT.add(sinhVienCNTT2);

        System.out.println("===========Sinh Viên CNTT===========");
        for(SinhVienCNTT sinhVienCNTT: danhSachSVCNTT){
            System.out.println(sinhVienCNTT);
        }
        System.out.println("===========Sinh Viên Ngoại Ngữ===========");
        for(SinhVienNgoaiNgu sinhVienNgoaiNgu: danhSachSVNN){
            System.out.println(sinhVienNgoaiNgu);
        }
    }
}
