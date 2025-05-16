package TP_Papeterie;

public class Facture extends ArticleUnitaire {

    private static int compteurFactures = 0;

    private int numeroFacture;
    private String client;
    private String date;
    private String[] lignesAchat;
    private int nbLignes;

    private static final int maxLignes = 10;

    public Facture(int refUnique, String nomArticle, double prix) {
        super(refUnique, nomArticle, prix);
    }


    public void ajouterLigne() {
        int totalNombreLignes = numeroFacture += nbLignes;
    }

    public void getPrixTotal() {
        double prixTotal = quantité * prix;
    }

    public static int getCompteurFactures() {
        return compteurFactures;
    }

    public static void setCompteurFactures(int compteurFactures) {
        Facture.compteurFactures = compteurFactures;
    }

    public int getNumeroFacture() {
        return numeroFacture;
    }

    public void setNumeroFacture(int numeroFacture) {
        this.numeroFacture = numeroFacture;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String[] getLignesAchat() {
        return lignesAchat;
    }

    public void setLignesAchat(String[] lignesAchat) {
        this.lignesAchat = lignesAchat;
    }

    public int getNbLignes() {
        return nbLignes;
    }

    public void setNbLignes(int nbLignes) {
        this.nbLignes = nbLignes;
    }


}
