import java.util.Scanner;

public class BenhNhanNgoaiTru  extends  Patient{
    public String ngayKham;
    public String soBHYT;
    public int maToaThuoc;

    public String getNgayKham() {
        return ngayKham;
    }

    public void setNgayKham(String ngayKham) {
        this.ngayKham = ngayKham;
    }

    public String getSoBHYT() {
        return soBHYT;
    }

    public void setSoBHYT(String soBHYT) {
        this.soBHYT = soBHYT;
    }

    public int getMaToaThuoc() {
        return maToaThuoc;
    }

    public void setMaToaThuoc(int maToaThuoc) {
        this.maToaThuoc = maToaThuoc;
    }

    @Override
    public void addInfo(){
        super.addInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ngày khám: ");
        ngayKham = sc.nextLine();
        System.out.println("Sổ bảo hiểm ý tế: ");
        soBHYT = sc.nextLine();
        System.out.println("Mã toa thuốc: ");
        maToaThuoc = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "BenhNhanNgoaiTru{" +
                "ngayKham='" + ngayKham + '\'' +
                ", soBHYT='" + soBHYT + '\'' +
                ", maToaThuoc=" + maToaThuoc +
                ", profileCode=" + profileCode +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", chuanDoanBenh='" + chuanDoanBenh + '\'' +
                '}';
    }
}
