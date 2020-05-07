package Package1;

public class ArrayFactory {



    private int x;

    ArrayFactory(){}

    ArrayFactory(int x)
    {
        this.x = x;
    }


    public int[] oneDimension()
    {
        int[] tab = new int[x];
        return tab;
    }

    public int[][] twoDimension()
    {
        int[][] tab = new int[x][x];
        return tab;
    }


//8

    public void macierzJednostkowa()
    {
        int[][] macierz = new int[3][3];

        macierz[0][0] = 1;
        macierz[0][1] = 0;
        macierz[0][2] = 0;

        macierz[1][0] = 0;
        macierz[1][1] = 1;
        macierz[1][2] = 0;

        macierz[2][0] = 0;
        macierz[2][1] = 0;
        macierz[2][2] = 1;

        for (int i = 0; i < macierz.length; i++) {

            for (int j = 0; j < macierz.length; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void macierzJednostkowa(int howLong)
    {
        int[][] macierz = new int[howLong][howLong];

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                if (i == j )
                {
                    macierz[i][j] = 1;
                }
                else
                {
                    macierz[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                System.out.print(macierz[i][j]+"  ");

            }
            System.out.println();
        }
    }


}
