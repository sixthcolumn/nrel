
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readingSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}schedule">
 *       &lt;sequence>
 *         &lt;element name="meterList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfMeterID" minOccurs="0"/>
 *         &lt;element name="meterGroupList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString14" minOccurs="0"/>
 *         &lt;element name="configurationGroupList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfString15" minOccurs="0"/>
 *         &lt;element name="readingTypeList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfReadingType" minOccurs="0"/>
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
@XmlType(name = "readingSchedule", propOrder = {
    "meterList",
    "meterGroupList",
    "configurationGroupList",
    "readingTypeList"
})
public class ReadingSchedule
    extends Schedule
{

    protected ArrayOfMeterID meterList;
    protected ArrayOfString14 meterGroupList;
    protected ArrayOfString15 configurationGroupList;
    protected ArrayOfReadingType readingTypeList;

    /**
     * Gets the value of the meterList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeterID }
     *     
     */
    public ArrayOfMeterID getMeterList() {
        return meterList;
    }

    /**
     * Sets the value of the meterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeterID }
     *     
     */
    public void setMeterList(ArrayOfMeterID value) {
        this.meterList = value;
    }

    /**
     * Gets the value of the meterGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString14 }
     *     
     */
    public ArrayOfString14 getMeterGroupList() {
        return meterGroupList;
    }

    /**
     * Sets the value of the meterGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString14 }
     *     
     */
    public void setMeterGroupList(ArrayOfString14 value) {
        this.meterGroupList = value;
    }

    /**
     * Gets the value of the configurationGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString15 }
     *     
     */
    public ArrayOfString15 getConfigurationGroupList() {
        return configurationGroupList;
    }

    /**
     * Sets the value of the configurationGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString15 }
     *     
     */
    public void setConfigurationGroupList(ArrayOfString15 value) {
        this.configurationGroupList = value;
    }

    /**
     * Gets the value of the readingTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReadingType }
     *     
     */
    public ArrayOfReadingType getReadingTypeList() {
        return readingTypeList;
    }

    /**
     * Sets the value of the readingTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReadingType }
     *     
     */
    public void setReadingTypeList(ArrayOfReadingType value) {
        this.readingTypeList = value;
    }

}
