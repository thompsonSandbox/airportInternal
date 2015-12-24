
package us.gov.dot.faa.flight_procedures.services.common.datatype;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeatureTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NavAid"/>
 *     &lt;enumeration value="NavAidComponent"/>
 *     &lt;enumeration value="NavRad"/>
 *     &lt;enumeration value="Airport"/>
 *     &lt;enumeration value="Altimeter"/>
 *     &lt;enumeration value="WeatherSource"/>
 *     &lt;enumeration value="Runway"/>
 *     &lt;enumeration value="Fix"/>
 *     &lt;enumeration value="Radar"/>
 *     &lt;enumeration value="RadarComponent"/>
 *     &lt;enumeration value="Minimum Safe Altitude"/>
 *     &lt;enumeration value="Instrument Procedure"/>
 *     &lt;enumeration value="Holding Pattern"/>
 *     &lt;enumeration value="Obstacle"/>
 *     &lt;enumeration value="Monitor"/>
 *     &lt;enumeration value="Procedure Request"/>
 *     &lt;enumeration value="Procedure Project"/>
 *     &lt;enumeration value="Procedure Task"/>
 *     &lt;enumeration value="Agreement"/>
 *     &lt;enumeration value="Departure Procedure"/>
 *     &lt;enumeration value="TextualODP"/>
 *     &lt;enumeration value="GraphicODP"/>
 *     &lt;enumeration value="RNavODP"/>
 *     &lt;enumeration value="EnRoute"/>
 *     &lt;enumeration value="EnRouteSegment"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Airspace"/>
 *     &lt;enumeration value="AerialRefueling"/>
 *     &lt;enumeration value="StandardInstrumentArrival"/>
 *     &lt;enumeration value="ObstacleAssessmentArea"/>
 *     &lt;enumeration value="CirclingArea"/>
 *     &lt;enumeration value="TerminalArrivalArea"/>
 *     &lt;enumeration value="PointReference"/>
 *     &lt;enumeration value="SignificantPoint"/>
 *     &lt;enumeration value="Apron"/>
 *     &lt;enumeration value="HelicopterSurface"/>
 *     &lt;enumeration value="GroundLightSystem"/>
 *     &lt;enumeration value="Marking"/>
 *     &lt;enumeration value="SeaplaneLandingArea"/>
 *     &lt;enumeration value="Taxiway"/>
 *     &lt;enumeration value="NavaidComponentRestriction"/>
 *     &lt;enumeration value="SpecialNavigationSystem"/>
 *     &lt;enumeration value="NavigationSystemCheckpoint"/>
 *     &lt;enumeration value="VerticalStructure"/>
 *     &lt;enumeration value="ExtendedServiceVolume"/>
 *     &lt;enumeration value="Survey"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeatureTypeType")
@XmlEnum
public enum FeatureTypeType {

    @XmlEnumValue("NavAid")
    NAV_AID("NavAid"),
    @XmlEnumValue("NavAidComponent")
    NAV_AID_COMPONENT("NavAidComponent"),
    @XmlEnumValue("NavRad")
    NAV_RAD("NavRad"),
    @XmlEnumValue("Airport")
    AIRPORT("Airport"),
    @XmlEnumValue("Altimeter")
    ALTIMETER("Altimeter"),
    @XmlEnumValue("WeatherSource")
    WEATHER_SOURCE("WeatherSource"),
    @XmlEnumValue("Runway")
    RUNWAY("Runway"),
    @XmlEnumValue("Fix")
    FIX("Fix"),
    @XmlEnumValue("Radar")
    RADAR("Radar"),
    @XmlEnumValue("RadarComponent")
    RADAR_COMPONENT("RadarComponent"),
    @XmlEnumValue("Minimum Safe Altitude")
    MINIMUM_SAFE_ALTITUDE("Minimum Safe Altitude"),
    @XmlEnumValue("Instrument Procedure")
    INSTRUMENT_PROCEDURE("Instrument Procedure"),
    @XmlEnumValue("Holding Pattern")
    HOLDING_PATTERN("Holding Pattern"),
    @XmlEnumValue("Obstacle")
    OBSTACLE("Obstacle"),
    @XmlEnumValue("Monitor")
    MONITOR("Monitor"),
    @XmlEnumValue("Procedure Request")
    PROCEDURE_REQUEST("Procedure Request"),
    @XmlEnumValue("Procedure Project")
    PROCEDURE_PROJECT("Procedure Project"),
    @XmlEnumValue("Procedure Task")
    PROCEDURE_TASK("Procedure Task"),
    @XmlEnumValue("Agreement")
    AGREEMENT("Agreement"),
    @XmlEnumValue("Departure Procedure")
    DEPARTURE_PROCEDURE("Departure Procedure"),
    @XmlEnumValue("TextualODP")
    TEXTUAL_ODP("TextualODP"),
    @XmlEnumValue("GraphicODP")
    GRAPHIC_ODP("GraphicODP"),
    @XmlEnumValue("RNavODP")
    R_NAV_ODP("RNavODP"),
    @XmlEnumValue("EnRoute")
    EN_ROUTE("EnRoute"),
    @XmlEnumValue("EnRouteSegment")
    EN_ROUTE_SEGMENT("EnRouteSegment"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Airspace")
    AIRSPACE("Airspace"),
    @XmlEnumValue("AerialRefueling")
    AERIAL_REFUELING("AerialRefueling"),
    @XmlEnumValue("StandardInstrumentArrival")
    STANDARD_INSTRUMENT_ARRIVAL("StandardInstrumentArrival"),
    @XmlEnumValue("ObstacleAssessmentArea")
    OBSTACLE_ASSESSMENT_AREA("ObstacleAssessmentArea"),
    @XmlEnumValue("CirclingArea")
    CIRCLING_AREA("CirclingArea"),
    @XmlEnumValue("TerminalArrivalArea")
    TERMINAL_ARRIVAL_AREA("TerminalArrivalArea"),
    @XmlEnumValue("PointReference")
    POINT_REFERENCE("PointReference"),
    @XmlEnumValue("SignificantPoint")
    SIGNIFICANT_POINT("SignificantPoint"),
    @XmlEnumValue("Apron")
    APRON("Apron"),
    @XmlEnumValue("HelicopterSurface")
    HELICOPTER_SURFACE("HelicopterSurface"),
    @XmlEnumValue("GroundLightSystem")
    GROUND_LIGHT_SYSTEM("GroundLightSystem"),
    @XmlEnumValue("Marking")
    MARKING("Marking"),
    @XmlEnumValue("SeaplaneLandingArea")
    SEAPLANE_LANDING_AREA("SeaplaneLandingArea"),
    @XmlEnumValue("Taxiway")
    TAXIWAY("Taxiway"),
    @XmlEnumValue("NavaidComponentRestriction")
    NAVAID_COMPONENT_RESTRICTION("NavaidComponentRestriction"),
    @XmlEnumValue("SpecialNavigationSystem")
    SPECIAL_NAVIGATION_SYSTEM("SpecialNavigationSystem"),
    @XmlEnumValue("NavigationSystemCheckpoint")
    NAVIGATION_SYSTEM_CHECKPOINT("NavigationSystemCheckpoint"),
    @XmlEnumValue("VerticalStructure")
    VERTICAL_STRUCTURE("VerticalStructure"),
    @XmlEnumValue("ExtendedServiceVolume")
    EXTENDED_SERVICE_VOLUME("ExtendedServiceVolume"),
    @XmlEnumValue("Survey")
    SURVEY("Survey");
    private final String value;

    FeatureTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeatureTypeType fromValue(String v) {
        for (FeatureTypeType c: FeatureTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
