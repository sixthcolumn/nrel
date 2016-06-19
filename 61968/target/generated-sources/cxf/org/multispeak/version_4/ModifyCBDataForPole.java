
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="poleData" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfPole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "poleData"
})
@XmlRootElement(name = "ModifyCBDataForPole")
public class ModifyCBDataForPole {

    protected ArrayOfPole poleData;

    /**
     * Gets the value of the poleData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPole }
     *     
     */
    public ArrayOfPole getPoleData() {
        return poleData;
    }

    /**
     * Sets the value of the poleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPole }
     *     
     */
    public void setPoleData(ArrayOfPole value) {
        this.poleData = value;
    }

}
