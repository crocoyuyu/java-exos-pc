package jeuquizz;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JeuQuizz {

    public static void main(String[] args) {
        ArrayList<Question> q = new ArrayList<Question>();//on ne peut qu'utiliser une classe globale qui englobe toutes les sous classes
        q.add(new QuestionTexte("Qui a ecrit les Miserables","Hugo","Victor","Victor Hugo"));
        q.add(new QuestionTexte("Qui a ecrit le Sang d'un poète","Jean Cocteau"));
        Question q2=new QuestionTexte("Qui a ecrit le Bateau ivre",new String[]{"Rimbaud","Arthur","Arthur Rimbaud"});
        q.add(q2);
        q2.Getnotes(3);
        q.add(new QuestionMultiChoix("Baudelaire est de quelle nationalite",3,"UK","Italie","FR"));
        q.add(new QuestionNum("Quel est la moyenne de l'age des diplomes pise",24,2));
        q.add(new QuestionNum("Quel est l'age de Christophe",55,5,5));
        lancerJeu(q);
    }
    
    public static void lancerJeu(ArrayList<Question> liste){
        Scanner cs = new Scanner(System.in);
        int score = 0;
        int nbcorrect=0;
        int scoretotal=0;
        //Pour chaque question dans la liste, on affiche l'intitulé
        //on repere la question avec scanneur
        //on verifie si la rep est bonne
        for(Question q:liste){
            //System.out.print(q.getIntitule());
            //String rep =cs.nextLine();
            String rep =  JOptionPane.showInputDialog(null, q.getIntitule());
            scoretotal=scoretotal+q.note;
            if(q.isBonneReponse(rep)){
                JOptionPane.showMessageDialog(null,"C'est la bonne reponse \n");
                score=score+q.note;
                nbcorrect++;
            }
            else{
                JOptionPane.showMessageDialog(null,"Ce n'est pas la bonne reponse \n");
            }
        }
        
        if(nbcorrect==0||nbcorrect==1){
            JOptionPane.showMessageDialog(null,"Vous avez eu "+nbcorrect+" reponse correcte sur "+liste.size()+"\n");
            JOptionPane.showMessageDialog(null,"Vous avez eu "+score+" points au total sur "+scoretotal+"\n");
        }
        else{
            JOptionPane.showMessageDialog(null,"Vous avez eu "+nbcorrect+" reponses correctes sur "+liste.size()+"\n");
            JOptionPane.showMessageDialog(null,"Vous avez eu "+score+" points au total sur "+scoretotal+"\n");
        }
        
    }
}

