package employes;

public class Vendeur extends employe {
    private double tauxDeVente;

    public Vendeur(int id, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        super(id, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        return 450 * tauxDeVente;
    }

    public double getTauxDeVente() {
        return tauxDeVente;
    }

    @Override
    public String getDetails() {
        return "Vendeur [ID: " + getId() + ", Nom: " + getNom() + ", Adresse: " + getAdresse() +
                ", Nbr Heures: " + getNbrHeures() + ", Taux de Vente: " + tauxDeVente + "]";
    }
}
