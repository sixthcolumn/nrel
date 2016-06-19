
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a refererence or pointer to a workType.   It is suggested that the value of the workTypeRef should contain a string concatenated as utility.objectID.  The objectID attribute MUST be populated, the other attributes MAY be populated.
 * 
 * <p>Java class for workTypeRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workTypeRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="objectGUID" use="required" type="{http://www.multispeak.org/V5.0/primitives}MultiSpeakGUID" />
 *       &lt;attribute name="workTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="workSubTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workTypeRef")
public class WorkTypeRef {

    @XmlAttribute(name = "objectGUID", required = true)
    protected String objectGUID;
    @XmlAttribute(name = "workTypeName")
    protected String workTypeName;
    @XmlAttribute(name = "workSubTypeName")
    protected String workSubTypeName;

    /**
     * Gets the value of the objectGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectGUID() {
        return objectGUID;
    }

    /**
     * Sets the value of the objectGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectGUID(String value) {
        this.objectGUID = value;
    }

    /**
     * Gets the value of the workTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkTypeName() {
        return workTypeName;
    }

    /**
     * Sets the value of the workTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkTypeName(String value) {
        this.workTypeName = value;
    }

    /**
     * Gets the value of the workSubTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkSubTypeName() {
        return workSubTypeName;
    }

    /**
     * Sets the value of the workSubTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkSubTypeName(String value) {
        this.workSubTypeName = value;
    }

}
