package hackathon;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        inputArray(arr,n,sc);

        System.out.print("Index: ");
        int index=sc.nextInt();

        System.out.print("X: ");
        int X=sc.nextInt();

        insertShiftRight(arr,n,index,X);

        printArray(arr);

        findSecondLargest(arr);
    }

    public static void inputArray(int arr[], int n, Scanner sc) {
        for(int i=0;i<n;i++) {
            System.out.print("arr["+i+"] = ");
            arr[i]=sc.nextInt();
        }
    }

    public static void printArray(int arr[]) {
        for(int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void insertShiftRight(int arr[], int n, int index, int X) {
        for(int i=n-1;i>index;i--) {
            arr[i]=arr[i-1];
        }
        arr[index]=X;
    }

    public static void findSecondLargest(int arr[]) {
        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int x : arr) {
            if(x>max) {
                second=max;
                max=x;
            }
            else if(x>second && x!=max) {
                second=x;
            }
        }
        if(second==Integer.MIN_VALUE) {
            System.out.println("Không tồn tại số lớn thứ nhì");
        }
        else {
            System.out.println("Max: "+ max + ", Second: "+second);
        }
    }
}
