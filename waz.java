public class waz extends zwierze {
    public waz(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String wydajDzwiek() {
        return "Syssss!";
    }

    @Override
    public String poruszSie() {
        return "Pełza po ziemi.";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Dżungla";
    }
}
