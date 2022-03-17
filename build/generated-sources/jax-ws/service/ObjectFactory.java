
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

    private final static QName _AjouterReservation_QNAME = new QName("http://service/", "AjouterReservation");
    private final static QName _AjouterReservationResponse_QNAME = new QName("http://service/", "AjouterReservationResponse");
    private final static QName _AfficherReservation_QNAME = new QName("http://service/", "afficherReservation");
    private final static QName _AfficherReservationResponse_QNAME = new QName("http://service/", "afficherReservationResponse");
    private final static QName _DeleteReservation_QNAME = new QName("http://service/", "deleteReservation");
    private final static QName _DeleteReservationResponse_QNAME = new QName("http://service/", "deleteReservationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AjouterReservation }
     * 
     */
    public AjouterReservation createAjouterReservation() {
        return new AjouterReservation();
    }

    /**
     * Create an instance of {@link AjouterReservationResponse }
     * 
     */
    public AjouterReservationResponse createAjouterReservationResponse() {
        return new AjouterReservationResponse();
    }

    /**
     * Create an instance of {@link AfficherReservation }
     * 
     */
    public AfficherReservation createAfficherReservation() {
        return new AfficherReservation();
    }

    /**
     * Create an instance of {@link AfficherReservationResponse }
     * 
     */
    public AfficherReservationResponse createAfficherReservationResponse() {
        return new AfficherReservationResponse();
    }

    /**
     * Create an instance of {@link DeleteReservation }
     * 
     */
    public DeleteReservation createDeleteReservation() {
        return new DeleteReservation();
    }

    /**
     * Create an instance of {@link DeleteReservationResponse }
     * 
     */
    public DeleteReservationResponse createDeleteReservationResponse() {
        return new DeleteReservationResponse();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AjouterReservation")
    public JAXBElement<AjouterReservation> createAjouterReservation(AjouterReservation value) {
        return new JAXBElement<AjouterReservation>(_AjouterReservation_QNAME, AjouterReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AjouterReservationResponse")
    public JAXBElement<AjouterReservationResponse> createAjouterReservationResponse(AjouterReservationResponse value) {
        return new JAXBElement<AjouterReservationResponse>(_AjouterReservationResponse_QNAME, AjouterReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "afficherReservation")
    public JAXBElement<AfficherReservation> createAfficherReservation(AfficherReservation value) {
        return new JAXBElement<AfficherReservation>(_AfficherReservation_QNAME, AfficherReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "afficherReservationResponse")
    public JAXBElement<AfficherReservationResponse> createAfficherReservationResponse(AfficherReservationResponse value) {
        return new JAXBElement<AfficherReservationResponse>(_AfficherReservationResponse_QNAME, AfficherReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteReservation")
    public JAXBElement<DeleteReservation> createDeleteReservation(DeleteReservation value) {
        return new JAXBElement<DeleteReservation>(_DeleteReservation_QNAME, DeleteReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteReservationResponse")
    public JAXBElement<DeleteReservationResponse> createDeleteReservationResponse(DeleteReservationResponse value) {
        return new JAXBElement<DeleteReservationResponse>(_DeleteReservationResponse_QNAME, DeleteReservationResponse.class, null, value);
    }

}
