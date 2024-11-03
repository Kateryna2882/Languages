 class SinoTibetan extends Language {
     SinoTibetan (String languageName, int speakers) {
         super(languageName, speakers, "Asia", "subject-object-verb", true,
                 " man and woman");
         if(languageName.contains("Chinese")){
             this.wordOrder = "subject-verb-object";
         }
     }
}
