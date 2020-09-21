import java.util.Scanner;

public class BenhNhanNoiTru extends Patient {
    public String ngayNhapVien;
    public String ngayXuatVien;
    public String tenKhoa;
    public int soGiuongBenh;

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayXuatVien() {
        return ngayXuatVien;
    }

    public void setNgayXuatVien(String ngayXuatVien) {
        this.ngayXuatVien = ngayXuatVien;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public int getSoGiuongBenh() {
        return soGiuongBenh;
    }

    public void setSoGiuongBenh(int soGiuongBenh) {
        this.soGiuongBenh = soGiuongBenh;
    }

    @Override
    public void addInfo(){
        super.addInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ngày nhập viện: ");
        ngayNhapVien = sc.nextLine();
        System.out.println("Ngày ra viện: ");
        ngayXuatVien = sc.nextLine();
        System.out.println("Tên khoa: ");
        tenKhoa = sc.nextLine();
        System.out.println("Số giường bệnh: ");
        soGiuongBenh = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "BenhNhanNoiTru{" +
                "ngayNhapVien='" + ngayNhapVien + '\'' +
                ", ngayXuatVien='" + ngayXuatVien + '\'' +
                ", tenKhoa='" + tenKhoa + '\'' +
                ", soGiuongBenh=" + soGiuongBenh +
                ", profileCode=" + profileCode +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", chuanDoanBenh='" + chuanDoanBenh + '\'' +
                '}';
    }

}
