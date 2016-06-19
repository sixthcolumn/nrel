
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a reading object that was originally developed from the C12.19 data schema. It has bee DEPRECATED in MultiSPeak V5.0 and its use in MultiSpeak is discouraged.
 * 
 * <p>Java class for readingObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="sourceList" type="{http://www.multispeak.org/V5.0}sourceList" minOccurs="0"/>
 *         &lt;element name="readingList" type="{http://www.multispeak.org/V5.0}readingList" minOccurs="0"/>
 *       &lt;/sequence>
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
    extends MspReferable
{

    protected SourceList sourceList;
    protected ReadingList readingList;

    /**
     * Gets the value of the sourceList property.
     * 
     * @return
     *     possible object is
     *     {@link SourceList }
     *     
     */
    public SourceList getSourceList() {
        return sourceList;
    }

    /**
     * Sets the value of the sourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceList }
     *     
     */
    public void setSourceList(SourceList value) {
        this.sourceList = value;
    }

    /**
     * Gets the value of the readingList property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingList }
     *     
     */
    public ReadingList getReadingList() {
        return readingList;
    }

    /**
     * Sets the value of the readingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingList }
     *     
     */
    public void setReadingList(ReadingList value) {
        this.readingList = value;
    }

}
