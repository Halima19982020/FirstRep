
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AjouterV_QNAME = new QName("http://service/", "AjouterV");
    private final static QName _AjouterVResponse_QNAME = new QName("http://service/", "AjouterVResponse");
    private final static QName _AjouterVoiture_QNAME = new QName("http://service/", "AjouterVoiture");
    private final static QName _AjouterVoitureResponse_QNAME = new QName("http://service/", "AjouterVoitureResponse");
    private final static QName _Afficher_QNAME = new QName("http://service/", "afficher");
    private final static QName _AfficherResponse_QNAME = new QName("http://service/", "afficherResponse");
    private final static QName _Delete_QNAME = new QName("http://service/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://service/", "deleteResponse");
    private final static QName _GetSingledem_QNAME = new QName("http://service/", "getSingledem");
    private final static QName _GetSingledemResponse_QNAME = new QName("http://service/", "getSingledemResponse");
    private final static QName _Modifier_QNAME = new QName("http://service/", "modifier");
    private final static QName _ModifierResponse_QNAME = new QName("http://service/", "modifierResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AjouterV }
     * 
     */
    public AjouterV createAjouterV() {
        return new AjouterV();
    }

    /**
     * Create an instance of {@link AjouterVResponse }
     * 
     */
    public AjouterVResponse createAjouterVResponse() {
        return new AjouterVResponse();
    }

    /**
     * Create an instance of {@link AjouterVoiture }
     * 
     */
    public AjouterVoiture createAjouterVoiture() {
        return new AjouterVoiture();
    }

    /**
     * Create an instance of {@link AjouterVoitureResponse }
     * 
     */
    public AjouterVoitureResponse createAjouterVoitureResponse() {
        return new AjouterVoitureResponse();
    }

    /**
     * Create an instance of {@link Afficher }
     * 
     */
    public Afficher createAfficher() {
        return new Afficher();
    }

    /**
     * Create an instance of {@link AfficherResponse }
     * 
     */
    public AfficherResponse createAfficherResponse() {
        return new AfficherResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link GetSingledem }
     * 
     */
    public GetSingledem createGetSingledem() {
        return new GetSingledem();
    }

    /**
     * Create an instance of {@link GetSingledemResponse }
     * 
     */
    public GetSingledemResponse createGetSingledemResponse() {
        return new GetSingledemResponse();
    }

    /**
     * Create an instance of {@link Modifier }
     * 
     */
    public Modifier createModifier() {
        return new Modifier();
    }

    /**
     * Create an instance of {@link ModifierResponse }
     * 
     */
    public ModifierResponse createModifierResponse() {
        return new ModifierResponse();
    }

    /**
     * Create an instance of {@link Voiture }
     * 
     */
    public Voiture createVoiture() {
        return new Voiture();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterV }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AjouterV")
    public JAXBElement<AjouterV> createAjouterV(AjouterV value) {
        return new JAXBElement<AjouterV>(_AjouterV_QNAME, AjouterV.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterVResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AjouterVResponse")
    public JAXBElement<AjouterVResponse> createAjouterVResponse(AjouterVResponse value) {
        return new JAXBElement<AjouterVResponse>(_AjouterVResponse_QNAME, AjouterVResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterVoiture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AjouterVoiture")
    public JAXBElement<AjouterVoiture> createAjouterVoiture(AjouterVoiture value) {
        return new JAXBElement<AjouterVoiture>(_AjouterVoiture_QNAME, AjouterVoiture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterVoitureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AjouterVoitureResponse")
    public JAXBElement<AjouterVoitureResponse> createAjouterVoitureResponse(AjouterVoitureResponse value) {
        return new JAXBElement<AjouterVoitureResponse>(_AjouterVoitureResponse_QNAME, AjouterVoitureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Afficher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "afficher")
    public JAXBElement<Afficher> createAfficher(Afficher value) {
        return new JAXBElement<Afficher>(_Afficher_QNAME, Afficher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "afficherResponse")
    public JAXBElement<AfficherResponse> createAfficherResponse(AfficherResponse value) {
        return new JAXBElement<AfficherResponse>(_AfficherResponse_QNAME, AfficherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSingledem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getSingledem")
    public JAXBElement<GetSingledem> createGetSingledem(GetSingledem value) {
        return new JAXBElement<GetSingledem>(_GetSingledem_QNAME, GetSingledem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSingledemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getSingledemResponse")
    public JAXBElement<GetSingledemResponse> createGetSingledemResponse(GetSingledemResponse value) {
        return new JAXBElement<GetSingledemResponse>(_GetSingledemResponse_QNAME, GetSingledemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "modifier")
    public JAXBElement<Modifier> createModifier(Modifier value) {
        return new JAXBElement<Modifier>(_Modifier_QNAME, Modifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "modifierResponse")
    public JAXBElement<ModifierResponse> createModifierResponse(ModifierResponse value) {
        return new JAXBElement<ModifierResponse>(_ModifierResponse_QNAME, ModifierResponse.class, null, value);
    }

}
