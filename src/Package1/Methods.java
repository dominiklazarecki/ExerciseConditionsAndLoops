package Package1;

import java.util.Scanner;


public class Methods {
    Scanner scanner = new Scanner(System.in);



    //1
    public void showNumbersToXForLoop()
    {
        statement1ForShowNumbersToX1();
        int x = takeIntValueFromUsers();
        displayValueToX1(x);
    }
    private void statement1ForShowNumbersToX1() { System.out.println("Podaj X, który wyświetli na ekranie liczby od zera do X:"); }
    private void displayValueToX1(int x) { for (int i = 0; i < x + 1 ; i++) { System.out.println(i);}}


//2

    public void  showNumbersToXWheleLoop()
    {
        statement1ForShowNumbersToX2();
        int x = takeIntValueFromUsers();
        displayValueToX2(x);

    }
    private void statement1ForShowNumbersToX2() { System.out.println("Podaj X, który wyświetli na ekranie liczby od zera do X:"); }
    private void displayValueToX2(int x) { int i = 0;while (x+1 > i) { System.out.println(i);i++;}}



//4

    public void returnNumber()
    {
        statement1ForReturnNumber();
        String valueUser = takeStringValueFromUsers();
        char[] tabChar =  valueUser.toCharArray();

        for (int i = tabChar.length; i > 0; i--) {
            System.out.println(tabChar[i-1]);
        }
    }
    private void statement1ForReturnNumber(){System.out.println("Metoda pobiera liczbę i wypisuje każdy znak w osobnej linii zaczynając od ostatniej");}






//5

    public void invertedString()
    {
        StringBuffer stringBuffer = new StringBuffer();
        statement1ForInvertedString();
        char[] tabChar = takeStringValueFromUsers().toCharArray();
        for (int i = tabChar.length; i > 0; i--) {
            System.out.print(tabChar[i-1]);
        }
    }
    private void statement1ForInvertedString(){System.out.println("Metoda pobiera obiekt klasy String i zwraca “odwrócony” argument. Na przykład “pies” przekształci w “seip”");}





//6



    public String toBinarySystem() {
        statement1ForToBinarySystem();                                                              //TODO samemu napisać logikę
        String valueUser = takeStringValueFromUsers();
        String valueBinary = Integer.toBinaryString(Integer.parseInt(valueUser));

        return valueBinary;
    }
    private void statement1ForToBinarySystem(){System.out.println("Podaj liczbę całkowitą, a zostanie ona wyświetlona w systemie dwójkowym");}


//7

    public void palidrom()
    {
        String word = takeStringValueFromUsers();
        int lengthWord = word.length();

        int iteratorDecisive = 0;
        int iteratorEnd = (lengthWord-1);

        for (int i = 0; i < lengthWord; i++)
        {

            if (word.charAt(i) != word.charAt(iteratorEnd))
            {
                iteratorDecisive = 1;
                break;
            }
            iteratorEnd--;
        }

        if (iteratorDecisive == 1)
        {
            System.out.println("Wyraz nie jest palindromem");
        }
        else
        {
            System.out.println("Wyraz jest palindromem");
        }

    }



    public void showNumbers(int[] tab)
    {
        for (int i = 0; i < tab.length; i++) {
            if (i == 0)
            {
                System.out.print("[" + i + ",");
            }
            else if (i == tab.length - 1)
            {
                System.out.print(i + "]");
            }
            else
            {
                System.out.print( i + ",");
            }


        }

    }


    public void sortingNumbers(int[] tab)
    {




    }







    private int takeIntValueFromUsers(){int value = scanner.nextInt();return value;}
    private String takeStringValueFromUsers(){String value = scanner.next();return value;}
}
