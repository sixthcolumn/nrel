
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.NounSpecifiedRef;


/**
 * <p>Java class for guyRefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guyRefs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guyRef" type="{http://www.multispeak.org/V5.0/commonTypes}nounSpecifiedRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guyRefs", propOrder = {
    "guyRef"
})
public class GuyRefs {

    @XmlElement(required = true)
    protected NounSpecifiedRef guyRef;

    /**
     * Gets the value of the guyRef property.
     * 
     * @return
     *     possible object is
     *     {@link NounSpecifiedRef }
     *     
     */
    public NounSpecifiedRef getGuyRef() {
        return guyRef;
    }

    /**
     * Sets the value of the guyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NounSpecifiedRef }
     *     
     */
    public void setGuyRef(NounSpecifiedRef value) {
        this.guyRef = value;
    }

}
