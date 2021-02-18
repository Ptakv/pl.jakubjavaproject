import java.util.Scanner;



public class App 
{
  public static void main(String[] args) throws Exception 
  {
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
    /* // KALKULATOR + OPERATOR v.1
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
    /* // KALKULATOR + OPERATORY v.2 [SWITCH]
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
    /* // FAMILIADA
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
      boolean isAnswerCorrect = false;
      
      for(int it = 1; it < dane[i].length; it++)   // Pętla sprawdzająca odpowiedzi 
      {
        
        //System.out.println("ODP: "+dane[i][it]);   // Wyświetl każdą odpowiedź

        if(dane[i][it].equals(odp))   // Sprawdź, czy odpowiedź użytkownika znajduje się w tablicy
        {                             // ( za pomocą if )
          isAnswerCorrect = true;
          System.out.println("BRZDEK!");
          wynik += it*10;   // dodaj punkty do wyniku
        }


      }
      if(!isAnswerCorrect)
      {
        System.out.println("X");
      }
    }
  
    System.out.println("Twoj wynik to: " + wynik); // wyświetl wynik
    */
    /* // while + do...while
    int nr = 0;
    if(nr == 0)   
    {
      System.out.println("wykonało sie");
    }

    while(nr < 10)   //wykonuje sie dopóki warunek jest spełniony
    {
      System.out.println("wykonuje petle"+(nr-4));
      nr++;
    }

    do
    {
      System.out.println("wykonuje sie z nr: "+(nr-4));
      nr++;
      if(nr == 4)
      break;
    }while(nr < 10);   //wykonuje sie raz przed sprawdzeniem warunku i dopoki warunek jest spełniony

    do
    {
      System.out.println("prze continue");

      if(nr == 4)
      {
        continue;
      }

      System.out.println("po continue");
    }while(nr < 10);
    */
    /* // zgadywanka
    int szansa = 1;
    int randomNum = (int) (Math.random() * 101 ) + 1;

    System.out.println("wymyśliłem jedną liczbe naturalna 1-100. Jaka to liczba?");

    while(szansa < 6)
    {
    
    
    int odp = scanner.nextInt();
    szansa ++;
    if(odp == randomNum)
    {
      System.out.println("Brawo! Zgadles!");
    }
    else if(odp < randomNum)
    {
      System.out.println("Myślałem nad wiekszą liczbą");
    }
    else if(odp > randomNum)
    {
      System.out.println("Myślałem nad mniejszą liczbą");
    }

    if(szansa == 6 && odp != randomNum)
    {
      System.out.println("Niestety nie udało ci sie :(");
    }
    

    if(odp == randomNum)
    {
      break;
    }
    */

    System.out.println("Podaj nazwe województwa: ");     
    System.out.println(woj(Scanner.nextLine()));


    Scanner.close();
    
  }

  static String woj( String woj )
  {
    boolean jest = false;
    String[][] stolica = {
      {"Slask","Katowice"},
      {"Wielkopolska","Poznań"},
      {"Malopolska","Kraków"},
      {"Mazowieckie","Warszawa"},
      {"Lodzkie","Łódź"}
    };

    int i = 0;
        
    while(i < stolica.length)
    {
            
      if(woj.equals(stolica[i][0]))
      {      
        jest = true;
        break;
      }
      i++;
    }
    
    if(jest)
    {

      return "Stolica tego Województwa to: "+stolica[i][1];

    }else return "Podanego Województwa nie ma na liście";


  } 
  
}