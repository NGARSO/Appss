import java.util.Scanner;

public interface IPersonne {
    void saisie();
    void affiche();
}


public class Personne implements IPersonne {
    private String nom;
    private String prenom;


    public Personne() {}
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }



    @Override
    public void saisie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom : ");
        nom = scanner.nextLine();
        System.out.print("Entrez le prénom : ");
        prenom = scanner.nextLine();
    }

    @Override
    public void affiche() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
    }
}



public class Etudiant extends Personne {
    private String matricule;
    private double moyenne;

    public Etudiant() {}
    public Etudiant(double moyenne) {
        this.moyenne = moyenne;
        this.matricule = generateMatricule();
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public String generateMatricule() {
        return "M" + System.currentTimeMillis();
    }

    @Override
    public void saisie() {
        super.saisie();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la moyenne : ");
        moyenne = scanner.nextDouble();
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Matricule : " + matricule);
        System.out.println("Moyenne : " + moyenne);
    }
}


public class Employe extends Personne {
    private String fonction;
    private int salaire;

    public Employe() {}
    public Employe(String fonction, int salaire) {
        this.fonction = fonction;
        this.salaire = salaire;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void saisie(){
        super.saisie(); 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la fonction : ");
        fonction = scanner.nextLine();
        System.out.print("Entrez le salaire : ");
        salaire = scanner.nextInt();
    }

    @Override
    public void affiche() {
        super.affiche(); 
        System.out.println("Fonction : " + fonction);
        System.out.println("Salaire : " + salaire);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisie d'un employé :");
        Employe employe = new Employe();
        employe.saisie();
        employe.affiche();

        System.out.println("\n Saisie d'un étudiant :");
        Etudiant etudiant = new Etudiant();
        etudiant.saisie();
        etudiant.affiche();
    }
}

