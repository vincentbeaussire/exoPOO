package TP_Papeterie;

public class Ligne extends ArticleUnitaire {


    public Ligne(int refUnique, String nomArticle, double prix, int quantite) {
        super(refUnique, nomArticle, prix);
    }

    public void afficheLigne() {
        System.out.println();
    }
}
