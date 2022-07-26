import java.util.Scanner;

public class Main {
    /*
    Kural :
    Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
    Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
    Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
    Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
     */


    static int pozitif(int sayi, int i)
    {
        if (sayi > i)
        {
            return sayi;
        }
        else
        {
            System.out.print(sayi + " ");
            return pozitif(sayi + 5, i);
        }
    }
    static int negatif(int sayi)
    {
        if (sayi <= 0)
        {
            return sayi;
        }
        else
        {
            System.out.print(sayi + " ");
            return negatif(sayi - 5);
        }
    }




    public static void main(String[] args) {
        int sayi;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi Giriniz : ");
        sayi = scan.nextInt();

        pozitif(negatif(sayi),sayi);

    }
}
