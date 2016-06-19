
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the charge for sale of a commodity. For instance, if the current rate for electrical energy is $0.10/kWh, then the float value 0.10 is carried in the charge base element and the optional attributes currency code would carry "USD" for dollars, the commodityUnits would carry "kWh", and the rateDescription would carry "Current".
 * 
 * <p>Java class for charge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="charge">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0>rateComponent">
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "charge")
public class Charge
    extends RateComponent
{


}
