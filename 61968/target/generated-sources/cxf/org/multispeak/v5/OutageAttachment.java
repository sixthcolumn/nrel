
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a message that describes the outageStatus in either a Text-to-Speech transcription or recorded voice file.
 * 
 * <p>Java class for outageAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageAttachment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}attachment">
 *       &lt;sequence>
 *         &lt;element name="transcription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageAttachment", propOrder = {
    "transcription"
})
public class OutageAttachment
    extends Attachment
{

    protected String transcription;

    /**
     * Gets the value of the transcription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranscription() {
        return transcription;
    }

    /**
     * Sets the value of the transcription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranscription(String value) {
        this.transcription = value;
    }

}
