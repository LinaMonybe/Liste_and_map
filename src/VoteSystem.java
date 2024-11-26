import java.util.*;

public class VoteSystem {
  
    Map<String,Candidat> map=new HashMap<>();
    List<Candidat> listri=new ArrayList<>();


    void ajouterCandidat(String nom){
      if(map.containsKey(nom))
      {
        System.out.println("Candidat deja existant");
      }
      else{
        Candidat candidat=new Candidat(nom);
        map.put(nom,candidat);
        System.out.println("Candidat ajoute avec succes");
        listri.addAll(map.values());
      }
      }
    

    void voter(String nom){
      if(!map.containsKey(nom)){
        System.out.println("Candidat doesnt exist !");
      }  
      else{
        Candidat candidat=map.get(nom);
        candidat.ajouterVote();
        System.out.println("Vote ajoute avec succes");
        listri.addAll(map.values());
      }
    }

    void afficherResultats(){
      if(listri.isEmpty()){
        System.out.println("Pas de vote pour le moment");
      }
      else{
        listri.clear();
        listri.addAll(map.values());
          listri.sort((x,y)->Integer.compare(y.getVote(),x.getVote()));

       for(Candidat x :listri){
        System.out.println(x);
       }}
        
    }


    void obtenirGagnant(){
      if(listri.isEmpty()){
        System.out.println("Pas de candidat !");
        }
        else{
          System.out.println("Gagnant est : "+ listri.get(0));
        }
    }
    
}
