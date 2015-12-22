package com.example.uen229.mydagger2application.component;

import com.example.uen229.mydagger2application.butters.ButterModule;
import com.example.uen229.mydagger2application.butters.CashewButter;

import dagger.Component;

/**
 * Created by uen229 on 12/20/15.
 */
/**
 * remember,Components connect @Modules With @Inject
 */

//@ButterScope
@Component(modules={ButterModule.class})

public interface ButterComponent {
     //these are for our whatever class depends on butter
    // AlmondButter ProvideAlmondButter();
     CashewButter ProvideCashewButter();
}

