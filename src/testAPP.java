

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.util.* ;
import java.io.* ; 

public class testAPP 
{
    public static void main(String[] args)
    {
        try
        {
            PowerArray test = new PowerArray();
            test.printDateTime("16/12/2006/17:44:00");

            String lineFromInput = "" ;
            //create an print writer for writing to a file
            PrintWriter out = new PrintWriter(new FileWriter("PowerArrayOutput.txt"));

            //output to the file a line
            out.println(lineFromInput);

            //close the file (VERY IMPORTANT!)
            out.close();

        }
        catch (Exception e)
        {
            System.out.println("error") ;
        }

    }
}
