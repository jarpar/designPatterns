package abstractFactory;

public class Program {
    public static void main(String[] args) {
        FabrykaCzesciSamochodowych fabrykaCzesciSamochodowych = new FabrykaEkonomicznychCzesciSamochodowych();
        Silnik silnik = fabrykaCzesciSamochodowych.utworzSilnik();
        Swiatla swiatla = fabrykaCzesciSamochodowych.utwórzSwiatla();
        Opony opony = fabrykaCzesciSamochodowych.utworzOpony();

        System.out.println();

        fabrykaCzesciSamochodowych = new FabrykaLuksusowychCzesciSamochodowych();
        silnik = fabrykaCzesciSamochodowych.utworzSilnik();
         swiatla = fabrykaCzesciSamochodowych.utwórzSwiatla();
         opony = fabrykaCzesciSamochodowych.utworzOpony();
        System.out.println();
    }
}
