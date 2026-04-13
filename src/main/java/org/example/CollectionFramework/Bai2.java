package org.example.CollectionFramework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Bai2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Set<String> participants = new HashSet<>();

        registerParticipant(participants);
        checkParticipant(participants);
        sortParticipant(participants);
    }
    //Nhập tên người tham gia
    public static void registerParticipant(Set<String> participants){
        while(true){
            System.out.println("Nhập tên người tham gia (để rỗng và Enter để dừng): ");
            String name = sc.nextLine();
            if(name.isEmpty()){
                break;
            }
            if(!participants.add(name)){
                System.out.println(name + " đã tồn tại!");
            }
        }
    }
    public static void checkParticipant(Set<String> participants){
        System.out.println("Nhập tên để kiểm tra đăng ký: ");
        String checkName = sc.nextLine().toLowerCase();
        if(participants.contains(checkName)){
            System.out.println(checkName + " đã đăng ký");
        }else {
            System.out.println(checkName + " chưa đăng ký");
        }
    }
    public static void sortParticipant(Set<String> participants){
        System.out.println("Danh sách tham gia đã sắp xếp là: ");
        Set<String> sortListParticipants = new TreeSet<>(participants);

        for(String name : sortListParticipants){
            System.out.println(name);
        }
    }
}
