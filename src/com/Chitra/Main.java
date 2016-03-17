package com.Chitra;

import java.util.*;
// this is an object oriented programming for lake-runtime program
public class Main
{

    public static void main(String[] args)
    {
        // initial count to 10 ;can be according to the requirement
        int InitialCount = 10;
        // a list to store lake objects
        List<Lake> LakeObjects = new ArrayList<>();
        //a hash map to save key and value for lake objects
        HashMap<String,List<Double>> Temp = new HashMap<>();
        // a loop to
        for (int i = 0; i < InitialCount; i++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Enter the name of the lake");
            String LakeName = scanner.next();
            // validation check
            while (true)
            {
                try
                {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Enter the time taken for running");
                    Double Runtime = scanner1.nextDouble();
                    Lake Lakes = new Lake(LakeName,Runtime);
                    LakeObjects.add(Lakes);
                    break;

                }

                catch (InputMismatchException ime)
                {
                    System.out.println("Please enter double value");
                    continue;

                }

            }

        }
        // loop to check every object to append runtime for each key
        for (Lake lk:LakeObjects)
        {
            Temp = lk.DataAnalysis(Temp);

        }
        // to get minimum out of run times list getting from hashmap and stored into temp
        for (String key:Temp.keySet()
             )
        {
            Double Min = Collections.min(Temp.get(key));
            System.out.println(" The fastest score for the lake " + key + " is " + Min);
        }


    }

}

