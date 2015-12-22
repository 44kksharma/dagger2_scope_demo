package com.example.uen229.mydagger2application.utensils;

import com.example.uen229.mydagger2application.component.scopes.SandwitchScope;

import javax.inject.Inject;


@SandwitchScope
public class Knife {
    int count=0;

    @Inject
    public Knife(){
        System.out.println("a spreading knife has been created");
    };

    @Override
    public String toString() {
        return "Knife{" +
                "count=" + ++count +
                '}';
    }
}
