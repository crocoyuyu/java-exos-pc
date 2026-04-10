package jeuquizz;

public class QuestionNum extends Question {
    int marge;
    String intitule;
    int bonnereponse;

    public QuestionNum(String q, int s, int m) {
        intitule=q;
        bonnereponse=s;    
        marge=m;
        note=1;
    }
    
    public QuestionNum(String q, int s, int m, int n) {
        intitule=q;
        bonnereponse=s;    
        marge=m;
        note=n;
    }

    @Override
    public String getIntitule() {
        return intitule+" (a "+marge+" % pres) "+" ? \n"; 
    }
        

    @Override
    public boolean isBonneReponse(String s) {
        int n=Integer.parseInt(s);
        return ((n>=bonnereponse*(1+(marge/100)))&&n<=(bonnereponse*(1-(marge/100))));
        //à rajouter le contrôle de saisie si ça renvoie  NumberFormatException
    }
    
}
