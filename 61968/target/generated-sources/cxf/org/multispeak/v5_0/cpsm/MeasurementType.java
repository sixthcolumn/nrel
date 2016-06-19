
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the type of Measurement, e.g. IndoorTemperature, OutDoorTemperature, BusVoltage, GeneratorVoltage, LineFlow etc. The cimMeasurementType.nameFields.name shall be unique among all specified types and describe the type. The cimMeasurementType.nameFields.aliasName is meant to be used for localization.  For the CPSM profile, the only acceptable values for cimMeasurementType.nameFields.name are: ThreePhasePower,ThreePhaseActivePower, ThreePhaseReactivePower, LineCurrent, LineToLineVoltage, Angle, TapPosition, or SwitchPosition.
 * 
 * <p>Java class for MeasurementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementType">
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
@XmlType(name = "MeasurementType")
public class MeasurementType
    extends MspCIMObject
{


}
