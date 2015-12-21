package com.example.uen229.mydagger2application.component;


import com.example.uen229.mydagger2application.MainActivity;
import com.example.uen229.mydagger2application.Sandwitches.CashewSandwich;
import com.example.uen229.mydagger2application.Sandwitches.SandwichModule;
import com.example.uen229.mydagger2application.component.scopes.SandwitchScope;

import dagger.Component;

@SandwitchScope
@Component(dependencies = ButterComponent.class, modules = SandwichModule.class)
public interface SandwichComponent {
    CashewSandwich ProvideCashewSandwitch();
    void inject (MainActivity mainactivity);
}
