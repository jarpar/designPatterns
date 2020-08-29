package abstractFactory;

import abstractFactory.Opony;
import abstractFactory.Silnik;
import abstractFactory.Swiatla;

public interface FabrykaCzesciSamochodowych {

    Silnik utworzSilnik();

    Swiatla utworzSwiatla();

    Opony utworzOpony();
}
