
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.Money;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.ServiceType;


/**
 * <p>Java class for acctsReceivable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acctsReceivable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="receivableAmount" type="{http://www.multispeak.org/V5.0/commonTypes}money"/>
 *         &lt;element name="receivableType" type="{http://www.multispeak.org/V5.0}receivableType"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="serviceLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.multispeak.org/V5.0/enumerations}serviceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acctsReceivable", propOrder = {
    "receivableAmount",
    "receivableType",
    "description",
    "dueDate",
    "serviceLocationID",
    "serviceType"
})
public class AcctsReceivable
    extends MspExtensible
{

    @XmlElement(required = true)
    protected Money receivableAmount;
    @XmlElement(required = true)
    protected ReceivableType receivableType;
    protected String description;
    protected XMLGregorianCalendar dueDate;
    protected ObjectID serviceLocationID;
    protected ServiceType serviceType;

    /**
     * Gets the value of the receivableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getReceivableAmount() {
        return receivableAmount;
    }

    /**
     * Sets the value of the receivableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setReceivableAmount(Money value) {
        this.receivableAmount = value;
    }

    /**
     * Gets the value of the receivableType property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivableType }
     *     
     */
    public ReceivableType getReceivableType() {
        return receivableType;
    }

    /**
     * Sets the value of the receivableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivableType }
     *     
     */
    public void setReceivableType(ReceivableType value) {
        this.receivableType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

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
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

}
