public class satu
{
    public static void main(String[] args)
    {   
        int loveBird;
        int kurang;
        int jumlah;
        
        // Jumlah burung lovebird
        loveBird = 6969;
        System.out.print("Jumlah Awal burung loveBird : " + loveBird);
        
        System.out.println();
        
        // Jumlah burung lovebird setelah mati 11,1%
        kurang = (int) Math.round(loveBird * 11.1 / 100);
        loveBird -= kurang;
        System.out.print("Jumlah burung loveBird setelah mati (11,1%): " + loveBird);
        
        System.out.println();
        
        /*  
        Menghitung jumlah lovebird setelah 441 hari
        yang setiap 21 hari seluruh lovebird menetaskan 1 telur
        */
        jumlah = loveBird + (loveBird * 441 / 21);
        System.out.println("Jumlah seluruh burung loveBird adalah : " + jumlah);
        
    }
}
