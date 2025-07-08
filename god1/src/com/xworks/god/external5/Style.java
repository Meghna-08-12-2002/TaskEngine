package com.xworks.god.external5;

import com.xworks.god.internal5.Comb;

public class Style {
    public Style() {
        System.out.println("Style constructor called");
    }

    public static void apply() {
        Comb comb = new Comb();
        Comb.clean();
    }
}
