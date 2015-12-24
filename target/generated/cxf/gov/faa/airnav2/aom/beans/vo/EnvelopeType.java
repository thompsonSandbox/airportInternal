
package gov.faa.airnav2.aom.beans.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvelopeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvelopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}Airport" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}LandingStrip" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}Obstacle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}WeatherSource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}NavaidSystem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}NavaidComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}RadarSystem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}RadarComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}ExtendedServiceVolume" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://airnav2.faa.gov/aom/beans/vo}FullCountryReferenceData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopeType", propOrder = {
    "airport",
    "landingStrip",
    "obstacle",
    "weatherSource",
    "navaidSystem",
    "navaidComponent",
    "radarSystem",
    "radarComponent",
    "extendedServiceVolume",
    "fullCountryReferenceData"
})
public class EnvelopeType {

    @XmlElement(name = "Airport", nillable = true)
    protected List<AirportType> airport;
    @XmlElement(name = "LandingStrip", nillable = true)
    protected List<LandingStripType> landingStrip;
    @XmlElement(name = "Obstacle", nillable = true)
    protected List<ObstacleType> obstacle;
    @XmlElement(name = "WeatherSource", nillable = true)
    protected List<WeatherSourceType> weatherSource;
    @XmlElement(name = "NavaidSystem", nillable = true)
    protected List<NavaidSystemType> navaidSystem;
    @XmlElement(name = "NavaidComponent", nillable = true)
    protected List<NavaidComponentType> navaidComponent;
    @XmlElement(name = "RadarSystem", nillable = true)
    protected List<RadarSystemType> radarSystem;
    @XmlElement(name = "RadarComponent", nillable = true)
    protected List<RadarComponentType> radarComponent;
    @XmlElement(name = "ExtendedServiceVolume", nillable = true)
    protected List<ExtendedServiceVolumeType> extendedServiceVolume;
    @XmlElement(name = "FullCountryReferenceData", nillable = true)
    protected List<FullCountryReferenceDataType> fullCountryReferenceData;

    /**
     * Gets the value of the airport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportType }
     * 
     * 
     */
    public List<AirportType> getAirport() {
        if (airport == null) {
            airport = new ArrayList<AirportType>();
        }
        return this.airport;
    }

    /**
     * Gets the value of the landingStrip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the landingStrip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandingStrip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LandingStripType }
     * 
     * 
     */
    public List<LandingStripType> getLandingStrip() {
        if (landingStrip == null) {
            landingStrip = new ArrayList<LandingStripType>();
        }
        return this.landingStrip;
    }

    /**
     * Gets the value of the obstacle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obstacle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObstacle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstacleType }
     * 
     * 
     */
    public List<ObstacleType> getObstacle() {
        if (obstacle == null) {
            obstacle = new ArrayList<ObstacleType>();
        }
        return this.obstacle;
    }

    /**
     * Gets the value of the weatherSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weatherSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeatherSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherSourceType }
     * 
     * 
     */
    public List<WeatherSourceType> getWeatherSource() {
        if (weatherSource == null) {
            weatherSource = new ArrayList<WeatherSourceType>();
        }
        return this.weatherSource;
    }

    /**
     * Gets the value of the navaidSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navaidSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavaidSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavaidSystemType }
     * 
     * 
     */
    public List<NavaidSystemType> getNavaidSystem() {
        if (navaidSystem == null) {
            navaidSystem = new ArrayList<NavaidSystemType>();
        }
        return this.navaidSystem;
    }

    /**
     * Gets the value of the navaidComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navaidComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavaidComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavaidComponentType }
     * 
     * 
     */
    public List<NavaidComponentType> getNavaidComponent() {
        if (navaidComponent == null) {
            navaidComponent = new ArrayList<NavaidComponentType>();
        }
        return this.navaidComponent;
    }

    /**
     * Gets the value of the radarSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radarSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadarSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RadarSystemType }
     * 
     * 
     */
    public List<RadarSystemType> getRadarSystem() {
        if (radarSystem == null) {
            radarSystem = new ArrayList<RadarSystemType>();
        }
        return this.radarSystem;
    }

    /**
     * Gets the value of the radarComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radarComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadarComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RadarComponentType }
     * 
     * 
     */
    public List<RadarComponentType> getRadarComponent() {
        if (radarComponent == null) {
            radarComponent = new ArrayList<RadarComponentType>();
        }
        return this.radarComponent;
    }

    /**
     * Gets the value of the extendedServiceVolume property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedServiceVolume property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedServiceVolume().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedServiceVolumeType }
     * 
     * 
     */
    public List<ExtendedServiceVolumeType> getExtendedServiceVolume() {
        if (extendedServiceVolume == null) {
            extendedServiceVolume = new ArrayList<ExtendedServiceVolumeType>();
        }
        return this.extendedServiceVolume;
    }

    /**
     * Gets the value of the fullCountryReferenceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fullCountryReferenceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFullCountryReferenceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullCountryReferenceDataType }
     * 
     * 
     */
    public List<FullCountryReferenceDataType> getFullCountryReferenceData() {
        if (fullCountryReferenceData == null) {
            fullCountryReferenceData = new ArrayList<FullCountryReferenceDataType>();
        }
        return this.fullCountryReferenceData;
    }

}
