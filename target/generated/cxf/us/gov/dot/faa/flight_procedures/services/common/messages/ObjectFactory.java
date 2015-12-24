
package us.gov.dot.faa.flight_procedures.services.common.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import us.gov.dot.faa.flight_procedures.services.common.datatype.FeatureIdentifierType;
import us.gov.dot.faa.flight_procedures.services.common.datatype.FeatureTypeType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.gov.dot.faa.flight_procedures.services.common.messages package. 
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

    private final static QName _ProcessFeatureRequest_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:messages", "ProcessFeatureRequest");
    private final static QName _FilterCriteria_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:messages", "FilterCriteria");
    private final static QName _FeatureBriefResult_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:messages", "FeatureBriefResult");
    private final static QName _GetFeatureBrief_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:messages", "GetFeatureBrief");
    private final static QName _FeatureIdentifier_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:messages", "FeatureIdentifier");
    private final static QName _CancelledFeature_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:messages", "CancelledFeature");
    private final static QName _FeatureType_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:messages", "FeatureType");
    private final static QName _ActivatedFeature_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:messages", "ActivatedFeature");
    private final static QName _ValidatedFeature_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:messages", "ValidatedFeature");
    private final static QName _ProcessFeatureResponse_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:messages", "ProcessFeatureResponse");
    private final static QName _ValidatedItemExtension_QNAME = new QName("urn:us:gov:dot:faa:flight-procedures:services:common:messages", "ValidatedItemExtension");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.gov.dot.faa.flight_procedures.services.common.messages
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FilterCriteriaType }
     * 
     */
    public FilterCriteriaType createFilterCriteriaType() {
        return new FilterCriteriaType();
    }

    /**
     * Create an instance of {@link UpdateFeatureTemporalityRequest }
     * 
     */
    public UpdateFeatureTemporalityRequest createUpdateFeatureTemporalityRequest() {
        return new UpdateFeatureTemporalityRequest();
    }

    /**
     * Create an instance of {@link BaseUpdateRequestType }
     * 
     */
    public BaseUpdateRequestType createBaseUpdateRequestType() {
        return new BaseUpdateRequestType();
    }

    /**
     * Create an instance of {@link UpdateFeatureRequestItemType }
     * 
     */
    public UpdateFeatureRequestItemType createUpdateFeatureRequestItemType() {
        return new UpdateFeatureRequestItemType();
    }

    /**
     * Create an instance of {@link ValidateScenarioRequest }
     * 
     */
    public ValidateScenarioRequest createValidateScenarioRequest() {
        return new ValidateScenarioRequest();
    }

    /**
     * Create an instance of {@link ValidateScenarioRequestType }
     * 
     */
    public ValidateScenarioRequestType createValidateScenarioRequestType() {
        return new ValidateScenarioRequestType();
    }

    /**
     * Create an instance of {@link ActivateFeatureResponse }
     * 
     */
    public ActivateFeatureResponse createActivateFeatureResponse() {
        return new ActivateFeatureResponse();
    }

    /**
     * Create an instance of {@link ValidatedFeatureType }
     * 
     */
    public ValidatedFeatureType createValidatedFeatureType() {
        return new ValidatedFeatureType();
    }

    /**
     * Create an instance of {@link ValidateScenarioResponseType }
     * 
     */
    public ValidateScenarioResponseType createValidateScenarioResponseType() {
        return new ValidateScenarioResponseType();
    }

    /**
     * Create an instance of {@link RealignFeatureResponse }
     * 
     */
    public RealignFeatureResponse createRealignFeatureResponse() {
        return new RealignFeatureResponse();
    }

    /**
     * Create an instance of {@link RealignResponseType }
     * 
     */
    public RealignResponseType createRealignResponseType() {
        return new RealignResponseType();
    }

    /**
     * Create an instance of {@link FeatureBriefResultType }
     * 
     */
    public FeatureBriefResultType createFeatureBriefResultType() {
        return new FeatureBriefResultType();
    }

    /**
     * Create an instance of {@link ActivateFeatureRequest }
     * 
     */
    public ActivateFeatureRequest createActivateFeatureRequest() {
        return new ActivateFeatureRequest();
    }

    /**
     * Create an instance of {@link ValidateScenarioWithUpdateRequest }
     * 
     */
    public ValidateScenarioWithUpdateRequest createValidateScenarioWithUpdateRequest() {
        return new ValidateScenarioWithUpdateRequest();
    }

    /**
     * Create an instance of {@link ValidateScenarioResponse }
     * 
     */
    public ValidateScenarioResponse createValidateScenarioResponse() {
        return new ValidateScenarioResponse();
    }

    /**
     * Create an instance of {@link ValidationResultMessageType }
     * 
     */
    public ValidationResultMessageType createValidationResultMessageType() {
        return new ValidationResultMessageType();
    }

    /**
     * Create an instance of {@link UpdateFeatureTemporalityResponse }
     * 
     */
    public UpdateFeatureTemporalityResponse createUpdateFeatureTemporalityResponse() {
        return new UpdateFeatureTemporalityResponse();
    }

    /**
     * Create an instance of {@link UpdateFeatureResponseItemType }
     * 
     */
    public UpdateFeatureResponseItemType createUpdateFeatureResponseItemType() {
        return new UpdateFeatureResponseItemType();
    }

    /**
     * Create an instance of {@link IgnoreFeature }
     * 
     */
    public IgnoreFeature createIgnoreFeature() {
        return new IgnoreFeature();
    }

    /**
     * Create an instance of {@link ValidateScenarioWithUpdateResponse }
     * 
     */
    public ValidateScenarioWithUpdateResponse createValidateScenarioWithUpdateResponse() {
        return new ValidateScenarioWithUpdateResponse();
    }

    /**
     * Create an instance of {@link ExecuteValidationWithUpdateRequest }
     * 
     */
    public ExecuteValidationWithUpdateRequest createExecuteValidationWithUpdateRequest() {
        return new ExecuteValidationWithUpdateRequest();
    }

    /**
     * Create an instance of {@link ExecuteValidationRequestType }
     * 
     */
    public ExecuteValidationRequestType createExecuteValidationRequestType() {
        return new ExecuteValidationRequestType();
    }

    /**
     * Create an instance of {@link ExecuteValidationRequest }
     * 
     */
    public ExecuteValidationRequest createExecuteValidationRequest() {
        return new ExecuteValidationRequest();
    }

    /**
     * Create an instance of {@link RealignFeatureRequest }
     * 
     */
    public RealignFeatureRequest createRealignFeatureRequest() {
        return new RealignFeatureRequest();
    }

    /**
     * Create an instance of {@link RealignRequestType }
     * 
     */
    public RealignRequestType createRealignRequestType() {
        return new RealignRequestType();
    }

    /**
     * Create an instance of {@link ExecuteValidationWithUpdateResponse }
     * 
     */
    public ExecuteValidationWithUpdateResponse createExecuteValidationWithUpdateResponse() {
        return new ExecuteValidationWithUpdateResponse();
    }

    /**
     * Create an instance of {@link ExecuteValidationResponseType }
     * 
     */
    public ExecuteValidationResponseType createExecuteValidationResponseType() {
        return new ExecuteValidationResponseType();
    }

    /**
     * Create an instance of {@link CancelFeatureRequest }
     * 
     */
    public CancelFeatureRequest createCancelFeatureRequest() {
        return new CancelFeatureRequest();
    }

    /**
     * Create an instance of {@link CancelFeatureResponse }
     * 
     */
    public CancelFeatureResponse createCancelFeatureResponse() {
        return new CancelFeatureResponse();
    }

    /**
     * Create an instance of {@link ExecuteValidationResponse }
     * 
     */
    public ExecuteValidationResponse createExecuteValidationResponse() {
        return new ExecuteValidationResponse();
    }

    /**
     * Create an instance of {@link GetFeatureBriefType }
     * 
     */
    public GetFeatureBriefType createGetFeatureBriefType() {
        return new GetFeatureBriefType();
    }

    /**
     * Create an instance of {@link SupportingFeatureListType }
     * 
     */
    public SupportingFeatureListType createSupportingFeatureListType() {
        return new SupportingFeatureListType();
    }

    /**
     * Create an instance of {@link AssociatedFeatureCriteriaType }
     * 
     */
    public AssociatedFeatureCriteriaType createAssociatedFeatureCriteriaType() {
        return new AssociatedFeatureCriteriaType();
    }

    /**
     * Create an instance of {@link AdditionalCriteriaType }
     * 
     */
    public AdditionalCriteriaType createAdditionalCriteriaType() {
        return new AdditionalCriteriaType();
    }

    /**
     * Create an instance of {@link ValidationResultSet }
     * 
     */
    public ValidationResultSet createValidationResultSet() {
        return new ValidationResultSet();
    }

    /**
     * Create an instance of {@link ReasonDetailType }
     * 
     */
    public ReasonDetailType createReasonDetailType() {
        return new ReasonDetailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateScenarioRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:messages", name = "ProcessFeatureRequest")
    public JAXBElement<ValidateScenarioRequestType> createProcessFeatureRequest(ValidateScenarioRequestType value) {
        return new JAXBElement<ValidateScenarioRequestType>(_ProcessFeatureRequest_QNAME, ValidateScenarioRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:messages", name = "FilterCriteria")
    public JAXBElement<FilterCriteriaType> createFilterCriteria(FilterCriteriaType value) {
        return new JAXBElement<FilterCriteriaType>(_FilterCriteria_QNAME, FilterCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureBriefResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:messages", name = "FeatureBriefResult")
    public JAXBElement<FeatureBriefResultType> createFeatureBriefResult(FeatureBriefResultType value) {
        return new JAXBElement<FeatureBriefResultType>(_FeatureBriefResult_QNAME, FeatureBriefResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFeatureBriefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:messages", name = "GetFeatureBrief")
    public JAXBElement<GetFeatureBriefType> createGetFeatureBrief(GetFeatureBriefType value) {
        return new JAXBElement<GetFeatureBriefType>(_GetFeatureBrief_QNAME, GetFeatureBriefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:messages", name = "FeatureIdentifier")
    public JAXBElement<FeatureIdentifierType> createFeatureIdentifier(FeatureIdentifierType value) {
        return new JAXBElement<FeatureIdentifierType>(_FeatureIdentifier_QNAME, FeatureIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidatedFeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:messages", name = "CancelledFeature")
    public JAXBElement<ValidatedFeatureType> createCancelledFeature(ValidatedFeatureType value) {
        return new JAXBElement<ValidatedFeatureType>(_CancelledFeature_QNAME, ValidatedFeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:messages", name = "FeatureType")
    public JAXBElement<FeatureTypeType> createFeatureType(FeatureTypeType value) {
        return new JAXBElement<FeatureTypeType>(_FeatureType_QNAME, FeatureTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidatedFeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:messages", name = "ActivatedFeature")
    public JAXBElement<ValidatedFeatureType> createActivatedFeature(ValidatedFeatureType value) {
        return new JAXBElement<ValidatedFeatureType>(_ActivatedFeature_QNAME, ValidatedFeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidatedFeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:messages", name = "ValidatedFeature")
    public JAXBElement<ValidatedFeatureType> createValidatedFeature(ValidatedFeatureType value) {
        return new JAXBElement<ValidatedFeatureType>(_ValidatedFeature_QNAME, ValidatedFeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateScenarioResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:messages", name = "ProcessFeatureResponse")
    public JAXBElement<ValidateScenarioResponseType> createProcessFeatureResponse(ValidateScenarioResponseType value) {
        return new JAXBElement<ValidateScenarioResponseType>(_ProcessFeatureResponse_QNAME, ValidateScenarioResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidatedItemExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:dot:faa:flight-procedures:services:common:messages", name = "ValidatedItemExtension")
    public JAXBElement<ValidatedItemExtensionType> createValidatedItemExtension(ValidatedItemExtensionType value) {
        return new JAXBElement<ValidatedItemExtensionType>(_ValidatedItemExtension_QNAME, ValidatedItemExtensionType.class, null, value);
    }

}
