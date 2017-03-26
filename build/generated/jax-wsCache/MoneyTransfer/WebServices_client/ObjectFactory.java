
package WebServices_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WebServices_client package. 
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

    private final static QName _CompletedTransfer_QNAME = new QName("http://WebServices/", "completedTransfer");
    private final static QName _CompletedTransferResponse_QNAME = new QName("http://WebServices/", "completedTransferResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WebServices_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompletedTransfer }
     * 
     */
    public CompletedTransfer createCompletedTransfer() {
        return new CompletedTransfer();
    }

    /**
     * Create an instance of {@link CompletedTransferResponse }
     * 
     */
    public CompletedTransferResponse createCompletedTransferResponse() {
        return new CompletedTransferResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompletedTransfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "completedTransfer")
    public JAXBElement<CompletedTransfer> createCompletedTransfer(CompletedTransfer value) {
        return new JAXBElement<CompletedTransfer>(_CompletedTransfer_QNAME, CompletedTransfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompletedTransferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "completedTransferResponse")
    public JAXBElement<CompletedTransferResponse> createCompletedTransferResponse(CompletedTransferResponse value) {
        return new JAXBElement<CompletedTransferResponse>(_CompletedTransferResponse_QNAME, CompletedTransferResponse.class, null, value);
    }

}
