package classes;

public class Produit {
    public Integer noProduit;
    public String nom;
    public Double prix;
    public Boolean taxable;

    public Produit(Integer noProduit, String nom, Double prix, Boolean taxable) {
        this.noProduit = noProduit;
        this.nom = nom;
        this.prix = prix;
        this.taxable = taxable;
    }

    public Integer getNoProduit() {
        return noProduit;
    }

    public void setNoProduit(Integer noProduit) {
        this.noProduit = noProduit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        nom = nom;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        prix = prix;
    }

    public Boolean getTaxable() {
        return taxable;
    }

    public void setTaxable(Boolean taxable) {
        taxable = taxable;
    }
}
