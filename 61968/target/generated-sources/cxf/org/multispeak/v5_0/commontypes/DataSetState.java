
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSetState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PublishDataSetState" type="{http://www.multispeak.org/V5.0/commonTypes}PublishDataSetState"/>
 *         &lt;element name="RequestDataSetState" type="{http://www.multispeak.org/V5.0/commonTypes}RequestDataSetState"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetState", propOrder = {
    "publishDataSetState",
    "requestDataSetState"
})
public class DataSetState {

    @XmlElement(name = "PublishDataSetState")
    protected PublishDataSetState publishDataSetState;
    @XmlElement(name = "RequestDataSetState")
    protected RequestDataSetState requestDataSetState;

    /**
     * Gets the value of the publishDataSetState property.
     * 
     * @return
     *     possible object is
     *     {@link PublishDataSetState }
     *     
     */
    public PublishDataSetState getPublishDataSetState() {
        return publishDataSetState;
    }

    /**
     * Sets the value of the publishDataSetState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishDataSetState }
     *     
     */
    public void setPublishDataSetState(PublishDataSetState value) {
        this.publishDataSetState = value;
    }

    /**
     * Gets the value of the requestDataSetState property.
     * 
     * @return
     *     possible object is
     *     {@link RequestDataSetState }
     *     
     */
    public RequestDataSetState getRequestDataSetState() {
        return requestDataSetState;
    }

    /**
     * Sets the value of the requestDataSetState property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestDataSetState }
     *     
     */
    public void setRequestDataSetState(RequestDataSetState value) {
        this.requestDataSetState = value;
    }

}
