public class tiga
{

    public static void main(String[] args)
    {
        // mencetak fungsi static dengan nilai argument 8
        cetak_gambar(8);
    }
    
    /**
     * membuat fungsi static
     * @param x sebagai parameter
     */
    static void cetak_gambar(int x)
    {
        for (int i = 1; i <= x; i++)
        {
            for (int j = 1; j <= x; j++)
            {
                if (i == 1 || i == 8 || j == 3 || j == 6)
                {
                    System.out.print("+" + " ");
                } else
                {
                    System.out.print("=" + " ");
                }
            }
            System.out.println();
        }
    }
}
