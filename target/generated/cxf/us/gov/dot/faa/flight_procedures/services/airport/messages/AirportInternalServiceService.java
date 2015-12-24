package us.gov.dot.faa.flight_procedures.services.airport.messages;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.3
 * 2015-07-28T11:52:41.518-04:00
 * Generated source version: 3.0.3
 * 
 */
@WebServiceClient(name = "AirportInternalServiceService", 
                  wsdlLocation = "file:/C:/FAA/eclipse-jee-luna-SR1-win32-x86_64/workspace/temporal-orchestration/airportInternal/src/main/resources/airportInternal.wsdl",
                  targetNamespace = "urn:us:gov:dot:faa:flight-procedures:services:airport:messages") 
public class AirportInternalServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:us:gov:dot:faa:flight-procedures:services:airport:messages", "AirportInternalServiceService");
    public final static QName AirportInternalServiceSoap11 = new QName("urn:us:gov:dot:faa:flight-procedures:services:airport:messages", "AirportInternalServiceSoap11");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/FAA/eclipse-jee-luna-SR1-win32-x86_64/workspace/temporal-orchestration/airportInternal/src/main/resources/airportInternal.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AirportInternalServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/FAA/eclipse-jee-luna-SR1-win32-x86_64/workspace/temporal-orchestration/airportInternal/src/main/resources/airportInternal.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AirportInternalServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AirportInternalServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AirportInternalServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AirportInternalServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AirportInternalServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AirportInternalServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns AirportInternalService
     */
    @WebEndpoint(name = "AirportInternalServiceSoap11")
    public AirportInternalService getAirportInternalServiceSoap11() {
        return super.getPort(AirportInternalServiceSoap11, AirportInternalService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirportInternalService
     */
    @WebEndpoint(name = "AirportInternalServiceSoap11")
    public AirportInternalService getAirportInternalServiceSoap11(WebServiceFeature... features) {
        return super.getPort(AirportInternalServiceSoap11, AirportInternalService.class, features);
    }

}