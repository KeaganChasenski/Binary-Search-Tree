/* Keagan Chasenski
 * CHSKEA001
 * PracOne - PowerBSTApp
 * 06/03/19
 */

import java.io.* ;
import java.util.* ;
import java.lang.* ;

public class PowerBSTApp
{
    public static void main(String[] args)
    {
        PowerBST powerBST = new PowerBST() ;

        if (args.length != 0)
        {
            if (powerBST.find(args[0]) == null )
            {
                System.out.println(args[0] + "could not be found") ;
            }
            else
            {
                System.out.println(powerBST.find(args[0]) ) ;
                System.out.println("Number of comparitive operations:  " + powerBST.getCounter()) ;
            }
        }
        else
        {
            powerBST.inOrder() ;
        }

    }
}
