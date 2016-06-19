
package org.multispeak.v5_0.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A MultiPoint is defined by one or more Points, referenced through 
 *         pointMember elements.
 *       
 * 
 * <p>Java class for MultiPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.multispeak.org/V5.0/gml}GeometryCollectionType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element ref="{http://www.multispeak.org/V5.0/gml}pointMember"/>
 *       &lt;/sequence>
 *       &lt;attribute name="gid" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="srsName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiPointType")
public class MultiPointType
    extends GeometryCollectionType
{


}
