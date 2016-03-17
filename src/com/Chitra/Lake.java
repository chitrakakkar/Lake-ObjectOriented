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
