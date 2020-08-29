package abstractFactory;

import abstractFactory.czesciEkonomiczne.FabrykaEkonomicznychCzesciSamochodowych;
import abstractFactory.czesciluksusowe.FabrykaLuksusowychCzesciSamochodowych;

public class Program {

    public static void main(String[] args) {

        FabrykaCzesciSamochodowych fabrykaCzesciSamochodowych = new FabrykaEkonomicznychCzesciSamochodowych();

        Silnik silnik = fabrykaCzesciSamochodowych.utworzSilnik();
        silnik.utworz();

        Swiatla swiatla = fabrykaCzesciSamochodowych.utworzSwiatla();
        swiatla.utworz();

        Opony opony = fabrykaCzesciSamochodowych.utworzOpony();
        opony.utworz();

        System.out.println();

        fabrykaCzesciSamochodowych = new FabrykaLuksusowychCzesciSamochodowych();

        silnik = fabrykaCzesciSamochodowych.utworzSilnik();
        silnik.utworz();

        swiatla = fabrykaCzesciSamochodowych.utworzSwiatla();
        swiatla.utworz();

        opony = fabrykaCzesciSamochodowych.utworzOpony();
        opony.utworz();
    }
}
