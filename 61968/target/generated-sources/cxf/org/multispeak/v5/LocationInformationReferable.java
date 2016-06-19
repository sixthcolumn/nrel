
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for locationInformationReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationInformationReferable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}locationInformation">
 *       &lt;sequence>
 *         &lt;element name="serviceLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *       &lt;/sequence>
 *       &lt;attribute name="referableID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationInformationReferable", propOrder = {
    "serviceLocationID"
})
public class LocationInformationReferable
    extends LocationInformation
{

    @XmlElement(required = true)
    protected ObjectID serviceLocationID;
    @XmlAttribute(name = "referableID")
    protected String referableID;

    /**
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setServiceLocationID(ObjectID value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the referableID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferableID() {
        return referableID;
    }

    /**
     * Sets the value of the referableID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferableID(String value) {
        this.referableID = value;
    }

}
