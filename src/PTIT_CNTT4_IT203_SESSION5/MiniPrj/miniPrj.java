package PTIT_CNTT4_IT203_SESSION5.MiniPrj;
import java.util.Scanner;

public class miniPrj {
    // Tim cap so co tong bang K: Hưng
    static void twoSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhap K: ");
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println("Tim thay cap chi so: " + i + " va " + j);
                    return;
                }
            }
        }
        System.out.println("Khong tim thay cap so.");
    }

    //bai2.Don so 0 ve cuoi: Tuấn Minh
    static void lastZero(int[] a) {
        int position = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[position] = a[i];
                position++;
            }
        }
        for (int i = position; i < a.length; i++) {
            a[i] = 0;
        }
    }

    //bai3 Kiem tra chuoi doi xung: Tiến
    public static boolean validPalindrome(String s){
        String chuSach = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = chuSach.length() - 1;
        while(left< right){
            if(chuSach.charAt(left) != chuSach.charAt(right) ){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    //bai4 Dao nguoc tu trong cau: Duy
    public static String reverse(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "";
        }
        String[] words = input.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    // bai 5 .So hanh phuc : Khánh
    public static int sum(int n){
        int sum = 0;
        while (n>0) {
            int digit = n % 10;
            sum += digit*digit;
            n/=10;
        }
        return sum;
    }
    public static boolean isHappyNumber(int n) {
        for (int i = 0; i < 20; i++) {
            n = sum(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while(choice != 6){
            System.out.println("------MENU------");
            System.out.println("1.Tim cap so co tong bang K ");
            System.out.println("2.Don so 0 ve cuoi: ");
            System.out.println("3.Kiem tra chuoi doi xung");
            System.out.println("4.Dao nguoc tu trong cau");
            System.out.println("5.So hanh phuc ");
            System.out.println("6.Thoat chuong trinh");
            System.out.printf("Lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    twoSum();
                    break;
                case 2:
                    System.out.print("Hay nhap so phan tu cua mang: ");
                    int num = sc.nextInt();

                    int[] a = new int[num];
                    System.out.println("Hay nhap cac phan tu cua mang:");
                    for (int i = 0; i < num; i++) {
                        System.out.print("Phan tu thu " + ( i + 1 ) + " la: ");
                        a[i] = sc.nextInt();
                    }
                    lastZero(a);

                    System.out.println("Mang sau khi don so 0 ve cuoi la:");
                    for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.printf("Nhap vao mot chuoi: ");
                    String s = sc.nextLine();
                    boolean checkValid =  validPalindrome(s);
                    if(checkValid){
                        System.out.println("Day la chuoi doi xung");
                    }else{
                        System.out.println("Day khong phai la chuoi doi xung");
                    }
                    break;
                case 4:
                    System.out.print("Nhập chuỗi: ");
                    String input = sc.nextLine();
                    String result = reverse(input);
                    System.out.println(result);
                    break;
                case 5:
                    System.out.print("Nhap so n: ");
                    int n = sc.nextInt();
                    if(isHappyNumber(n)){
                        System.out.println(n + " la so hanh phuc");
                    } else {
                        System.out.println(n + " khong phai la so hanh phuc");
                    }
                    break;
                case 6:
                    System.out.printf("Ban da thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!!");
            }
        }

    }
}