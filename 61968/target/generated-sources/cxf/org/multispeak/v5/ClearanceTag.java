
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.enumerations.TagType;


/**
 * This is a tag associated with the containing clearanceCertificate.
 * 
 * <p>Java class for clearanceTag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clearanceTag">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="tagType" type="{http://www.multispeak.org/V5.0/enumerations}tagType"/>
 *         &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taggedDeviceRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="tagPlacedDateTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="tagReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearanceRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clearanceTag", propOrder = {
    "tagType",
    "tagName",
    "taggedDeviceRef",
    "tagPlacedDateTime",
    "tagReason",
    "tagLocation",
    "clearanceRef"
})
public class ClearanceTag
    extends MspObject
{

    @XmlElement(required = true)
    protected TagType tagType;
    @XmlElement(required = true)
    protected String tagName;
    @XmlElement(required = true)
    protected ObjectRef taggedDeviceRef;
    protected XMLGregorianCalendar tagPlacedDateTime;
    protected String tagReason;
    protected String tagLocation;
    protected ObjectRef clearanceRef;

    /**
     * Gets the value of the tagType property.
     * 
     * @return
     *     possible object is
     *     {@link TagType }
     *     
     */
    public TagType getTagType() {
        return tagType;
    }

    /**
     * Sets the value of the tagType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagType }
     *     
     */
    public void setTagType(TagType value) {
        this.tagType = value;
    }

    /**
     * Gets the value of the tagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * Sets the value of the tagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagName(String value) {
        this.tagName = value;
    }

    /**
     * Gets the value of the taggedDeviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getTaggedDeviceRef() {
        return taggedDeviceRef;
    }

    /**
     * Sets the value of the taggedDeviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setTaggedDeviceRef(ObjectRef value) {
        this.taggedDeviceRef = value;
    }

    /**
     * Gets the value of the tagPlacedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTagPlacedDateTime() {
        return tagPlacedDateTime;
    }

    /**
     * Sets the value of the tagPlacedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTagPlacedDateTime(XMLGregorianCalendar value) {
        this.tagPlacedDateTime = value;
    }

    /**
     * Gets the value of the tagReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagReason() {
        return tagReason;
    }

    /**
     * Sets the value of the tagReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagReason(String value) {
        this.tagReason = value;
    }

    /**
     * Gets the value of the tagLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagLocation() {
        return tagLocation;
    }

    /**
     * Sets the value of the tagLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagLocation(String value) {
        this.tagLocation = value;
    }

    /**
     * Gets the value of the clearanceRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getClearanceRef() {
        return clearanceRef;
    }

    /**
     * Sets the value of the clearanceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setClearanceRef(ObjectRef value) {
        this.clearanceRef = value;
    }

}
