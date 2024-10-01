package entity;

public class SinhVien {
    private Long id;
    private String ma;
    private String ten;
    private Integer tuoi; // int
    private Integer diem;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, Integer tuoi, Integer diem, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
        this.lop = lop;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Integer getDiem() {
        return diem;
    }

    public void setDiem(Integer diem) {
        this.diem = diem;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return String.format("%-5s | %-8s | %-3d | %-2d | %-5s", ma, ten, tuoi, diem, lop);
    }
}
