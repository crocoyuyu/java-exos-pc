package jeuquizz;

public class QuestionMultiChoix extends Question {
    String intitule;
    String[] propos;
    int bonnereponse;

    public QuestionMultiChoix(String q, int s, String... p) {
        intitule=q;
        propos=p;
        bonnereponse=s;
    }
   
    @Override
    public String getIntitule() {
       String enonce;
       enonce=intitule+" ? \n";
       for(int i=0;i<propos.length;i++){
           enonce+=(i+1)+ " ) "+propos[i]+"\n";
       }
        return enonce;
    }
        

    @Override
    public boolean isBonneReponse(String s) {
        int n=Integer.parseInt(s);
        return n==bonnereponse;
    }
         
}

