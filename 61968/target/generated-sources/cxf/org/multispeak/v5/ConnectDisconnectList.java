
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * List of customers to be disconnected on a specific date.
 * 
 * <p>Java class for connectDisconnectList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectDisconnectList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="disconnectDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="CDCustomers" type="{http://www.multispeak.org/V5.0}CDCustomers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectDisconnectList", propOrder = {
    "disconnectDate",
    "cdCustomers"
})
public class ConnectDisconnectList
    extends MspReferable
{

    @XmlElement(required = true)
    protected XMLGregorianCalendar disconnectDate;
    @XmlElement(name = "CDCustomers")
    protected CDCustomers cdCustomers;

    /**
     * Gets the value of the disconnectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisconnectDate() {
        return disconnectDate;
    }

    /**
     * Sets the value of the disconnectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisconnectDate(XMLGregorianCalendar value) {
        this.disconnectDate = value;
    }

    /**
     * Gets the value of the cdCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link CDCustomers }
     *     
     */
    public CDCustomers getCDCustomers() {
        return cdCustomers;
    }

    /**
     * Sets the value of the cdCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDCustomers }
     *     
     */
    public void setCDCustomers(CDCustomers value) {
        this.cdCustomers = value;
    }

}
