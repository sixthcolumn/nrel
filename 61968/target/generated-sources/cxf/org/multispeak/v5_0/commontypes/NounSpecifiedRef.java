
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.WorkReference;


/**
 * The nounSpecifiedRef is used to refer to a data instance when (i) the noun type is not known in advance and hence must be specified in the message payload and (ii) it is desired to use either an objectRef or nounSpecifiedMultiPartIdentifier to refer to the data instance of interest.
 * 
 * <p>Java class for nounSpecifiedRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nounSpecifiedRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="objectIdentifier" type="{http://www.multispeak.org/V5.0/commonTypes}nounSpecifiedMultiPartIdentifier"/>
 *         &lt;element name="objectRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nounSpecifiedRef", propOrder = {
    "objectIdentifier",
    "objectRef"
})
@XmlSeeAlso({
    WorkReference.class
})
public class NounSpecifiedRef {

    protected NounSpecifiedMultiPartIdentifier objectIdentifier;
    protected ObjectRef objectRef;

    /**
     * Gets the value of the objectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link NounSpecifiedMultiPartIdentifier }
     *     
     */
    public NounSpecifiedMultiPartIdentifier getObjectIdentifier() {
        return objectIdentifier;
    }

    /**
     * Sets the value of the objectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link NounSpecifiedMultiPartIdentifier }
     *     
     */
    public void setObjectIdentifier(NounSpecifiedMultiPartIdentifier value) {
        this.objectIdentifier = value;
    }

    /**
     * Gets the value of the objectRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getObjectRef() {
        return objectRef;
    }

    /**
     * Sets the value of the objectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setObjectRef(ObjectRef value) {
        this.objectRef = value;
    }

}
