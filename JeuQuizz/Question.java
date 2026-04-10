package jeuquizz;

public abstract class Question{
    int note=1;

    // doit retourner une chaine de caractères contenant le texte de la question
    public abstract String getIntitule();
    //doit retourner true si la chaine s passée en argument est une bonne réponse pour cette question
    public abstract boolean isBonneReponse(String s);
    
    public void Getnotes(int n){
        note=n;
    }
}

//il donne juste un canva ou un cdc 
//on donne la fonction mais on donne pas le corps