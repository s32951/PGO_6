public class lew extends zwierze {
    public lew(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String wydajDzwiek() {
        return "Ryk!";
    }

    @Override
    public String poruszSie() {
        return "Biega na czterech łapach.";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Sawanna";
    }
}
