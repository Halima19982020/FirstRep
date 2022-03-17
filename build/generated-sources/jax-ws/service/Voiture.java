
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour voiture complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="voiture"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boiteVitesse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carburant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idVoiture" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxPersonnes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="statut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voiture", propOrder = {
    "boiteVitesse",
    "carburant",
    "idVoiture",
    "image",
    "marque",
    "maxPersonnes",
    "prix",
    "statut",
    "type"
})
public class Voiture {

    protected String boiteVitesse;
    protected String carburant;
    protected int idVoiture;
    protected String image;
    protected String marque;
    protected int maxPersonnes;
    protected int prix;
    protected String statut;
    protected String type;

    /**
     * Obtient la valeur de la propriété boiteVitesse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoiteVitesse() {
        return boiteVitesse;
    }

    /**
     * Définit la valeur de la propriété boiteVitesse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoiteVitesse(String value) {
        this.boiteVitesse = value;
    }

    /**
     * Obtient la valeur de la propriété carburant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarburant() {
        return carburant;
    }

    /**
     * Définit la valeur de la propriété carburant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarburant(String value) {
        this.carburant = value;
    }

    /**
     * Obtient la valeur de la propriété idVoiture.
     * 
     */
    public int getIdVoiture() {
        return idVoiture;
    }

    /**
     * Définit la valeur de la propriété idVoiture.
     * 
     */
    public void setIdVoiture(int value) {
        this.idVoiture = value;
    }

    /**
     * Obtient la valeur de la propriété image.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Définit la valeur de la propriété image.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Obtient la valeur de la propriété marque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarque() {
        return marque;
    }

    /**
     * Définit la valeur de la propriété marque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarque(String value) {
        this.marque = value;
    }

    /**
     * Obtient la valeur de la propriété maxPersonnes.
     * 
     */
    public int getMaxPersonnes() {
        return maxPersonnes;
    }

    /**
     * Définit la valeur de la propriété maxPersonnes.
     * 
     */
    public void setMaxPersonnes(int value) {
        this.maxPersonnes = value;
    }

    /**
     * Obtient la valeur de la propriété prix.
     * 
     */
    public int getPrix() {
        return prix;
    }

    /**
     * Définit la valeur de la propriété prix.
     * 
     */
    public void setPrix(int value) {
        this.prix = value;
    }

    /**
     * Obtient la valeur de la propriété statut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatut() {
        return statut;
    }

    /**
     * Définit la valeur de la propriété statut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatut(String value) {
        this.statut = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
