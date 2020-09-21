import java.sql.Struct;
import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    ArrayList<Patient> patients = new ArrayList<>();

    public void show() {
        for (Patient bn : patients
        ) {
            System.out.println(bn.toString());
        }
    }

    public void add() {
        do {
            BenhNhanNoiTru bnNoiTru = new BenhNhanNoiTru();
            BenhNhanNgoaiTru bnNogaiTru = new BenhNhanNgoaiTru();
            BenhNhanChuyenVien bnChuyenVien = new BenhNhanChuyenVien();
            System.out.println("==Bạn muốn thêm loại bệnh nhân nào ??== ");
            System.out.println("1. Bệnh nhân nội trú");
            System.out.println("2. Bệnh nhân ngoại trú");
            System.out.println("3. Bệnh nhân chuyển viện");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    bnNoiTru.addInfo();
                    patients.add(bnNoiTru);
                    break;
                case 2:
                    bnNogaiTru.addInfo();
                    patients.add(bnNogaiTru);
                    break;
                case 3:
                    bnChuyenVien.addInfo();
                    patients.add(bnChuyenVien);
                    break;

            }
            break;
        } while (true);
    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("+ Nhập mã hồ sơ bệnh nhân cần sửa");
        int serchIDPatient = Integer.parseInt(sc.nextLine());
        for (Patient bn : patients
        ) {
            if (bn instanceof BenhNhanNoiTru && serchIDPatient == bn.profileCode) {
                BenhNhanNoiTru bnNoiTru = (BenhNhanNoiTru) bn;
                System.out.println("ID mới: ");
                int newProfileCode = Integer.parseInt(sc.nextLine());
                bnNoiTru.setProfileCode(newProfileCode);

                System.out.println("Tên mới: ");
                String newName = sc.nextLine();
                bnNoiTru.setName(newName);

                System.out.println("Ngày Sinh mới: ");
                String newDateOfBirth = sc.nextLine();
                bnNoiTru.setDateOfBirth(newDateOfBirth);

                System.out.println("Chuẩn đoán bệnh mới: ");
                String newChuanDoanBenh = sc.nextLine();
                bnNoiTru.setChuanDoanBenh(newChuanDoanBenh);

                System.out.println("Ngày nhập viện mới: ");
                String newNgayNhapVien = sc.nextLine();
                bnNoiTru.setNgayNhapVien(newNgayNhapVien);

                System.out.println("Ngày xuất viện mới: ");
                String newNgayXuatVien = sc.nextLine();
                bnNoiTru.setNgayXuatVien(newNgayXuatVien);

                System.out.println("Tên khoa mới: ");
                String newTenKhoa = sc.nextLine();
                bnNoiTru.setTenKhoa(newTenKhoa);

                System.out.println("Số giường bệnh mới: ");
                int newSoGiuong = Integer.parseInt(sc.nextLine());
                bnNoiTru.setSoGiuongBenh(newSoGiuong);

                System.out.println("Cập nhật thông tin bệnh nhân " + bn.name + " thành công");
                break;
            }else if (bn instanceof BenhNhanNgoaiTru && serchIDPatient == bn.profileCode){
                BenhNhanNgoaiTru bnNgoaiTru = (BenhNhanNgoaiTru) bn;

                System.out.println("ID mới: ");
                int newProfileCode = Integer.parseInt(sc.nextLine());
                bnNgoaiTru.setProfileCode(newProfileCode);

                System.out.println("Tên mới: ");
                String newName = sc.nextLine();
                bnNgoaiTru.setName(newName);

                System.out.println("Ngày Sinh mới: ");
                String newDateOfBirth = sc.nextLine();
                bnNgoaiTru.setDateOfBirth(newDateOfBirth);

                System.out.println("Chuẩn đoán bệnh mới: ");
                String newChuanDoanBenh = sc.nextLine();
                bnNgoaiTru.setChuanDoanBenh(newChuanDoanBenh);

                System.out.println("Ngày khám mới: ");
                String newNgayKham = sc.nextLine();
                bnNgoaiTru.setNgayKham(newNgayKham);

                System.out.println("Sổ BHYT mới: ");
                String newSoBHYT = sc.nextLine();
                bnNgoaiTru.setSoBHYT(newSoBHYT);

                System.out.println("Mã toa thuốc mới: ");
                int newMaToaThuoc = Integer.parseInt(sc.nextLine());
                bnNgoaiTru.setMaToaThuoc(newMaToaThuoc);

                System.out.println("Cập nhật thông tin bệnh nhân " + bn.name + " thành công");
                break;
            }else if (bn instanceof  BenhNhanChuyenVien && serchIDPatient == bn.profileCode){
                BenhNhanChuyenVien bnChuyenVien = (BenhNhanChuyenVien) bn;

                System.out.println("ID mới: ");
                int newProfileCode = Integer.parseInt(sc.nextLine());
                bnChuyenVien.setProfileCode(newProfileCode);

                System.out.println("Tên mới: ");
                String newName = sc.nextLine();
                bnChuyenVien.setName(newName);

                System.out.println("Ngày Sinh mới: ");
                String newDateOfBirth = sc.nextLine();
                bnChuyenVien.setDateOfBirth(newDateOfBirth);

                System.out.println("Chuẩn đoán bệnh mới: ");
                String newChuanDoanBenh = sc.nextLine();
                bnChuyenVien.setChuanDoanBenh(newChuanDoanBenh);

                System.out.println("Ngày chuyển mới: ");
                String newNgayChuyen = sc.nextLine();
                bnChuyenVien.setNgayChuyen(newNgayChuyen);

                System.out.println("Nơi chuyển mới: ");
                String newNoiChuyen = sc.nextLine();
                bnChuyenVien.setNoiChuyen(newNoiChuyen);

                System.out.println("Cập nhật thông tin bệnh nhân " + bn.name + " thành công");
                break;
            }else {
                System.out.println("Lỗi");
            }
        }
    }

    public void delete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Id hồ sơ bệnh nhân cần xóa: ");
        int serchIDPatient = Integer.parseInt(sc.nextLine());
        for (Patient bn: patients
             ) {
            if (serchIDPatient == bn.profileCode)
            patients.remove(bn);
            System.out.println("Xóa bệnh nhân " + bn.name + " thành công. ");
            break;
        }
    }

    public void search(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập mã hồ sơ của bênh nhân càn tìm: ");
        int searchID = Integer.parseInt(sc.nextLine());
        for (Patient bn: patients
             ) {
            if (bn instanceof BenhNhanNoiTru && searchID == bn.profileCode) {
                BenhNhanNoiTru bnNoiTru = (BenhNhanNoiTru) bn;
                System.out.println(bnNoiTru.toString());
            }else if (bn instanceof BenhNhanNgoaiTru && searchID == bn.profileCode) {
                BenhNhanNgoaiTru bnNgoaiTru = (BenhNhanNgoaiTru) bn;
                System.out.println(bnNgoaiTru.toString());
            }else if (bn instanceof BenhNhanChuyenVien && searchID == bn.profileCode){
                BenhNhanChuyenVien bnChuyenVien = (BenhNhanChuyenVien) bn;
                System.out.println(bnChuyenVien.toString());
            }else {
                System.out.println("Lỗi!!");
            }
        }
    }
}
