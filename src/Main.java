import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    ArrayList<Language> languages = new ArrayList<>();
    languages.add(new Language("Українська", 49000000, "Ukraine",
            "subject-verb-object ",
            true, "woman and men"));
        languages.add(new SignLanguage("Українська жестова мова", 2000000, "Ukraine",
                "subject-verb-object", true));

        languages.add(new IndoEuropeanLanguage("Іспанська", 90000000,
                "Іспанія, Латинська Америка", "SVO", true,
                "чоловічий, жіночий"));

        for (Language language : languages) {
            language.getInfo();
            System.out.println(language);
        }
        languages.get(0).setRegion("Канада, Україна");
        languages.get(1).changeWordOrder();
    }
}