 class Language {
     protected String name;
     protected int numSpeakers;
     protected String regionsSpoken;
     protected String wordOrder;
     protected boolean isIntonational;
     protected String genderSystem;

     Language(String langName, int speakers, String regions, String wdOrder,
              boolean isIntonational, String genderSystem) {
         this.name = langName;
         this.numSpeakers = speakers;
         this.regionsSpoken = regions;
         this.wordOrder = wdOrder;
         this.isIntonational = isIntonational;
         this.genderSystem = genderSystem;
     }
     public void getInfo() {
         System.out.println(this.name + "is spoken by " +  this.numSpeakers
                 + "people mainly in " + this.regionsSpoken + ".");
         System.out.println("The language follows the word order: "
                 +  this.wordOrder);
         System.out.println("Мова: " + name);
         System.out.println("Регіон: " + regionsSpoken);
         System.out.println("Кількість мовців: " + numSpeakers);
         System.out.println("Інтонаційна: " + (isIntonational ? "так" : "ні"));
         System.out.println("Система статей: " + genderSystem);
         System.out.println("---------------------------");
     }
     public void setRegion(String region) {
         this.regionsSpoken = region;
     }

     public void setSpeakers(int speakers) {
         this.numSpeakers = speakers;
     }

     public void changeWordOrder() {
         System.out.println(name + ": порядок слів змінено.");
     }
     @Override
     public String toString() {
         return String.format(
                 "Мова: %s\nРегіон: %s\nКількість мовців: %d\nІнтонаційна: %s\nСистема статей: %s\n---------------------------",
                 name, regionsSpoken, numSpeakers, isIntonational ? "так" : "ні", genderSystem);
     }
     public static void main (String[] args){
         Language ukraine = new Language("Ukrainian",
                 27000000, "Ukraine", "SOV",
                 true, "Northern Ireland");
         ukraine.getInfo();
         Mayan kiche = new Mayan("Ki'che'", 2330000);
         kiche.getInfo();
         SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
         mandarin.getInfo();
         SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
         burmese.getInfo();
     }
}
