package com.example.uen229.mydagger2application.Sandwitches;

import com.example.uen229.mydagger2application.butters.AlmondButter;
import com.example.uen229.mydagger2application.butters.CashewButter;
import com.example.uen229.mydagger2application.component.scopes.SandwitchScope;

import dagger.Module;
import dagger.Provides;

@Module
public class SandwichModule {

    @Provides
    @SandwitchScope
    CashewSandwich ProvidesCashewSandwitch(CashewButter butter){
return new CashewSandwich(butter);
    }

    @Provides
    @SandwitchScope
    AlmondSandwich ProvidesAlmondSandwitch(AlmondButter butter){
        return new AlmondSandwich(butter);
    }
}
