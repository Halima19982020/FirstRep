/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Lenovo
 */
public class Voiture {
    private int idVoiture;
    private String marque;
    private String carburant;
    private String boiteVitesse;
    private int maxPersonnes;
    private String prix;
    private String type;
    private String ville;
    private String image;
    private String statut;
    
    public Voiture(){
        
    }

    public Voiture(int idVoiture, String marque, String carburant, String boiteVitesse, int maxPersonnes, String prix, String type, String ville, String image, String statut) {
        this.idVoiture = idVoiture;
        this.marque = marque;
        this.carburant = carburant;
        this.boiteVitesse = boiteVitesse;
        this.maxPersonnes = maxPersonnes;
        this.prix = prix;
        this.type = type;
        this.ville = ville;
        this.ville = image;
        this.ville = statut;
    }

    public Voiture(String marque, String carburant, String boiteVitesse, int maxPersonnes, String prix, String type, String ville, String image, String statut) {
        this.marque = marque;
        this.carburant = carburant;
        this.boiteVitesse = boiteVitesse;
        this.maxPersonnes = maxPersonnes;
        this.prix = prix;
        this.type = type;
        this.ville = ville;
        this.ville = image;
        this.ville = statut;
    }

    public int getIdVoiture() {
        return idVoiture;
    }

    public String getMarque() {
        return marque;
    }

    public String getCarburant() {
        return carburant;
    }

    public String getBoiteVitesse() {
        return boiteVitesse;
    }

    public int getMaxPersonnes() {
        return maxPersonnes;
    }

    public String getPrix() {
        return prix;
    }

    public String getType() {
        return type;
    }

    public String getVille() {
        return ville;
    }

    public void setIdVoiture(int idVoiture) {
        this.idVoiture = idVoiture;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public void setBoiteVitesse(String boiteVitesse) {
        this.boiteVitesse = boiteVitesse;
    }

    public void setMaxPersonnes(int maxPersonnes) {
        this.maxPersonnes = maxPersonnes;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getImage() {
        return image;
    }

    public String getStatut() {
        return statut;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    
    
}
