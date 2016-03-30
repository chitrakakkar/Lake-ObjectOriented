package com.Chitra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by chitrakakkar on 3/16/16.
 */

//a lake class to create a lake object
public class Lake
{
    String Name;
    Double Runtime;
    //HashMap<String,List<Double>> LakeInfo = new HashMap<>();

    Lake(String name, Double runtime)
    {
        this.Name = name;
        this.Runtime = runtime;
    }

    //Your code is working, but this DataAnalysis method makes this lake depend on all of the others, and on the Main class having this HashMap.
    //A more general Lake class should store its name, and a list of times, and be able to return the fastest time from the list.
    //Then your Main method can store a list of Lakes, and call the getFastestTime() method on each List object, as needed.
    
    
    // user defined method to append runtime for lake as key and return a hashmap of key and the runtime list
    public HashMap<String,List<Double>> DataAnalysis(HashMap<String,List<Double>> LakeInfo)
    {
        if(LakeInfo.keySet().contains(this.Name))
        {
        LakeInfo.get(this.Name).add(this.Runtime);}
        else
        {
            List<Double> Runtime2 = new ArrayList<>();
            Runtime2.add(this.Runtime);
            LakeInfo.put(this.Name,Runtime2);
        }

        return LakeInfo;

    }



}
