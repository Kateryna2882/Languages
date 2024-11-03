public class SignLanguage extends Language {
    SignLanguage(String langName, int speakers, String regions, String wdOrder,
                 boolean isIntonational) {
        super(langName, speakers, regions, wdOrder, isIntonational, "no");
    }
    @Override
    public void getInfo() {
        System.out.println("Жестова мова: " + name);
        super.getInfo();
    }
}
