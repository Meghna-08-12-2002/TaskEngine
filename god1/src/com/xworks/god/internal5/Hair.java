package com.xworks.god.internal5;

public class Hair {
    public Hair() {
        System.out.println("Hair constructor called");
    }

    public static void manage() {
        Comb comb = new Comb();
        Comb.clean();
        comb.untangle();
    }
}
