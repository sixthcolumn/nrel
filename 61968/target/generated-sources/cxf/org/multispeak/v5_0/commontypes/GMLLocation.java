
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.gml.PointType;


/**
 * This is a geographical x,y, (z) location, referenced to a specific geographical coordinate system and datum.
 * 
 * <p>Java class for GMLLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMLLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/gml}PointType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMLLocation")
public class GMLLocation
    extends PointType
{


}
