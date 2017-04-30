/**
 *  Burak Demirci
 *  141044091
 */

import org.omg.CORBA.Object;

import java.lang.*;
import java.util.*;
import java.io.*;

public class StackTest
{
    public static void main(String[] args)
    {
        String fileName = "test.csv";
        String outfile = "testResult_1.csv";
        StackA<String> stackAt = new StackA<>();
        StackB<String> stackBt = new StackB<>();
        StackC<String> stackCt = new StackC<>();
        StackD<String> stackDt = new StackD<>();
        String temp;

        try
        {
            File input = new File(fileName);
            Scanner read = new Scanner (input);
            read.useDelimiter(",");
            File file = new File(outfile);
            FileWriter out = new FileWriter(file);
            ArrayList<String> value = new ArrayList<>();
            while (read.hasNext())
            {
                value.add(read.nextLine());
            }

            for(int i= 0; i<value.size(); ++i)
            {
                String temp1,Temp2 = "";
                temp1=value.get(i);
                for(int j=0; j<temp1.length(); j++)
                {
                    if(temp1.charAt(j)!=',')
                    {
                        Temp2 += temp1.charAt(j);
                    }
                    else
                    {
                        stackAt.push(Temp2);
                        stackBt.push(Temp2);
                        stackCt.push(Temp2);
                        stackDt.push(Temp2);
                        Temp2="";
                    }
                }
                stackAt.push(Temp2);
                stackBt.push(Temp2);
                stackCt.push(Temp2);
                stackDt.push(Temp2);
                Temp2="";
            }

            while (read.hasNext())
            {
                temp = read.next();
                stackAt.push(temp);
                stackBt.push(temp);
                stackCt.push(temp);
                stackDt.push(temp);
            }

            out.write(stackAt.toString()+"\n");
            out.write(stackBt.toString()+"\n");
            out.write(stackCt.toString()+"\n");
            out.write(stackDt.toString());
            out.flush();
            System.out.printf(
            	stackAt.toString()+"\n\n"+
            	stackBt.toString()+"\n\n"+
            	stackCt.toString()+"\n\n"+
             	stackDt.toString()+"\n");
         } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }

}