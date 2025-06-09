public class orzel {
    public class orzel extends zwierze {
        public orzel(String nazwa, int wiek) {
            super(nazwa, wiek);
        }

        @Override
        public String wydajDzwiek() {
            return "Skrzeczenie!";
        }

        @Override
        public String poruszSie() {
            return "Lata po niebie.";
        }

        @Override
        public String srodowiskoNaturalne() {
            return "Góry";
        }
    }

}
