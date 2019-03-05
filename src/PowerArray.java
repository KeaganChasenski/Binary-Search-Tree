/* Keagan Chasenski
 * CHSKEA001
 * PracOne - PowerArray Class
 * 06/03/19
 */

import java.io.* ;
import java.util.* ;
import java.lang.* ;

public class PowerArray
{
    private Power[] powerArray ;

    public PowerArray()
    {
        filldata("src/cleaned_data.csv") ;
    }

    public void filldata(String filename)
    {
        try
        {
            File temp = new File("cleaned_data.csv")  ;
            Scanner fIn = new Scanner(temp) ;

            powerArray = new Power[500] ;
            int counter = 0 ;

            fIn.nextLine() ;

            while (fIn.hasNextLine())
            {
                String current = fIn.nextLine() ;
                String[] items = current.split(",") ;

                Power powerObject ;
                powerObject = new Power(items[0],items[1],items[3]) ;
                powerArray[counter] = powerObject ;
                counter++ ;
            }

        }

        catch (Exception fne)
        {
            System.out.println("File was not found") ;
        }

    }

    public void printAllDateTimes()
    {
        for (Power powerObject : powerArray)
        {
            System.out.println(powerObject);
        }
    }

    public void printDateTime(String dateTime)
    {
        int counter = 0 ;

        for (Power powerObject : powerArray)
        {
            counter++ ;

            if (counter > 500)
            {
                System.out.println("DateTime record was not found") ;
                System.out.println("Number of comparitive operations used: 500" );
                counter = 0 ;
            }

            if (dateTime.equals(powerObject.getDateTime()) )
            {
                System.out.println(powerObject.toString()) ;
                System.out.println("Number of comparitive operations:  " + counter) ;
                counter = 0 ;
                break ;
            }
        }
    }
}
