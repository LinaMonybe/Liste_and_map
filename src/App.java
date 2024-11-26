import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        VoteSystem v=new VoteSystem();
        int choice=0;
        System.out.println("Bienvenue!");
        while(choice!=5){
        System.out.println(" \n 1. Ajouter un candidat\r\n" + //
                        " 2. Voter pour un candidat\r\n" + //
                        " 3. Afficher les résultats\r\n" + //
                        " 4. Afficher le gagnant\r\n" + //
                        " 5. Quitter" );
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Choisissez une option :");
                        choice = sc.nextInt();
                        sc.nextLine();
    
         if(choice==1){
            
            System.out.println("Entrez le nom du candidat");
            String nom=sc.nextLine();
            v.ajouterCandidat(nom);
         }
         else if(choice==2){
           
            System.out.println("Entrez le nom du candidat");
            String nom=sc.nextLine();
            v.voter(nom);
         }
         else if(choice==3){
            v.afficherResultats();
         }
         else if(choice==4){
            v.obtenirGagnant();
         }
         else if(choice==5){
            System.out.println("Au revoir!");
            System.exit(0);
         }
         else{
            System.out.println("Choix non valide");
         }
 }}
}
