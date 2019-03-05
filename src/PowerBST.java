/** Keagan Chasenski
 * CHSKEA001
 * PracOne - PowerBST Class
 * 06/03/19
*/

import java.util.* ;
import java.io.* ;

/* Code for a BST was copied and modified from the lectures
     slide provided on Vula in the CSC2001F page and code help from G.Davies */

public class PowerBST 
{
    private PowerNode root ;
    private PowerNode[] pNodeBST ;
    int counter = 0 ;

    public PowerBST()
    {
        filldata("src/cleaned_data.cvs") ;
    }

    public void filldata(String filename)
    {
        try
        {
            File temp = new File("cleaned_data.csv")  ;
            Scanner fIn = new Scanner(temp) ;

            pNodeBST = new PowerNode[500] ;
            int counter = 0 ;

            fIn.nextLine() ;

            while (fIn.hasNextLine())
            {
                String current = fIn.nextLine() ;
                String[] items = current.split(",") ;

                PowerNode powerObject ;
                powerObject = new PowerNode(items[0],items[1],items[3]) ;
                pNodeBST[counter] = powerObject ;
                counter++ ;
            }

            for(PowerNode powerObject : pNodeBST)
            {
                add(powerObject);
            }

        }

        catch (Exception fne)
        {
            System.out.println("File was not found") ;
        }
    }

    public void add(PowerNode powerObject)
    {
        PowerNode newNode = new PowerNode(powerObject.getDateTime(), powerObject.getPower(),
                                        powerObject.getVoltage() ) ;

        if (root == null)
        {
            root = newNode ;
        }

        else
        {
            PowerNode tempRoot = root ;
            PowerNode parent ;

            while (true)
            {
                parent = tempRoot ;

                if ( (tempRoot.getDateTime().compareTo(powerObject.getDateTime() ) ) > 0 )
                {
                    tempRoot = tempRoot.leftChild ;

                    if (tempRoot == null)
                    {
                        parent.leftChild = newNode ;
                        return ;
                    }
                }
                else
                {
                    tempRoot = tempRoot.rightChild ;

                    if (tempRoot == null)
                    {
                        parent.rightChild = newNode ;
                        return ;
                    }
                }
            }
        }
    }

    public void inOrder()
    {
        inOrder(root) ;
    }

    public void inOrder (PowerNode tempRoot)
    {
        if (tempRoot != null)
        {
            inOrder(tempRoot.getLeftChild() ) ;
            System.out.println(tempRoot) ;
            inOrder(tempRoot.getRightChild() ) ;
        }
    }

    public PowerNode find(String p)
    {
        counter = 0 ;

        if (root == null)
        {
            return null ;
        }
        else
        {
            return find (p, root) ;
        }
    }

    public PowerNode find(String p, PowerNode focus)
    {
        if (p.compareTo(focus.getDateTime() ) == 0 )
        {
            counter ++ ;
            return focus ;
        }
        else if (p.compareTo(focus.getDateTime() ) < 0 )
        {
            counter ++ ;
            return (focus.getLeftChild() == null) ? null : find (p, focus.leftChild ) ;
        }
        else
        {
            counter ++ ;
            return (focus.getRightChild() == null) ? null : find (p, focus.rightChild ) ;
        }

    }

    public int getCounter()
    {
        return counter ;
    }

}
