package abstractFactory.czesciEkonomiczne;

import abstractFactory.FabrykaCzesciSamochodowych;
import abstractFactory.Opony;
import abstractFactory.Silnik;
import abstractFactory.Swiatla;
import abstractFactory.czesciEkonomiczne.OponyEkomiczne;
import abstractFactory.czesciEkonomiczne.SilnikSpalinowy;
import abstractFactory.czesciEkonomiczne.SwiatlaHalogenowe;

public class FabrykaEkonomicznychCzesciSamochodowych implements FabrykaCzesciSamochodowych {
    @Override
    public Silnik utworzSilnik() {
        return new SilnikSpalinowy();
    }

    @Override
    public Swiatla utworzSwiatla() {
        return new SwiatlaHalogenowe();
    }

    @Override
    public Opony utworzOpony() {
        return new OponyEkomiczne();
    }
}
