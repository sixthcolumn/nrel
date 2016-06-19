
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assessmentLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspPointObject">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.multispeak.org/Version_4.1_Release}address" minOccurs="0"/>
 *         &lt;element name="locationOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAssessment" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfAttachment" minOccurs="0"/>
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
@XmlType(name = "assessmentLocation", propOrder = {
    "address",
    "locationOffset",
    "assessmentList",
    "attachments"
})
public class AssessmentLocation
    extends MspPointObject
{

    protected Address address;
    protected String locationOffset;
    protected ArrayOfAssessment assessmentList;
    protected ArrayOfAttachment attachments;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the locationOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationOffset() {
        return locationOffset;
    }

    /**
     * Sets the value of the locationOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationOffset(String value) {
        this.locationOffset = value;
    }

    /**
     * Gets the value of the assessmentList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssessment }
     *     
     */
    public ArrayOfAssessment getAssessmentList() {
        return assessmentList;
    }

    /**
     * Sets the value of the assessmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssessment }
     *     
     */
    public void setAssessmentList(ArrayOfAssessment value) {
        this.assessmentList = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public ArrayOfAttachment getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttachment }
     *     
     */
    public void setAttachments(ArrayOfAttachment value) {
        this.attachments = value;
    }

}
