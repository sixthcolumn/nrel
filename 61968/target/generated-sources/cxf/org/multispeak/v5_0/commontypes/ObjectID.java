
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An objectID is the primary way to identify an object, using a GUID where the noun type is known in advance.  Since the noun type is known in advance, it does not need to be specified in a message payload.  Thus an objectID is a HARD, NOUN-UNSPECIFIED object identifier.
 * 
 * <p>Java class for objectID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objectID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectGUID" type="{http://www.multispeak.org/V5.0/primitives}MultiSpeakGUID"/>
 *         &lt;element name="primaryIdentifier" type="{http://www.multispeak.org/V5.0/commonTypes}singleIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objectID", propOrder = {
    "objectGUID",
    "primaryIdentifier"
})
public class ObjectID {

    @XmlElement(required = true)
    protected String objectGUID;
    protected SingleIdentifier primaryIdentifier;

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
     * Gets the value of the primaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SingleIdentifier }
     *     
     */
    public SingleIdentifier getPrimaryIdentifier() {
        return primaryIdentifier;
    }

    /**
     * Sets the value of the primaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleIdentifier }
     *     
     */
    public void setPrimaryIdentifier(SingleIdentifier value) {
        this.primaryIdentifier = value;
    }

}
