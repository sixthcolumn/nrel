
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Category for the outage reporting information.  Descriptions for the category should be: "Outage Cause - This is the primary cause of the outage ; "Equipment Failure" - This is the material or equipment that failed, producing the outage; "Voltage Level" - this is the phase-to-phase voltage of the system that failed; "Weather Condition" - The weather conditions at the site of the failure at the time the outage occurred (This is not to be used for reporting a weather condition that was the primary cause of the outage - that should be reported using Outage Cause; "System Characterization" The kind of customer density at the location of the outage; "Responsible System" - The portion of the electrical system that was responsible for the outage; "Outage Condition" - The condition that the system was subject to at the time of the fault (For example, was it a Major Event Day as defined by IEEE 1366); "Interrupting Device" - The kind of interrupting device that protected customers in response to the fault; "Interrupting Device Initiation" - The manner in which the interrupting device operated at the time of the fault; "Customer Restoration" - The manner in which the customer's service was restored.
 * 
 * <p>Java class for outageReasonCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageReasonCategory">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>outageReasonCategoryKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageReasonCategory", propOrder = {
    "value"
})
public class OutageReasonCategory {

    @XmlValue
    protected OutageReasonCategoryKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * Category for the outage reporting information.  Descriptions for the category should be: "Outage Cause - This is the primary cause of the outage ; "Equipment Failure" - This is the material or equipment that failed, producing the outage; "Voltage Level" - this is the phase-to-phase voltage of the system that failed; "Weather Condition" - The weather conditions at the site of the failure at the time the outage occurred (This is not to be used for reporting a weather condition that was the primary cause of the outage - that should be reported using Outage Cause; "System Characterization" The kind of customer density at the location of the outage; "Responsible System" - The portion of the electrical system that was responsible for the outage; "Outage Condition" - The condition that the system was subject to at the time of the fault (For example, was it a Major Event Day as defined by IEEE 1366); "Interrupting Device" - The kind of interrupting device that protected customers in response to the fault; "Interrupting Device Initiation" - The manner in which the interrupting device operated at the time of the fault; "Customer Restoration" - The manner in which the customer's service was restored.
     * 
     * @return
     *     possible object is
     *     {@link OutageReasonCategoryKind }
     *     
     */
    public OutageReasonCategoryKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReasonCategoryKind }
     *     
     */
    public void setValue(OutageReasonCategoryKind value) {
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
