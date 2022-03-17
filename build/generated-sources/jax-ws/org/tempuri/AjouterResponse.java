
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AjouterResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ajouterResult"
})
@XmlRootElement(name = "AjouterResponse")
public class AjouterResponse {

    @XmlElement(name = "AjouterResult")
    protected boolean ajouterResult;

    /**
     * Obtient la valeur de la propriété ajouterResult.
     * 
     */
    public boolean isAjouterResult() {
        return ajouterResult;
    }

    /**
     * Définit la valeur de la propriété ajouterResult.
     * 
     */
    public void setAjouterResult(boolean value) {
        this.ajouterResult = value;
    }

}
