import entity.SinhVien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
    Tạo ra 1 class SinhVien có ma, ten, tuoi, điểm, lớp
    Tạo 1 List chứa các SinhVien
    Thêm sửa xóa trong List theo mã
    Sắp xếp theo điểm giảm dần
    Tìm kiếm theo khoảng điểm
    Tính điểm trung bình 1 lớp và in ra
    Hiện thị ra các thông tin sinh viên có điểm cao nhất trong 1 lớp

     */
    public static void main(String[] args) {
        List<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien("SV01", "Duy", 9, 7, "CL01"));
        list.add(new SinhVien("SV02", "Hung", 2, 5, "CL02"));
        list.add(new SinhVien("SV03", "Nam", 3, 6, "CL01"));
        list.add(new SinhVien("SV04", "Phong", 7, 9, "CL02"));
        list.add(new SinhVien("SV05", "Quan", 8, 10, "CL01"));

        int luaChon = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("""
                    -----Menu-----
                    1. Thêm sinh viên
                    2. Sửa sinh viên
                    3. Xóa sinh viên
                    4. Sắp xếp sinh viên theo điểm giảm dần
                    0. Thoát
                    Lựa chọn: """);
            luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon) {
                case 1:
                    themSinhVien(list, scanner);
                    break;
                case 4:
                    sapXepTheoDiemGiamDan(list);
                    break;
                case 0:
                    break;
                default:
            }
        } while (luaChon != 0);


    }

    private static void sapXepTheoDiemGiamDan(List<SinhVien> list) {
        list.sort((o1, o2) -> o2.getDiem().compareTo(o1.getDiem()));
        System.out.println("Sinh viên theo điểm giảm dần:");
        for (SinhVien x : list) {
            System.out.println(x);
        }
    }

    public static void themSinhVien(List<SinhVien> list, Scanner scanner) {
        SinhVien sv = new SinhVien();
        System.out.print("Nhập mã sinh viên: ");
        sv.setMa(scanner.nextLine());
        System.out.print("Nhập tên: ");
        sv.setTen(scanner.nextLine());
        System.out.print("Nhập tuoi: ");
        sv.setTuoi(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập diem: ");
        sv.setDiem(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập lớp: ");
        sv.setLop(scanner.nextLine());

        list.add(sv);
        for (SinhVien x : list) {
            System.out.println(x);
        }

    }
}