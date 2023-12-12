package com.surreal.fragment;

import org.springframework.stereotype.Component;

@Component
public class Fragment1 {
    
    private final String narrative = "Fragment 1 of the distributed narrative";
    
    public String getNarrative() {
        return narrative;
    }
}