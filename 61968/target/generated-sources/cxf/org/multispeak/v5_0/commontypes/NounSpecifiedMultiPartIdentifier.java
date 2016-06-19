
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The nounSpecifiedMultiPartIdentifier is used to identify an object when (i) the noun type is not known in advance and hence the noun type must be specified in the message payload, (iii) it is not necessary or desirable to use a GUID to refer to the data instance, and (iii) one or more string identifiers are needed to uniquely specify the desired data instance.
 * 
 * <p>Java class for nounSpecifiedMultiPartIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nounSpecifiedMultiPartIdentifier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}multiPartIdentifier">
 *       &lt;attribute name="identifierKind" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nounSpecifiedMultiPartIdentifier")
public class NounSpecifiedMultiPartIdentifier
    extends MultiPartIdentifier
{

    @XmlAttribute(name = "identifierKind", required = true)
    protected String identifierKind;

    /**
     * Gets the value of the identifierKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierKind() {
        return identifierKind;
    }

    /**
     * Sets the value of the identifierKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierKind(String value) {
        this.identifierKind = value;
    }

}
