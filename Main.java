import java.util.*;
import java.io.*;

public class Main
{

    public static void main(String[] args) throws IOException
    {



        LinkedList<char[]> items = new LinkedList<char[]>();

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number of Set N: ");
        int numN=kb.nextInt();

        System.out.println("Enter the number of Set R: ");
        int numR=kb.nextInt();

        char[] item = new char[numR];
        char[] input=new char[numN];//new char[numN+1];

       /* input[0]='a';
        input[1]='b';
        input[2]='c';  */


        for(int i=0; i<=numN-1; i++)
        {
			System.out.println("Entre value of N"+(i+1)+" :");
			input[i]=kb.next().charAt(0);
		}





        comWrep(items, input, item, 0);


        for (char[] c : items)
        {
            System.out.println(c);
        }
    }

    public static void comWrep(LinkedList<char[]> rslt, char[] invl, char[] vul, int counter)
    {
		int l=vul.length;
		int l2=invl.length;
        if (counter < l)
        {
            for (int i = 0; i < l2; i++)
            {
                vul[counter] = invl[i];
                comWrep(rslt, invl, vul, counter+1);
            }
        }
        else
        {
            rslt.add(vul.clone());
        }
    }

}