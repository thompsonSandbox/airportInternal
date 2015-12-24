
package gov.faa.avnis.ipws.faults;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.faa.avnis.ipws.faults package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.faa.avnis.ipws.faults
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link ServiceExceptionType }
     * 
     */
    public ServiceExceptionType createServiceExceptionType() {
        return new ServiceExceptionType();
    }

    /**
     * Create an instance of {@link ExceptionInformationType }
     * 
     */
    public ExceptionInformationType createExceptionInformationType() {
        return new ExceptionInformationType();
    }

    /**
     * Create an instance of {@link ServiceRouteInformationType }
     * 
     */
    public ServiceRouteInformationType createServiceRouteInformationType() {
        return new ServiceRouteInformationType();
    }

    /**
     * Create an instance of {@link ServiceLayerType }
     * 
     */
    public ServiceLayerType createServiceLayerType() {
        return new ServiceLayerType();
    }

}
