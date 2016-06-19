
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Action, if any, to be taken at this location (Unknown, Abandon, Construction, Existing, NoAction, Retire, Transfer, Salvage, All, Other).  If the system of record does not support Transfer of units, then it should interpret this action as being the same as "Construction".  If the system of record does not support Salvage then it should interpret salvage as being the same as "Retire".
 * 
 * <p>Java class for unitAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unitAction">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>unitActionKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unitAction", propOrder = {
    "value"
})
public class UnitAction {

    @XmlValue
    protected UnitActionKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * Action, if any, to be taken at this location.  If the system of record does not support Transfer of units, then it should interpret this action as being the same as "Construction".  If the system of record does not support Salvage then it should interpret salvage as being the same as "Retire".
     * 
     * @return
     *     possible object is
     *     {@link UnitActionKind }
     *     
     */
    public UnitActionKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitActionKind }
     *     
     */
    public void setValue(UnitActionKind value) {
        this.value = value;
    }

    /**
     * Gets the value of the otherKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherKind() {
        return otherKind;
    }

    /**
     * Sets the value of the otherKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherKind(String value) {
        this.otherKind = value;
    }

}
