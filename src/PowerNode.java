/** Keagan Chasenski
 * CHSKEA001
 * PracOne - PowerNode Class
 * 06/03/19
 */

/* Code for a Node class in BST was copied and modified from the lectures
     slide provided on Vula in the CSC2001F page and code help from G. Davies */

import java.util.*;
import java.io.*;

public class PowerNode
{
    protected String dateTime ;
    protected String Power ;
    protected String Voltage ;
    protected PowerNode leftChild ;
    protected PowerNode rightChild ;

    public PowerNode (String dateTime, String power, String voltage)
    {
        this.dateTime = dateTime ;
        Power = power ;
        Voltage =  voltage ;
    }

    public PowerNode getLeftChild()
    {
        return leftChild ;
    }

    public PowerNode getRightChild()
    {
        return rightChild ;
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
