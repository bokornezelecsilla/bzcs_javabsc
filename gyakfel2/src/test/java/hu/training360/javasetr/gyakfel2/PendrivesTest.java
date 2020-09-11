package hu.training360.javasetr.gyakfel2;

import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class PendrivesTest {

    @Test
    public void getTestPendrives() {
        List<Pendrive> pendrives = new ArrayList<Pendrive>();

        pendrives.add(new Pendrive("Pen1", 20, 20000));
        pendrives.add(new Pendrive("Pen2", 10, 20000));
        pendrives.add(new Pendrive("Pen3", 20, 30000));
        pendrives.add(new Pendrive("Pen4", 30, 21000));

        System.out.println("Legjobb:" + Pendrives.best(pendrives));

        System.out.println("Legolcsóbb:" + Pendrives.cheapest(pendrives));

        System.out.println("Emelés előtt:");
        for(Pendrive p : pendrives)
        {
            System.out.println(p);
        }
        Pendrives.risePriceWhereCapacity(pendrives,10,30);
        System.out.println("Emelés után:");
        for(Pendrive p : pendrives)
        {
            System.out.println(p);
        }


    }
}
