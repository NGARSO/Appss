import java.util.Scanner;

public interface IProduit {
    Produit saisie();
    void affichage();
}

public abstract class Produit implements IProduit {
    protected String ref;
    protected String libelle;
    protected double quantite;
    protected int prix;

    @Override
    public Produit saisie() {
        String qt;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir la référence : ");
        ref = scanner.nextLine();
        System.out.print("Saisir libelle : ");
        libelle = scanner.nextLine();
        System.out.print("Saisir quantite : ");
        qt = scanner.nextLine();
        quantite = Integer.parseInt(qt);
        System.out.print("Saisir prix : ");
        qt = scanner.nextLine();
        prix = Integer.parseInt(qt);
        return this;
    }


    @Override
    public void affichage() {
        System.out.println("Référence : " + ref);
        System.out.println("Libellé : " + libelle);
        System.out.println("Quantité : " + quantite);
        System.out.println("Prix : " + prix);
    }
}

public class ProduitImpl extends Produit {
    public ProduitImpl(String ref, String libelle, double quantite, int prix) {
        this.ref = ref;
        this.libelle = libelle;
        this.quantite = quantite;
        this.prix = prix;
    }
}

public class Main {
    public static void main(String[] args) {
        Produit produit = new ProduitImpl("P123", "Lait", 10, 20);
        produit.saisie();
        produit.affichage();
    }
}
