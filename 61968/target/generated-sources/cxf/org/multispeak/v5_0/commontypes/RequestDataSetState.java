
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This option SHALL be chosen if this message header is associated with a Get-type request and it is desired to denote the previous data set since which changed data are being requested. 
 * 
 * <p>Java class for RequestDataSetState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestDataSetState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataSetID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RequestDataSetState", propOrder = {
    "dataSetID",
    "previousDataSetID"
})
public class RequestDataSetState {

    @XmlElement(name = "DataSetID")
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
