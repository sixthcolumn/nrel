
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This option SHALL be used if this message header is for a published data (*Notification) message and it is desired to denote the data set associated with the published information that is being sent in this message.
 * 
 * <p>Java class for PublishDataSetState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublishDataSetState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataSetID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PreviousDataSetID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishDataSetState", propOrder = {
    "dataSetID",
    "previousDataSetID"
})
public class PublishDataSetState {

    @XmlElement(name = "DataSetID", required = true)
    protected String dataSetID;
    @XmlElement(name = "PreviousDataSetID", required = true)
    protected String previousDataSetID;

    /**
     * Gets the value of the dataSetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSetID() {
        return dataSetID;
    }

    /**
     * Sets the value of the dataSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSetID(String value) {
        this.dataSetID = value;
    }

    /**
     * Gets the value of the previousDataSetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDataSetID() {
        return previousDataSetID;
    }

    /**
     * Sets the value of the previousDataSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDataSetID(String value) {
        this.previousDataSetID = value;
    }

}
