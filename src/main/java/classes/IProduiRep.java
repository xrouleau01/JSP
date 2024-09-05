package classes;

import java.util.ArrayList;

public interface IProduiRep {
    public ArrayList<Produit> getProduits();
    public void addProduit(Produit p);
    public void removeProduit(Produit p);
    public Produit getProduit(int id);
    public void modifyProduit(Produit p);
}
