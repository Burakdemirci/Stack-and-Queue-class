/**
 *  Burak Demirci
 *  141044091
 */

import java.lang.*;
import java.util.*;
import java.io.*;

public class myQueueTest
{
    public static void main(String[] args)
    {

        String fileName = "test.csv";
        String outfile = "testResult_2.csv";
        myQueue<String> myqueue = new myQueue<>();
        Queue<String> recQueue = new myQueue<>();
        ArrayList<String> value = new ArrayList<>();
        try
        {
            File input = new File(fileName);
            Scanner read = new Scanner (input);
            read.useDelimiter(",");
            File file = new File(outfile);
            FileWriter out = new FileWriter(file);
            String temp;

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
                        myqueue.add(Temp2);
                        recQueue.add(Temp2);
                        Temp2="";
                    }
                }
                myqueue.add(Temp2);
                recQueue.add(Temp2);
                Temp2="";
            }


            System.out.printf("\nFIRST READING VALUE\n");
            System.out.println(myqueue.toString());

            System.out.printf("\nREVERSE VALUE USING LOOP\n");
            myqueue.reverse();
            System.out.println(myqueue.toString()+"\n");

            System.out.printf("\nREVERSE VALUE USING RECURSIVE CALL \n");
            myqueue.reserve(recQueue);
            System.out.println(recQueue.toString());

            out.write(myqueue.toString()+"\n");
            out.write(recQueue.toString());
            out.flush();

        }catch (Exception e) {
             System.out.println("Exception caught: " + e);
        }
    }




}