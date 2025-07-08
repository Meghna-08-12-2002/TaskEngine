package com.xworks.god;

import com.xworks.god.extenal10.Wildlife;
import com.xworks.god.external.Donation;
import com.xworks.god.external1.Bless;
import com.xworks.god.external2.Sunset;
import com.xworks.god.external3.Glow;
import com.xworks.god.external4.Sky;
import com.xworks.god.external5.Style;
import com.xworks.god.external6.Makeup;
import com.xworks.god.external7.Fragrance;
import com.xworks.god.external8.Bank;
import com.xworks.god.external9.BeachSide;
import com.xworks.god.internal.Trust;
import com.xworks.god.internal1.Service;
import com.xworks.god.internal10.Tree;
import com.xworks.god.internal2.Nature;
import com.xworks.god.internal3.Shine;
import com.xworks.god.internal4.Flight;
import com.xworks.god.internal5.Hair;
import com.xworks.god.internal6.Face;
import com.xworks.god.internal7.Aroma;
import com.xworks.god.internal8.Payment;
import com.xworks.god.internal9.Ocean;

public class Runner {
    public static void main(String[] args) {
        Trust trust= new Trust();
        Trust.showTempleFeatures();
        System.out.println("running in trust");
        Donation  donation= new Donation();
        Donation.accessTemplePublicMethod();
        System.out.println("running in donation");
        System.out.println("------------------------");

        Service service = new Service ();
        service .showFeatures();
        System.out.println("running in service");
        Bless bless=new Bless();
        Bless.accessMethod();
        System.out.println("running in Bless");
        System.out.println("------------------------");

        Nature nature= new Nature();
        nature.show();
        System.out.println("running in nature");
        Sunset sunset=new Sunset();
        Sunset.access();
        System.out.println("running in sunset");
        System.out.println("------------------------");

        Shine shine = new Shine();
        shine.display();
        System.out.println("running in shine");
        Glow glow = new Glow();
        Glow.use();
        System.out.println("running in glow");
        System.out.println("------------------------");

        Flight flight = new Flight();
        flight.move();
        System.out.println("running in flight");
        Sky sky = new Sky();
        Sky.fly();
        System.out.println("running in sky");
        System.out.println("------------------------");

        Hair hair = new Hair();
        hair.manage();
        System.out.println("running in hair");
        Style style = new Style();
        Style.apply();
        System.out.println("running in style");
        System.out.println("------------------------");

        Face face = new Face();
        face.glow();
        System.out.println("running in face");
        Makeup makeup = new Makeup();
        Makeup.use();
        System.out.println("running in makeup");
        System.out.println("------------------------");

        Aroma aroma = new Aroma();
        aroma.scent();
        System.out.println("running in aroma");
        Fragrance fragrance = new Fragrance();
        Fragrance.spread();
        System.out.println("running in fragrance");
        System.out.println("------------------------");

        Payment payment = new Payment();
        payment.process();
        System.out.println("running in payment");
        Bank bank = new Bank();
        Bank.access();
        System.out.println("running in bank");
        System.out.println("------------------------");

        Ocean ocean = new Ocean();
        ocean.wave();
        System.out.println("running in ocean");
        BeachSide beachSide = new BeachSide();
        BeachSide.find();
        System.out.println("running in beachSide");
        System.out.println("------------------------");

        Tree tree = new Tree();
        tree.branch();
        System.out.println("running in tree");
        Wildlife wildlife = new Wildlife();
        Wildlife.explore();
        System.out.println("running in wildlife");
        System.out.println("------------------------");
    }

}
