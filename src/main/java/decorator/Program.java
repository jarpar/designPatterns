package decorator;

public class Program {

    public static void main(String[] args) {

        Napoj napoj = new Bezkofeinowa();
        napoj = new Mleko(napoj);
        napoj = new Mleko(napoj);
        napoj = new Czekolada(napoj);

        Napoj napoj2 = new Czekolada(
                new Mleko(
                        new Mleko(
                                new Bezkofeinowa())));

        System.out.println(napoj.pobierzOpis());
    }
}
