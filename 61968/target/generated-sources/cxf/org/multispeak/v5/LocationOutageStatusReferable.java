
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.LocationOutageStatus;


/**
 * <p>Java class for locationOutageStatusReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationOutageStatusReferable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="locationOutageStatus" type="{http://www.multispeak.org/V5.0/enumerations}locationOutageStatus"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationOutageStatusReferable", propOrder = {
    "locationOutageStatus"
})
public class LocationOutageStatusReferable
    extends MspReferable
{

    @XmlElement(required = true)
    protected LocationOutageStatus locationOutageStatus;

    /**
     * Gets the value of the locationOutageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LocationOutageStatus }
     *     
     */
    public LocationOutageStatus getLocationOutageStatus() {
        return locationOutageStatus;
    }

    /**
     * Sets the value of the locationOutageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationOutageStatus }
     *     
     */
    public void setLocationOutageStatus(LocationOutageStatus value) {
        this.locationOutageStatus = value;
    }

}
