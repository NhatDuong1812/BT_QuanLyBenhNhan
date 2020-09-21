import java.util.Scanner;

public class Patient {
    public int profileCode;
    public String name;
    public String dateOfBirth;
    public String chuanDoanBenh;
    public Patient() {
    }

    public Patient(int profileCode, String name, String dateOfBirth, String chuanDoanBenh) {
        this.profileCode = profileCode;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.chuanDoanBenh = chuanDoanBenh;
    }

    public int getProfileCode() {
        return profileCode;
    }

    public void setProfileCode(int profileCode) {
        this.profileCode = profileCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getChuanDoanBenh() {
        return chuanDoanBenh;
    }

    public void setChuanDoanBenh(String chuanDoanBenh) {
        this.chuanDoanBenh = chuanDoanBenh;
    }

    public void addInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Profile Code: ");
        profileCode = Integer.parseInt(sc.nextLine());
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Data of birth: ");
        dateOfBirth =  sc.nextLine();
        System.out.println("Chuẩn đoán bệnh: ");
        chuanDoanBenh = sc.nextLine();
    }

    public void update(){

    }
}


