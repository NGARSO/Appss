public interface IArticle {
    Article saisie();
    void affichage(Article a);
}

public interface IChemise {
    Chemise saisie();
    void affichage(Chemise c);
}

public interface IMontre {
    Montre saisie();
    void affichage(Montre m);
}

public abstract class Article {
        protected int id;
        protected String lib;
        public Article() {}

        public Article(int id, String lib) {
            this.id = id;
            this.lib = lib;
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLib() {
            return lib;
        }

        public void setLib(String lib) {
            this.lib = lib;
        }
}


public class ArticleImpl implements IArticle{
        public Article saisie() {
            return new Article() {};
        }
        public void affichage(Article a) {
            System.out.println("ID: " + a.getId());
            System.out.println("Libellé: " + a.getLib());
        }
}

public class Chemise extends Article{
        private String couture;
        public Chemise() {}
        public Chemise(int id, String lib, String couture) {
            super(id, lib);
            this.couture = couture;
        }
        public String getCouture() {
            return couture;
        }

        public void setCouture(String couture) {
            this.couture = couture;
        }
}


public class ChemiseImpl implements IChemise {

        public Chemise saisie() {
            return new Chemise(1, "Chemise Homme", "Couture Slim");
        }

        public void affichage(Chemise c) {
            System.out.println("ID: " + c.getId());
            System.out.println("Libellé: " + c.getLib());
            System.out.println("Couture: " + c.getCouture());
        }
}


public class Montre extends Article {
        private String nature;
        public Montre() {}

        public Montre(int id, String lib, String nature) {
            super(id, lib);
            this.nature = nature;
        }
        public String getNature() {
            return nature;
        }

        public void setNature(String nature) {
            this.nature = nature;
        }
}

public class MontreImpl implements IMontre {
        public Montre saisie() {
            return new Montre(2, "Montre Luxe", "Quartz");
        }
        public void affichage(Montre m) {
            System.out.println("ID: " + m.getId());
            System.out.println("Libellé: " + m.getLib());
            System.out.println("Nature: " + m.getNature());
        }
}


public class Main {
    public static void main(String[] args) {
        IChemise chemiseImpl = new ChemiseImpl();
        Chemise chemise = chemiseImpl.saisie();
        chemiseImpl.affichage(chemise);

        IMontre montreImpl = new MontreImpl();
        Montre montre = montreImpl.saisie();
        montreImpl.affichage(montre);
    }
}