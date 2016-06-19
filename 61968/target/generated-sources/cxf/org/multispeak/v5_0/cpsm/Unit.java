
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Quantity being measured. The Unit.nameFields.name shall be unique among all specified quantities and describe the quantity. The Unit.nameFieldsaliasName is meant to be used for localization.  For the purposes of the CPSM profile, the only acceptable values of Unit.nameFields.name are: MW, Degrees, MVA, Count, Amperes, PerCent, Ratio, MVAr, kV, TapPosition, or SwitchPosition.
 * 
 * <p>Java class for Unit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Unit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}mspCIMObject">
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Unit")
public class Unit
    extends MspCIMObject
{


}
