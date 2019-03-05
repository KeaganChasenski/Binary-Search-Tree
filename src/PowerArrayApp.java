/** Keagan Chasenski
 * CHSKEA001
 * PracOne - PowerArrayApp
 * 06/03/19
*/


import java.io.* ;

public class PowerArrayApp
{

    public static void main(String[] args) throws IOException
    {

        PowerArray powerArray = new PowerArray() ;

        if (args.length != 0 )
        {
            powerArray.printDateTime( args[0] ) ;
        }
        else
        {
            powerArray.printAllDateTimes() ;
        }

    }
}
