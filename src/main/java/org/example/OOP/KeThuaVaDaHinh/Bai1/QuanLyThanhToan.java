package org.example.OOP.KeThuaVaDaHinh.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThanhToan {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<PhuongThucThanhToan> danhSachPhuongThucTT = new ArrayList<>();

    public void khoiTaoDanhSachMau() {
        TienMat cash1 = new TienMat(50000, "03/04/2026");
        TienMat cash2 = new TienMat(4500000, "04/04/2026");
        ChuyenKhoan bankTrans1 = new ChuyenKhoan(350000, "05/04/2026", "Vietcombank");
        ChuyenKhoan bankTrans2 = new ChuyenKhoan(990000, "01/04/2026", "Techcombank");
        ViDienTu eWallet1 = new ViDienTu(1000000, " 02/04/2026", "MoMo");
        ViDienTu eWallet2 = new ViDienTu(567000, " 04/04/2026", "Zalo");
        danhSachPhuongThucTT.add(cash1);
        danhSachPhuongThucTT.add(cash2);
        danhSachPhuongThucTT.add(bankTrans1);
        danhSachPhuongThucTT.add(bankTrans2);
        danhSachPhuongThucTT.add(eWallet1);
        danhSachPhuongThucTT.add(eWallet2);

        System.out.println("List of transactions: ");
        for (PhuongThucThanhToan pttt : danhSachPhuongThucTT) {
            System.out.println(pttt);
        }
    }

    public void menu() {
        int choice;
        do {
            System.out.println("============MENU============");
            System.out.println("1.Add new transaction");
            System.out.println("2.Show all transaction");
            System.out.println("3.Total amount by payment method");
            System.out.println("4.Exit");
            System.out.println("You choose function from 1-4: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addNewTransaction();
                    break;
                case 2:
                    showAllTransactions();
                    break;
                case 3:
                    calculateTotalByCategory();
                    break;
                case 4:
                    System.out.println("Đang thoát chương trình....");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thoát thành công");
                    break;
                default:
                    System.out.println("Không hợp lệ");
            }
        } while (choice != 4);

    }
    //thêm giao dịch mới
    public void addNewTransaction(){
        System.out.println("1.Cash");
        System.out.println("2.Bank Transfer");
        System.out.println("3.eWallet");
        System.out.println("4.Exit");
        System.out.print("Choose your payment method(1-3): ");
        int choose = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter money amount: ");
        double money = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter date(dd/mm/yyyy): ");
        String date = sc.nextLine();

        switch (choose){
            case 1:
                danhSachPhuongThucTT.add(new TienMat(money,date));
                break;
            case 2:
                System.out.print("Enter bank's name: ");
                String bankName = sc.nextLine();
                danhSachPhuongThucTT.add(new ChuyenKhoan(money,date,bankName));
                break;
            case 3:
                System.out.print("Enter eWallet's name: ");
                String eWalletName = sc.nextLine();
                danhSachPhuongThucTT.add(new ViDienTu(money,date,eWalletName));
                break;
            case 4:
                System.out.println("Exit is in process.....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Exit success");
                break;
            default:
                System.out.println("Invalid!!!");
        };
    }
    public void showAllTransactions(){
        for(PhuongThucThanhToan pttt: danhSachPhuongThucTT){
            System.out.println(pttt);
        }
    }
    public void calculateTotalByCategory(){
        double cash = 0, bTrans = 0, eWall = 0;

        for (PhuongThucThanhToan gd : danhSachPhuongThucTT) {
            if (gd instanceof TienMat) {
                cash += gd.getSoTien();
            } else if (gd instanceof ChuyenKhoan) {
                bTrans += gd.getSoTien();
            } else if (gd instanceof ViDienTu) {
                eWall += gd.getSoTien();
            }
        }
        System.out.println("\n===== TOTAL AMOUNT =====");
        System.out.printf("Cash: %,.2f VND\n", cash);
        System.out.printf("Bank transfer: %,.2f VND\n", bTrans);
        System.out.printf("eWallet: %,.2f VND\n", eWall);
    }
}
