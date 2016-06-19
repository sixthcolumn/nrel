
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for contentModelGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contentModelGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contentNounType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contentID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contentModelGroup", propOrder = {
    "contentNounType",
    "contentID"
})
public class ContentModelGroup {

    @XmlElement(required = true)
    protected String contentNounType;
    protected ObjectID contentID;

    /**
     * Gets the value of the contentNounType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentNounType() {
        return contentNounType;
    }

    /**
     * Sets the value of the contentNounType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentNounType(String value) {
        this.contentNounType = value;
    }

    /**
     * Gets the value of the contentID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getContentID() {
        return contentID;
    }

    /**
     * Sets the value of the contentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setContentID(ObjectID value) {
        this.contentID = value;
    }

}
