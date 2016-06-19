
package org.multispeak.v5_0.commontypes;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.MessageResultLevel;


/**
 * The result object is used by a Responder to return information to a Requester on the result of processing a prior message.  The result object may also be used as the payload of an asynchronous/unsolicited error message (a SystemStateNotification).
 * 
 * <p>Java class for result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultIdentifier" type="{http://www.multispeak.org/V5.0/commonTypes}replyCodeIdentifier"/>
 *         &lt;element name="resultDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="level" type="{http://www.multispeak.org/V5.0/enumerations}messageResultLevel" minOccurs="0"/>
 *         &lt;element name="errorObjects" type="{http://www.multispeak.org/V5.0/commonTypes}errorObjects" minOccurs="0"/>
 *         &lt;element name="dataSetID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastSent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectsRemaining" type="{http://www.multispeak.org/V5.0/primitives}objectsRemaining" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "result", propOrder = {
    "resultIdentifier",
    "resultDescription",
    "level",
    "errorObjects",
    "dataSetID",
    "lastSent",
    "objectsRemaining"
})
public class Result {

    @XmlElement(required = true)
    protected ReplyCodeIdentifier resultIdentifier;
    protected String resultDescription;
    protected MessageResultLevel level;
    protected ErrorObjects errorObjects;
    protected String dataSetID;
    protected String lastSent;
    protected BigInteger objectsRemaining;

    /**
     * Gets the value of the resultIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ReplyCodeIdentifier }
     *     
     */
    public ReplyCodeIdentifier getResultIdentifier() {
        return resultIdentifier;
    }

    /**
     * Sets the value of the resultIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyCodeIdentifier }
     *     
     */
    public void setResultIdentifier(ReplyCodeIdentifier value) {
        this.resultIdentifier = value;
    }

    /**
     * Gets the value of the resultDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDescription() {
        return resultDescription;
    }

    /**
     * Sets the value of the resultDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDescription(String value) {
        this.resultDescription = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link MessageResultLevel }
     *     
     */
    public MessageResultLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageResultLevel }
     *     
     */
    public void setLevel(MessageResultLevel value) {
        this.level = value;
    }

    /**
     * Gets the value of the errorObjects property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorObjects }
     *     
     */
    public ErrorObjects getErrorObjects() {
        return errorObjects;
    }

    /**
     * Sets the value of the errorObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorObjects }
     *     
     */
    public void setErrorObjects(ErrorObjects value) {
        this.errorObjects = value;
    }

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
     * Gets the value of the lastSent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSent() {
        return lastSent;
    }

    /**
     * Sets the value of the lastSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSent(String value) {
        this.lastSent = value;
    }

    /**
     * Gets the value of the objectsRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObjectsRemaining() {
        return objectsRemaining;
    }

    /**
     * Sets the value of the objectsRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObjectsRemaining(BigInteger value) {
        this.objectsRemaining = value;
    }

}
