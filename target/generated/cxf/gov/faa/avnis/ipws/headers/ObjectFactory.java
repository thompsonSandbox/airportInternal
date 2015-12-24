
package gov.faa.avnis.ipws.headers;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.faa.avnis.ipws.headers package. 
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

    private final static QName _UserAgent_QNAME = new QName("http://www.faa.gov/avnis/ipws/headers", "UserAgent");
    private final static QName _Server_QNAME = new QName("http://www.faa.gov/avnis/ipws/headers", "Server");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.faa.avnis.ipws.headers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InterfaceVersion }
     * 
     */
    public InterfaceVersion createInterfaceVersion() {
        return new InterfaceVersion();
    }

    /**
     * Create an instance of {@link DataFormatVersion }
     * 
     */
    public DataFormatVersion createDataFormatVersion() {
        return new DataFormatVersion();
    }

    /**
     * Create an instance of {@link Codespace }
     * 
     */
    public Codespace createCodespace() {
        return new Codespace();
    }

    /**
     * Create an instance of {@link ConfigurationSetNameType }
     * 
     */
    public ConfigurationSetNameType createConfigurationSetNameType() {
        return new ConfigurationSetNameType();
    }

    /**
     * Create an instance of {@link FeatureType }
     * 
     */
    public FeatureType createFeatureType() {
        return new FeatureType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.faa.gov/avnis/ipws/headers", name = "UserAgent")
    public JAXBElement<String> createUserAgent(String value) {
        return new JAXBElement<String>(_UserAgent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.faa.gov/avnis/ipws/headers", name = "Server")
    public JAXBElement<String> createServer(String value) {
        return new JAXBElement<String>(_Server_QNAME, String.class, null, value);
    }

}
