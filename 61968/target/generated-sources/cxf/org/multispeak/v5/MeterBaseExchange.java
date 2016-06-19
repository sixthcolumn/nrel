
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This object facilitates the exchange of meter bases at a customer service. The objectID of this object is the objectID of the device being added; the replaceID attribute carries the objectID of the device being replaced.
 * 
 * <p>Java class for meterBaseExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterBaseExchange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspServiceDeviceExchange">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterBaseExchange")
public class MeterBaseExchange
    extends MspServiceDeviceExchange
{


}
