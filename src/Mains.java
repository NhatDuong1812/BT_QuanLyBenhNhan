import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Methods mt = new Methods();
        do {
            Scanner sc =new Scanner(System.in);
            System.out.println("----Bạn muốn làm gì với hệ thống danh sách bệnh nhân");
            System.out.println("1. Thêm mới");
            System.out.println("2. Sủa");
            System.out.println("3. Xóa");
            System.out.println("4. Show");
            System.out.println("5. Search");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    mt.add();
                    break;
                case 2:
                    mt.update();
                    break;
                case 3:
                    mt.delete();
                    break;
                case 4:
                    mt.show();
                    break;
                case 5:
                    mt.search();
                    break;
            }
        }while (true);
    }
}
