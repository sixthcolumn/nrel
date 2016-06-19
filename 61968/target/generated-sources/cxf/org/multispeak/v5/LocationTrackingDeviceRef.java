
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a reference to a stream of location tracking (AVL) data coming from one antenna and from one data source.  It is suggested that the data in the locationTrackingDeviceRef object be structured as sourceSystemID.LTDID, where sourceSystemID is an identifier for the source of the location tracking (AVL) data and the LTDID is a unique identifier for a the location tracking device antenna.  Individual optional attributes are included so that the receiving system does not need to parse the LTDeviceRef in order to know the source of the location tracking data.
 * 
 * <p>Java class for locationTrackingDeviceRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationTrackingDeviceRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="LTDID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceSystemID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LTCommunicationsAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationTrackingDeviceRef")
public class LocationTrackingDeviceRef {

    @XmlAttribute(name = "LTDID")
    protected String ltdid;
    @XmlAttribute(name = "sourceSystemID")
    protected String sourceSystemID;
    @XmlAttribute(name = "LTCommunicationsAddress")
    protected String ltCommunicationsAddress;

    /**
     * Gets the value of the ltdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTDID() {
        return ltdid;
    }

    /**
     * Sets the value of the ltdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTDID(String value) {
        this.ltdid = value;
    }

    /**
     * Gets the value of the sourceSystemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemID() {
        return sourceSystemID;
    }

    /**
     * Sets the value of the sourceSystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemID(String value) {
        this.sourceSystemID = value;
    }

    /**
     * Gets the value of the ltCommunicationsAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTCommunicationsAddress() {
        return ltCommunicationsAddress;
    }

    /**
     * Sets the value of the ltCommunicationsAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTCommunicationsAddress(String value) {
        this.ltCommunicationsAddress = value;
    }

}
