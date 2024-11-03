 class IndoEuropeanLanguage extends Language{
     IndoEuropeanLanguage(String langName, int speakers,
                          String regions, String wdOrder, boolean isIntonational,
                          String genderSystem) {
         super(langName, speakers, regions, wdOrder, isIntonational, genderSystem);
     }

     @Override
     public String toString() {
         return String.format(
                 "Мова: %s\nРегіон: %s\nКількість мовців: %d\nІнтонаційна: %s\nСистема статей:" +
                         " %s\n---------------------------",
                 name, regionsSpoken, numSpeakers, isIntonational ? "так" : "ні", genderSystem);
     }
 }
