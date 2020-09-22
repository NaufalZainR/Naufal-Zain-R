 import java.util.Scanner;

public class AplikasiPecahanUang {
     public static void main (String[] args)  {
      Scanner inputUang = new scanner (system.in) ;
      System.out.println ("nilai :") ;
      int Nilai = inputUang .nextint() ;

      int hitung = (int) (uang/100000) ;
      int sisa = (int) (uang%100000) ;

      int hitung2 = (int) (sisa/50000) ;
      int sisa2 = (int) (sisa%50000) ;

      int hitung3 = (int) (sisa2/20000) ;
      int sisa3 = (int) (sisa2%20000) ;

      int hitung4 = (int) (sisa3/10000) ;
      int sisa4 = (int) (sisa3%10000) ;

      int hitung5 = (int) (sisa4/5000) ;
      int sisa5 = (int) (sisa4%5000) ;

      int hitung6 = (int) (sisa5/2000) ;
      int sisa6 = (int) (sisa5%2000) ;
 
      int hitung7 = (int) (sisa6/1000) ;
      int sisa7 = (int) (sisa6%1000) ;

      int hitung8 = (int) (sisa7/500) ;
      int sisa8 = (int) (sisa7%500) ;

      int hitung9 = (int) (sisa8/200) ;
      int sisa9 =  (int) (sisa8%200) ;

      int hitung10 = (int) (sisa9/100) ;
      int sisa10 = (int) (sisa9%100) ;

      int hitung11 = (int) (sisa10/50) ;
      int sisa11 = (int) (sisa10%50) ;

      int hitung12 = (int) (sisa11/1) ;
      int sisa12 = (int) (sisa11%1) ; 

      System.out.println (hitung + " lembar Pecahan 100000 ") ;
      System.out.println (hitung2 + " lembar Pecahan 50000 ") ;
      System.out.println (hitung3 + " lembar Pecahan 20000 ") ;
      System.out.println (hitung4 + " lembar Pecahan 10000 ") ;
      System.out.println (hitung5 + " lembar Pecahan 5000 ") ;
      System.out.println (hitung6 + " lembar Pecahan 2000 ") ;
      System.out.println (hitung7 + " lembar Pecahan 1000 ") ;
      System.out.println (hitung8 + " keping Pecahan 500 ") ;
      System.out.println (hitung9 + " keping Pecahan 200 ") ;
      System.out.println (hitung10 + " keping Pecahan 100 ") ;
      System.out.println (hitung11 + " keping Pecahan 50 ") ;
      System.out.println (hitung12 + " keping Pecahan 1 ") ;

      }
      }