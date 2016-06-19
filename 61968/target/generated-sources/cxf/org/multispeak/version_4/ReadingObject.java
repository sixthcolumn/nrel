
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readingObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspObject">
 *       &lt;sequence>
 *         &lt;element name="sourceList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfSource" minOccurs="0"/>
 *         &lt;element name="readingList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterReading" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readingObject", propOrder = {
    "sourceList",
    "readingList"
})
public class ReadingObject
    extends MspObject
{

    protected ArrayOfSource sourceList;
    protected ArrayOfMeterReading readingList;

    /**
     * Gets the value of the sourceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSource }
     *     
     */
    public ArrayOfSource getSourceList() {
        return sourceList;
    }

    /**
     * Sets the value of the sourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSource }
     *     
     */
    public void setSourceList(ArrayOfSource value) {
        this.sourceList = value;
    }

    /**
     * Gets the value of the readingList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterReading }
     *     
     */
    public ArrayOfMeterReading getReadingList() {
        return readingList;
    }

    /**
     * Sets the value of the readingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterReading }
     *     
     */
    public void setReadingList(ArrayOfMeterReading value) {
        this.readingList = value;
    }

}
