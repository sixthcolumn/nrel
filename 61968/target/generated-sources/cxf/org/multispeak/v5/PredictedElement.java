
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;


/**
 * <p>Java class for predictedElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="predictedElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="predictedDeviceRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *         &lt;element name="otherPredictedElement" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "predictedElement", propOrder = {
    "predictedDeviceRef",
    "otherPredictedElement"
})
public class PredictedElement {

    protected ObjectRef predictedDeviceRef;
    protected ObjectRef otherPredictedElement;

    /**
     * Gets the value of the predictedDeviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getPredictedDeviceRef() {
        return predictedDeviceRef;
    }

    /**
     * Sets the value of the predictedDeviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setPredictedDeviceRef(ObjectRef value) {
        this.predictedDeviceRef = value;
    }

    /**
     * Gets the value of the otherPredictedElement property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getOtherPredictedElement() {
        return otherPredictedElement;
    }

    /**
     * Sets the value of the otherPredictedElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setOtherPredictedElement(ObjectRef value) {
        this.otherPredictedElement = value;
    }

}
