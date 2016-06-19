
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
 *         &lt;element name="tests" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfTestedElectricMeter" minOccurs="0"/>
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
    "tests"
})
@XmlRootElement(name = "MeterTestNotification")
public class MeterTestNotification {

    protected ArrayOfTestedElectricMeter tests;

    /**
     * Gets the value of the tests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTestedElectricMeter }
     *     
     */
    public ArrayOfTestedElectricMeter getTests() {
        return tests;
    }

    /**
     * Sets the value of the tests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTestedElectricMeter }
     *     
     */
    public void setTests(ArrayOfTestedElectricMeter value) {
        this.tests = value;
    }

}
