
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.AssociatedDateType;


/**
 * Information about the date that a specific action or event occurred.
 * 
 * <p>Java class for associatedDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="associatedDate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="dateType" type="{http://www.multispeak.org/V5.0/enumerations}associatedDateType"/>
 *         &lt;element name="dateValue" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "associatedDate", propOrder = {
    "dateType",
    "dateValue"
})
public class AssociatedDate
    extends MspExtensible
{

    @XmlElement(required = true)
    protected AssociatedDateType dateType;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dateValue;

    /**
     * Gets the value of the dateType property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedDateType }
     *     
     */
    public AssociatedDateType getDateType() {
        return dateType;
    }

    /**
     * Sets the value of the dateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedDateType }
     *     
     */
    public void setDateType(AssociatedDateType value) {
        this.dateType = value;
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValue() {
        return dateValue;
    }

    /**
     * Sets the value of the dateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValue(XMLGregorianCalendar value) {
        this.dateValue = value;
    }

}
