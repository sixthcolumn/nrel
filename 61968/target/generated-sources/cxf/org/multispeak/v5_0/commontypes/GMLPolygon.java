
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.gml.PolygonType;


/**
 * This is a polygon geometry that is built using GML classes. Note that the lines that make up a polygon should be closed.  If the line is intended to be a closed line, then the first and last coordiantes must be identical.  If the first and last coordinates are not identical, then the line is assumed not to be closed.
 * 
 * <p>Java class for GMLPolygon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMLPolygon">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/gml}PolygonType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMLPolygon")
public class GMLPolygon
    extends PolygonType
{


}
