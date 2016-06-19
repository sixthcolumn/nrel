
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Reactive power rating envelope versus the synchronous machine's active power, in both the generating and motoring modes. For each MW value there is a corresponding high and low MVAr limit  value. Typically there will be a separate curve for each coolant condition, such as hydrogen pressure.  The Y1 axis values represent reactive minimum and the Y2 axis values represent reactive maximum.
 * 
 * <p>Java class for ReactiveCapabilityCurve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReactiveCapabilityCurve">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}Curve">
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReactiveCapabilityCurve")
public class ReactiveCapabilityCurve
    extends Curve
{


}
