
package org.multispeak.v5;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * A descriptor for endDeviceEventTypes.  Values for this object and the optional attributes for this object shall be taken from Annex e of IEC61968-9, 2nd Edition.
 * 
 * <p>Java class for endDeviceEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endDeviceEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="endDeviceType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="endDeviceDomain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="endDeviceSubdomain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eventOrAction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeString" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endDeviceEventType")
public class EndDeviceEventType {

    @XmlAttribute(name = "endDeviceType")
    protected String endDeviceType;
    @XmlAttribute(name = "endDeviceDomain")
    protected String endDeviceDomain;
    @XmlAttribute(name = "endDeviceSubdomain")
    protected String endDeviceSubdomain;
    @XmlAttribute(name = "eventOrAction")
    protected String eventOrAction;
    @XmlAttribute(name = "codeString")
    protected String codeString;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the endDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDeviceType() {
        return endDeviceType;
    }

    /**
     * Sets the value of the endDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDeviceType(String value) {
        this.endDeviceType = value;
    }

    /**
     * Gets the value of the endDeviceDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDeviceDomain() {
        return endDeviceDomain;
    }

    /**
     * Sets the value of the endDeviceDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDeviceDomain(String value) {
        this.endDeviceDomain = value;
    }

    /**
     * Gets the value of the endDeviceSubdomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDeviceSubdomain() {
        return endDeviceSubdomain;
    }

    /**
     * Sets the value of the endDeviceSubdomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDeviceSubdomain(String value) {
        this.endDeviceSubdomain = value;
    }

    /**
     * Gets the value of the eventOrAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventOrAction() {
        return eventOrAction;
    }

    /**
     * Sets the value of the eventOrAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventOrAction(String value) {
        this.eventOrAction = value;
    }

    /**
     * Gets the value of the codeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeString() {
        return codeString;
    }

    /**
     * Sets the value of the codeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeString(String value) {
        this.codeString = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
