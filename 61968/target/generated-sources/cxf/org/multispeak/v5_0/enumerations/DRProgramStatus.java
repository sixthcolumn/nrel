
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for DRProgramStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DRProgramStatus">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>DRProgramStatusKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DRProgramStatus", propOrder = {
    "value"
})
public class DRProgramStatus {

    @XmlValue
    protected DRProgramStatusKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * The status of this DRProgram.  Active means a program for which the end date is in the future and enrollments can be accepted (regardless of DR is currently in effect); Suspended means that a customer can be enrolled in the program, but no DR signals will be sent; Rescinded means new customers can no longer be enrolled in the program, but existing customers can continue to participate in the program until the end date of the program.
     * 
     * @return
     *     possible object is
     *     {@link DRProgramStatusKind }
     *     
     */
    public DRProgramStatusKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DRProgramStatusKind }
     *     
     */
    public void setValue(DRProgramStatusKind value) {
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
