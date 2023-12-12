package com.surreal.fragment;

import org.springframework.stereotype.Component;

@Component
public class Fragment1 {
    
    private final String narrative = "The first echo appeared in the void";
    
    public String getNarrative() {
        return narrative;
    }
}