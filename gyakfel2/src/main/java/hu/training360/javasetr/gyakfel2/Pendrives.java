package hu.training360.javasetr.gyakfel2;

import java.util.List;

public class Pendrives {

    //legjobb ár/kapcítás
    static public Pendrive best(List<Pendrive> listPendrives)
    {
        Pendrive retPendrive = listPendrives.get(0);

        for(Pendrive p : listPendrives)
        {
            if( (p.getPrice()/p.getCapacity()) < (retPendrive.getPrice()/retPendrive.getCapacity()))
            {
                retPendrive = p;
            }
        }
        return retPendrive;

    }

    //Legolcsóbb
    static public Pendrive cheapest(List<Pendrive> listPendrives)
    {
        Pendrive retPendrive = listPendrives.get(0);
        for(Pendrive p : listPendrives)
        {
            if(p.cheaperThan(retPendrive))
            {
                retPendrive = p;
            }
        }

        return retPendrive;
    }

    static public void risePriceWhereCapacity(List<Pendrive> listPendrives, int percent, int capacity)
    {
        for(Pendrive p : listPendrives)
        {
            if(p.getCapacity() == capacity)
            {
                p.risePrice(percent);
            }
       }
    }

}
