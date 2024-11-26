
public class Candidat {
    String nom;
    int vote;

    public Candidat(String nom){
        this(nom,0);
    }
    public Candidat(String nom,int vote){
        setNom(nom);
        setVote(vote);
    }

    public String getNom(){
        return this.nom;
    }

    public int getVote(){
        return this.vote;
    }

    public void setNom(String x){
        if(x.matches("[A-Za-z]+")){
            this.nom=x;
        }else{
            System.out.println("Invalid name");
        }
    }

    public void setVote(int x){
        if(x<0){
            System.out.println("invalid votes");
        }
        else{
            this.vote=x;
        }
    }

    public void ajouterVote(){
        this.vote= getVote()+1;
    }

    @Override
    public String toString(){
        return this.nom + " - " +this.vote+" votes.";
    }



}