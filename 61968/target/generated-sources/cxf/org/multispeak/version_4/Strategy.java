
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for strategy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="strategy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strategyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationPointList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfObjectRef3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "strategy", propOrder = {
    "strategyName",
    "applicationPointList"
})
public class Strategy {

    protected String strategyName;
    protected ArrayOfObjectRef3 applicationPointList;

    /**
     * Gets the value of the strategyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategyName() {
        return strategyName;
    }

    /**
     * Sets the value of the strategyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategyName(String value) {
        this.strategyName = value;
    }

    /**
     * Gets the value of the applicationPointList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjectRef3 }
     *     
     */
    public ArrayOfObjectRef3 getApplicationPointList() {
        return applicationPointList;
    }

    /**
     * Sets the value of the applicationPointList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjectRef3 }
     *     
     */
    public void setApplicationPointList(ArrayOfObjectRef3 value) {
        this.applicationPointList = value;
    }

}
