
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This type may be used by the system of record to categorize work statuses to allow data requests to be sorted into groups of like work Status.  The system or records own the mapping between workStatusCodes and workStatusCategories.
 * 
 * <p>Java class for workStatusCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workStatusCategory">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>workStatusCategoryKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workStatusCategory", propOrder = {
    "value"
})
public class WorkStatusCategory {

    @XmlValue
    protected WorkStatusCategoryKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * This type may be used by the system of record to categorize work statuses to allow data requests to be sorted into groups of like work Status.  The system or records own the mapping between workStatusCodes and workStatusCategories.
     * 
     * @return
     *     possible object is
     *     {@link WorkStatusCategoryKind }
     *     
     */
    public WorkStatusCategoryKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkStatusCategoryKind }
     *     
     */
    public void setValue(WorkStatusCategoryKind value) {
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
