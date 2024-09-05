package classes;

import java.util.ArrayList;

public class ProduitService implements IProduiRep{

    public ArrayList<Produit> lsProduits;

    public ProduitService(){
        this.lsProduits = new ArrayList<>();
        lsProduits.add(new Produit(12345, "Banane", 3.56, true));
        lsProduits.add(new Produit(54321, "Pomme", 10.23, false));
        lsProduits.add(new Produit(13579, "Brocoli", 45.98, true));
        lsProduits.add(new Produit(97531, "Jambon", 12.09, false));
        lsProduits.add(new Produit(24680, "Lait", 34.34, true));
    }

    @Override
    public ArrayList<Produit> getProduits() {
        return lsProduits;
    }

    @Override
    public void addProduit(Produit p) {
        lsProduits.add(p);
    }

    @Override
    public void removeProduit(Produit p) {
        lsProduits.remove(p);
    }

    @Override
    public Produit getProduit(int id) {
        return lsProduits.stream().filter(p -> p.noProduit == id).findFirst().orElse(null);
    }

    @Override
    public void modifyProduit(Produit p) {
        Produit aRemplacer = getProduit(p.noProduit);
        lsProduits.set(lsProduits.indexOf(aRemplacer), p);
    }
}
