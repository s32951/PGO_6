public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze[] zwierzeta = {
                new Lew("Lew", 5),
                new Orzel("Orzeł", 3),
                new Waz("Wąż", 2)
        };

        for (Zwierze z : zwierzeta) {
            z.wyswietlInformacje();
            System.out.println("Dźwięk: " + z.wydajDzwiek());
            System.out.println("Ruch: " + z.poruszSie());
            System.out.println("Środowisko: " + z.srodowiskoNaturalne());
            System.out.println();
        }
    }
}
