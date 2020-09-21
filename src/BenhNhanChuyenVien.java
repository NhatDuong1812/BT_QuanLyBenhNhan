import java.util.Scanner;

public class BenhNhanChuyenVien extends Patient {
    public String ngayChuyen;
    public String noiChuyen;

    public String getNgayChuyen() {
        return ngayChuyen;
    }

    public void setNgayChuyen(String ngayChuyen) {
        this.ngayChuyen = ngayChuyen;
    }

    public String getNoiChuyen() {
        return noiChuyen;
    }

    public void setNoiChuyen(String noiChuyen) {
        this.noiChuyen = noiChuyen;
    }

    @Override
    public void addInfo(){
        super.addInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ngày chuyển: ");
        ngayChuyen = sc.nextLine();
        System.out.println("Nơi chuyển: ");
        noiChuyen = sc.nextLine();
    }

    @Override
    public String toString() {
        return "BenhNhanChuyenVien{" +
                "ngayChuyen='" + ngayChuyen + '\'' +
                ", noiChuyen='" + noiChuyen + '\'' +
                ", profileCode=" + profileCode +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", chuanDoanBenh='" + chuanDoanBenh + '\'' +
                '}';
    }
}
