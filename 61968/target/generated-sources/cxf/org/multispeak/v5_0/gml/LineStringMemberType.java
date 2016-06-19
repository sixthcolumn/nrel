
package org.multispeak.v5_0.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Restricts the geometry member to being a LineString instance.
 * 
 * <p>Java class for LineStringMemberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineStringMemberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.multispeak.org/V5.0/gml}GeometryAssociationType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.multispeak.org/V5.0/gml}LineString"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.multispeak.org/V5.0/gml}AssociationAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineStringMemberType")
public class LineStringMemberType
    extends GeometryAssociationType
{


}
