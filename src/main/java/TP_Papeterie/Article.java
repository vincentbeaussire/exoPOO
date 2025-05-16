package TP_Papeterie;

public class Article {
    private int refUnique;

    public Article(int refUnique) {
        this.refUnique = refUnique;
    }

    public int getRefUnique() {
        return refUnique;
    }

    public void setRefUnique(int refUnique) {
        this.refUnique = refUnique;
    }

    @Override
    public String toString() {
        return "Article{" +
                "refUnique=" + refUnique +
                '}';
    }
}
