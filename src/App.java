import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
import javax.print.DocFlavor.STRING;
import javax.swing.Spring;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      /* // WPISYWANIE IMIENIA I WYŚWIETLANIE GO
          System.out.println("Podaj swoje imię:");
          String firstName = scanner.nextLine();
          System.out.println("Twoje imię to " + firstName );
          scanner.close();
      */
      /* // KALKULATOR DWÓCH LICZB 
      System.out.println("Podaj pierwszą liczbę");
      int a = scanner.nextInt();
      System.out.println("Podaj drugą licfzbę");      
      int b = scanner.nextInt();
      System.out.println(a+" + "+b+" = "+(a+b));      
      */
      /* // IF ELSE
      int nr = 10;
      if(nr == 2){
        System.out.println("Liczba to 2");
      }else if(nr == 3){
        System.out.println("Liczba to 3");
      }else{
        System.out.println("Jakaś inna liczba niż 3 i 2");
      }
      // */
      /* // KALKULATOR + OPERATOR
      System.out.println("Wpisz pierwsza liczbe: ");
      int a = scanner.nextInt();

      System.out.println("Podaj operator (+,-): ");
      scanner.nextLine();
      String x = scanner.nextLine();

      System.out.println("Wpisz druga liczbe: ");
      int b = scanner.nextInt();

        if(x.equals("+"))
        {
          System.out.println("wynik to: " +(a+b));
        }
        else if(x.equals("-"))
        {
          System.out.println("wynik to: " +(a-b));
        }
        else
        {
          System.out.println("Podales zly operator");
        }
        */

      /*
        //User Input 
      System.out.println("Wpisz pierwsza liczbe: ");
      int a = scanner.nextInt();

      System.out.println("Podaj operator (+,-,*,/,%): ");
      scanner.nextLine();
      String x = scanner.nextLine();

      System.out.println("Wpisz druga liczbe: ");
      int b = scanner.nextInt();

        switch(x)
        {
          case "+":
            System.out.println("wynik to: " +(a+b));
            break;
          case "-":
            System.out.println("wynik to: " +(a-b));
            break;
          case "*":
            System.out.println("wynik to: " +(a*b));
            break;
          case "/":
            System.out.println("wynik to: " +(a/b));
            break;
          case "%":
            System.out.println("wynik to: " +(a%b));
            break;

          default:
            System.out.println("Podales zly operator");


        }
        */

        // Zadeklaruj wartości
        String[][] dane = {
          {"Więcej niż jedno zwierzę","stado","klucz","dwa","owca","lama"},
          {"Sporty na s","sztafeta","skok o tyczce", "skoki narciarskie", "sumo", "szachy"}
        };
        
        int wynik = 0;   // zadeklaruj wynik
    
        for(int i = 0; i < dane.length; i++)   // Pętla wykonująca się tyle razy, ile jest pytań
        {
          System.out.println(dane[i][0]);   // Wyświetl pytanie (pierwszy element każdej tablicy)
          String odp = scanner.nextLine();   // pobierz odpowiedź
          boolean isAnswerCorect = false;
          
          for(int it = 1; it < dane[i].length; it++)   // Pętla sprawdzająca odpowiedzi 
          {
            
            //System.out.println("ODP: "+dane[i][it]);   // Wyświetl każdą odpowiedź

            if(dane[i][it].equals(odp))   // Sprawdź, czy odpowiedź użytkownika znajduje się w tablicy
            {                             // ( za pomocą if )
              System.out.println("BRZDEK!");
              wynik += it*10;   // dodaj punkty do wyniku
            }


          }
          if(!isAnswerCorect)
          {
            System.out.println("X");
          }
        }
      
        System.out.println("Twoj wynik to: " + wynik); // wyświetl wynik
    scanner.close();
  }
}