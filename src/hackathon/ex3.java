package hackathon;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        inputArray(arr,n,sc);

        int neg[]=new int[n];
        int zero[]=new int[n];
        int pos[]=new int[n];

        int nNeg=0,nZero=0,nPos=0;

        for(int x:arr) {
            if(x<0)
                neg[nNeg++]=x;
            else if(x==0)
                zero[nZero++]=x;
            else
                pos[nPos++]=x;
        }
        sortDesc(neg,nNeg);
        sortAsc(pos,nPos);

        int k=0;

        for(int i=0;i<nNeg;i++){
            arr[k++]=neg[i];
        }

        for(int i=0;i<nZero;i++) {
            arr[k++] = zero[i];
        }
        for(int i=0;i<nPos;i++) {
            arr[k++] = pos[i];
        }
        System.out.print("Mảng sau khi sắp xếp: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static void inputArray(int arr[], int n, Scanner sc) {
        for(int i=0;i<n;i++) {
            System.out.print("arr["+i+"] = ");
            arr[i]=sc.nextInt();
        }
    }

    public static void sortDesc(int arr[], int n) {
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i]<arr[j]) {
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }

    public static void sortAsc(int arr[], int n) {
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i]>arr[j]) {
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }
}
