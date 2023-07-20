import java.util.Scanner;
public class Yeniiiiii {
    static boolean asalK(int a ){
        int kontrol = 0;
        for (int i=2; i<a; i++){
            if (a%i==0){
                kontrol+=1;
            }
        }if (kontrol==0&&a>0&&a!=1){
            System.out.println("Sayı Asaldır");
            return true;
        }else{
            System.out.println("Sayı Asal Değildir");
            return false;
        }
    }

    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        sayi= inp.nextInt();
        asalK(sayi);
    }
    }

//    247 742
