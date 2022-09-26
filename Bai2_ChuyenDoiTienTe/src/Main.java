import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chuyen doi tien te");
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap so usd muon doi: ");
        int vnd, usd;
        usd= input.nextInt();
        vnd=usd*23000;
        System.out.println( usd+ "usd= "+vnd+" vnd");
    }
}