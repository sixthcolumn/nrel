
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The multiPartIdentifier is an object identifier that is used when: (i) the noun type is known in advance and hence does not need to be specified in a message payload, (ii) it is not necessary or desirable to use a GUID to point to an object instance, and (iii) at least one and possibly two string names may be used to point to the data instance of interest.  Thus the multiPartIdentifier is a SOFT, NOUN-UNSPECIFIED object identifier.
 * 
 * <p>Java class for multiPartIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multiPartIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryIdentifier" type="{http://www.multispeak.org/V5.0/commonTypes}singleIdentifier"/>
 *         &lt;element name="secondaryIdentifier" type="{http://www.multispeak.org/V5.0/commonTypes}singleIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiPartIdentifier", propOrder = {
    "primaryIdentifier",
    "secondaryIdentifier"
})
@XmlSeeAlso({
    NounSpecifiedMultiPartIdentifier.class
})
public class MultiPartIdentifier {

    @XmlElement(required = true)
    protected SingleIdentifier primaryIdentifier;
    protected SingleIdentifier secondaryIdentifier;

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

    /**
     * Gets the value of the secondaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SingleIdentifier }
     *     
     */
    public SingleIdentifier getSecondaryIdentifier() {
        return secondaryIdentifier;
    }

    /**
     * Sets the value of the secondaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleIdentifier }
     *     
     */
    public void setSecondaryIdentifier(SingleIdentifier value) {
        this.secondaryIdentifier = value;
    }

}
