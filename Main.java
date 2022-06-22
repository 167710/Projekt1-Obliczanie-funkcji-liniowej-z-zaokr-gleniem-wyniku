//Obliczanie funkcji liniowej z zaokraglaniem wyniku.


import java.util.Scanner;

import com.sun.jdi.DoubleValue;
class Main {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Podaj a:");
  double a = scanner.nextDouble();
  System.out.println("Podaj b:");
  double b = scanner.nextDouble();
  System.out.println("Podaj c:");
  double c = scanner.nextDouble();
    if(a==0)
    {
      System.out.println("Brak rozwiazan");
    }
    double warunek1=0;
    warunek1=c-a;
    
    if (warunek1==0)
      {
      System.out.println("Jedno rozwiazanie x=0");
      }
    if(a!=0 && warunek1!=0)
    {
      double wynik=0;
      wynik=(c-b)/a;
    
        System.out.format("Jedno rozwiazanie x = %.2f%n", wynik);
    }
   
  }
}