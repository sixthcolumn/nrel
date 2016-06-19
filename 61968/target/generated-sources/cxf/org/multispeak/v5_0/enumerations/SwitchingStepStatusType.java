
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The status of this switching step.  Possible enumerations include: Proposed, Instructed, Confirmed, Aborted, Skipped, Other. The supported values of stepStatus should be discovered by a call to GetDomainMembers on the application that is the system of record for switching orders.
 * 
 * <p>Java class for switchingStepStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="switchingStepStatusType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>switchingStepStatusKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "switchingStepStatusType", propOrder = {
    "value"
})
public class SwitchingStepStatusType {

    @XmlValue
    protected SwitchingStepStatusKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * The status of this switching step.  Possible enumerations include: Proposed, Instructed, Confirmed, Aborted, Skipped, Other. The supported values of stepStatus should be discovered by a call to GetDomainMembers on the application that is the system of record for switching orders.
     * 
     * @return
     *     possible object is
     *     {@link SwitchingStepStatusKind }
     *     
     */
    public SwitchingStepStatusKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchingStepStatusKind }
     *     
     */
    public void setValue(SwitchingStepStatusKind value) {
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
