package com.company;
import java.util.LinkedList;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        LinkedList <Integer> numberList = new LinkedList<>();

        for( int i = 0; i < 1000;i++)
        {
            numberList.add(i);
        }

        String fname = "file 1";
        File file = new File(fname);
        if (!file.exists())
        {
            try( PrintWriter out = new PrintWriter (new File(fname)))
            {
                for (int i = 0; i < 1000; i++)
                out.print(numberList.get(i) + " ");
            }
            catch(Exception e) {System.out.println(e);}
        }


        try( Scanner in = new Scanner (new File (fname)))
        {
            LinkedList <Integer> list = new LinkedList<>();
            while(in.hasNext())
                list.add(in.nextInt());
            System.out.println(list);
        }
        catch (Exception e) {System.out.println(e);}

    }
}
