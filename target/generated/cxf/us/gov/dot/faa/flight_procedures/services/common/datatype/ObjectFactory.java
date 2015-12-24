
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.gov.dot.faa.flight_procedures.services.common.datatype package. 
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

    private final static QName _IcaoIdentifier_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:datatype", "icaoIdentifier");
    private final static QName _CountryCode_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:datatype", "countryCode");
    private final static QName _FeatureBriefExt_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:datatype", "FeatureBriefExt");
    private final static QName _RegionCode_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:datatype", "RegionCode");
    private final static QName _FeatureBrief_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:datatype", "FeatureBrief");
    private final static QName _StateCode_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:datatype", "stateCode");
    private final static QName _LocationName_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:datatype", "locationName");
    private final static QName _ServiceAreaCode_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:datatype", "ServiceAreaCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.gov.dot.faa.flight_procedures.services.common.datatype
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FeatureBriefType }
     * 
     */
    public FeatureBriefType createFeatureBriefType() {
        return new FeatureBriefType();
    }

    /**
     * Create an instance of {@link Measurement }
     * 
     */
    public Measurement createMeasurement() {
        return new Measurement();
    }

    /**
     * Create an instance of {@link FeatureIdentifierType }
     * 
     */
    public FeatureIdentifierType createFeatureIdentifierType() {
        return new FeatureIdentifierType();
    }

    /**
     * Create an instance of {@link CodeWithAuthorityType }
     * 
     */
    public CodeWithAuthorityType createCodeWithAuthorityType() {
        return new CodeWithAuthorityType();
    }

    /**
     * Create an instance of {@link DateTSOperationType }
     * 
     */
    public DateTSOperationType createDateTSOperationType() {
        return new DateTSOperationType();
    }

    /**
     * Create an instance of {@link TemporalType }
     * 
     */
    public TemporalType createTemporalType() {
        return new TemporalType();
    }

    /**
     * Create an instance of {@link AlignmentStatusMessageType }
     * 
     */
    public AlignmentStatusMessageType createAlignmentStatusMessageType() {
        return new AlignmentStatusMessageType();
    }

    /**
     * Create an instance of {@link StringWithOperatorType }
     * 
     */
    public StringWithOperatorType createStringWithOperatorType() {
        return new StringWithOperatorType();
    }

    /**
     * Create an instance of {@link ChartDateOperationType }
     * 
     */
    public ChartDateOperationType createChartDateOperationType() {
        return new ChartDateOperationType();
    }

    /**
     * Create an instance of {@link BBoxType }
     * 
     */
    public BBoxType createBBoxType() {
        return new BBoxType();
    }

    /**
     * Create an instance of {@link ValidationTaskInfoType }
     * 
     */
    public ValidationTaskInfoType createValidationTaskInfoType() {
        return new ValidationTaskInfoType();
    }

    /**
     * Create an instance of {@link IfpaValidationItemType }
     * 
     */
    public IfpaValidationItemType createIfpaValidationItemType() {
        return new IfpaValidationItemType();
    }

    /**
     * Create an instance of {@link IfpaObjectType }
     * 
     */
    public IfpaObjectType createIfpaObjectType() {
        return new IfpaObjectType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:datatype", name = "icaoIdentifier")
    public JAXBElement<String> createIcaoIdentifier(String value) {
        return new JAXBElement<String>(_IcaoIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:datatype", name = "countryCode")
    public JAXBElement<String> createCountryCode(String value) {
        return new JAXBElement<String>(_CountryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:datatype", name = "FeatureBriefExt")
    public JAXBElement<Object> createFeatureBriefExt(Object value) {
        return new JAXBElement<Object>(_FeatureBriefExt_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:datatype", name = "RegionCode")
    public JAXBElement<String> createRegionCode(String value) {
        return new JAXBElement<String>(_RegionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureBriefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:datatype", name = "FeatureBrief")
    public JAXBElement<FeatureBriefType> createFeatureBrief(FeatureBriefType value) {
        return new JAXBElement<FeatureBriefType>(_FeatureBrief_QNAME, FeatureBriefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:datatype", name = "stateCode")
    public JAXBElement<String> createStateCode(String value) {
        return new JAXBElement<String>(_StateCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:datatype", name = "locationName")
    public JAXBElement<String> createLocationName(String value) {
        return new JAXBElement<String>(_LocationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:datatype", name = "ServiceAreaCode")
    public JAXBElement<String> createServiceAreaCode(String value) {
        return new JAXBElement<String>(_ServiceAreaCode_QNAME, String.class, null, value);
    }

}
