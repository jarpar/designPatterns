package abstractFactory.czesciluksusowe;

import abstractFactory.FabrykaCzesciSamochodowych;
import abstractFactory.Opony;
import abstractFactory.Silnik;
import abstractFactory.Swiatla;

public class FabrykaLuksusowychCzesciSamochodowych implements FabrykaCzesciSamochodowych {
    @Override
    public Silnik utworzSilnik() {
        return new SilnikElektryczny();
    }

    @Override
    public Swiatla utworzSwiatla() {
        return new SwiatlaLed();
    }

    @Override
    public Opony utworzOpony() {
        return new OponyLuksusowe();
    }
}
