
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetAllGasMetersResult" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfGasMeter1" minOccurs="0"/>
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
    "getAllGasMetersResult"
})
@XmlRootElement(name = "GetAllGasMetersResponse")
public class GetAllGasMetersResponse {

    @XmlElement(name = "GetAllGasMetersResult")
    protected ArrayOfGasMeter1 getAllGasMetersResult;

    /**
     * Gets the value of the getAllGasMetersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGasMeter1 }
     *     
     */
    public ArrayOfGasMeter1 getGetAllGasMetersResult() {
        return getAllGasMetersResult;
    }

    /**
     * Sets the value of the getAllGasMetersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGasMeter1 }
     *     
     */
    public void setGetAllGasMetersResult(ArrayOfGasMeter1 value) {
        this.getAllGasMetersResult = value;
    }

}
