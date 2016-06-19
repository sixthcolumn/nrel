
package org.multispeak.version_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for voltageAlarm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="voltageAlarm">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_4.1_Release}mspAlarm">
 *       &lt;sequence>
 *         &lt;element name="voltageAlarmList" type="{http://www.multispeak.org/Version_4.1_Release}ArrayOfVoltageAlarmItem" minOccurs="0"/>
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
@XmlType(name = "voltageAlarm", propOrder = {
    "voltageAlarmList"
})
public class VoltageAlarm
    extends MspAlarm
{

    protected ArrayOfVoltageAlarmItem voltageAlarmList;

    /**
     * Gets the value of the voltageAlarmList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVoltageAlarmItem }
     *     
     */
    public ArrayOfVoltageAlarmItem getVoltageAlarmList() {
        return voltageAlarmList;
    }

    /**
     * Sets the value of the voltageAlarmList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVoltageAlarmItem }
     *     
     */
    public void setVoltageAlarmList(ArrayOfVoltageAlarmItem value) {
        this.voltageAlarmList = value;
    }

}
