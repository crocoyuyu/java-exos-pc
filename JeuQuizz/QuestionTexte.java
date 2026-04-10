package jeuquizz;

public class QuestionTexte extends Question {
    String intitule;
    String[] bonnereponse;//on peut aussi faire un arraylist pour utiliser contains dans isbonnereponse
/*
    public QuestionTexte(String q, String s) {
        note = 1;
        intitule=q;
        bonnereponse=new String[1];
        bonnereponse[0]=s;
    }
*/    
    //String... tableau a la volee!
    public QuestionTexte(String q, String... s) {
        note = 1;
        intitule=q;
        bonnereponse=s;
    }
/*    
    public QuestionTexte(String q, String[] s, int n) {
        intitule=q;
        bonnereponse=s;   
        note=n;
    }
*/    
    @Override
    public String getIntitule() {
        return intitule+" ? \n"; 
    }
        

    @Override
    public boolean isBonneReponse(String s) {
        boolean bonne=false;
        for (String bonnerep : bonnereponse) {
            if (s.equals(bonnerep)) {
                bonne=true;
            }//faut pas mettre else
        }
        return bonne;
    }
         
}

