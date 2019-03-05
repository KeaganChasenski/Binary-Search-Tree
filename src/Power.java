/** Keagan Chasenski
 * CHSKEA001
 * PracOne - Power Class
 * 06/03/19
*/

public class Power
{
    private String dateTime ;
    private String Power ;
    private String Voltage ;

    public Power (String dateTime, String power, String voltage)
    {
        this.dateTime = dateTime ;
        Power = power ;
        Voltage =  voltage ;
    }

    public String getDateTime()
    {
        return dateTime ;
    }

    public String getPower()
    {
        return Power ;
    }

    public String getVoltage()
    {
        return Voltage ;
    }

    public String toString()
    {
        return "Date/Time: " + dateTime + "\t" + "Global Active Power: " + Power + "\t" + "Voltage : " + Voltage ;
    }
}
