package com.example.uen229.mydagger2application.butters;

import com.example.uen229.mydagger2application.component.scopes.ButterScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by uen229 on 12/20/15.
 */

@Module
public class ButterModule {
/*
    @Provides
    //@ButterScope
    AlmondButter ProvideAlmondButter(){
        return new AlmondButter();

    }
*/
    @Provides
   @ButterScope
    CashewButter ProvideCashewButter(){
        return new CashewButter();

    }
}
