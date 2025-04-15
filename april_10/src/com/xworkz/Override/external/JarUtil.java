package com.xworkz.Override.external;

import com.xworkz.Override.internal.GlassJar;
import com.xworkz.Override.internal.Jar;

public class JarUtil {
    public JarUtil() {
        System.out.println("No argument constructor in JarUtil");
    }

    public void handleJar(Jar jar) {
        if (jar != null) {
            jar.store();
            if (jar instanceof GlassJar) {
                GlassJar glass = (GlassJar) jar;
                glass.preserve();
            } else {
                System.out.println("Not a glass jar");
            }
        } else {
            System.out.println("Jar is null");
        }
    }
}
