package com.example.uen229.mydagger2application.Sandwitches;

import com.example.uen229.mydagger2application.butters.Butter;
import com.example.uen229.mydagger2application.butters.CashewButter;

/**
 * Created by uen229 on 12/20/15.
 */
public class CashewSandwich {

    Butter butter;
    public CashewSandwich(CashewButter cashewButter){
        this.butter=cashewButter;
    }

    @Override
    public String toString() {
        return "CashewSandwich{" +
                "butter=" + butter +
                '}';
    }
}
