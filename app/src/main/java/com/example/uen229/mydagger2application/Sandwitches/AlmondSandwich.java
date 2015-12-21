package com.example.uen229.mydagger2application.Sandwitches;

import com.example.uen229.mydagger2application.butters.AlmondButter;
import com.example.uen229.mydagger2application.butters.Butter;

/**
 * Created by uen229 on 12/20/15.
 */
public class AlmondSandwich {

    Butter butter;
    public AlmondSandwich(AlmondButter almondButter){
        this.butter=almondButter;
    }

    @Override
    public String toString() {
        return "AlmondSandwich{" +
                "butter=" + butter +
                '}';
    }
}
