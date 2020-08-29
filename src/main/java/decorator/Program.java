package decorator;

public class Program {
    public static void main(String[] args) {
        Napoj napoj = new Bezkofeinowa();
        napoj = new Mleko(napoj);
        napoj = new Czekolada(napoj);

        System.out.println(napoj.pobierzOpis());
    }
}
