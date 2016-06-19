
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customersAffectedByOutage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customersAffectedByOutage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="outageEventID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affectedMeters" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAffectedMeter" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customersAffectedByOutage", propOrder = {
    "outageEventID",
    "affectedMeters"
})
public class CustomersAffectedByOutage
    extends MspObject
{

    protected String outageEventID;
    protected ArrayOfAffectedMeter affectedMeters;

    /**
     * Gets the value of the outageEventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageEventID() {
        return outageEventID;
    }

    /**
     * Sets the value of the outageEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageEventID(String value) {
        this.outageEventID = value;
    }

    /**
     * Gets the value of the affectedMeters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAffectedMeter }
     *     
     */
    public ArrayOfAffectedMeter getAffectedMeters() {
        return affectedMeters;
    }

    /**
     * Sets the value of the affectedMeters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAffectedMeter }
     *     
     */
    public void setAffectedMeters(ArrayOfAffectedMeter value) {
        this.affectedMeters = value;
    }

}
