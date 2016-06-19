
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.SplitAction;


/**
 * <p>Java class for originalOutage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="originalOutage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originalOutageRef" type="{http://www.multispeak.org/V5.0}outageRef"/>
 *         &lt;element name="splitAction" type="{http://www.multispeak.org/V5.0/enumerations}splitAction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "originalOutage", propOrder = {
    "originalOutageRef",
    "splitAction"
})
public class OriginalOutage {

    @XmlElement(required = true)
    protected OutageRef originalOutageRef;
    @XmlElement(required = true)
    protected SplitAction splitAction;

    /**
     * Gets the value of the originalOutageRef property.
     * 
     * @return
     *     possible object is
     *     {@link OutageRef }
     *     
     */
    public OutageRef getOriginalOutageRef() {
        return originalOutageRef;
    }

    /**
     * Sets the value of the originalOutageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageRef }
     *     
     */
    public void setOriginalOutageRef(OutageRef value) {
        this.originalOutageRef = value;
    }

    /**
     * Gets the value of the splitAction property.
     * 
     * @return
     *     possible object is
     *     {@link SplitAction }
     *     
     */
    public SplitAction getSplitAction() {
        return splitAction;
    }

    /**
     * Sets the value of the splitAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitAction }
     *     
     */
    public void setSplitAction(SplitAction value) {
        this.splitAction = value;
    }

}
