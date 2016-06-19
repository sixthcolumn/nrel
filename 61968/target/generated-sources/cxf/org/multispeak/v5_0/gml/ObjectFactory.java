
package org.multispeak.v5_0.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.multispeak.v5_0.gml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LineString_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "LineString");
    private final static QName _LinearRing_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "LinearRing");
    private final static QName _LineStringMember_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "lineStringMember");
    private final static QName _Box_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "Box");
    private final static QName _OuterBoundaryIs_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "outerBoundaryIs");
    private final static QName _PointMember_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "pointMember");
    private final static QName _InnerBoundaryIs_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "innerBoundaryIs");
    private final static QName _MultiLineString_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "MultiLineString");
    private final static QName _Geometry_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "_Geometry");
    private final static QName _MultiPolygon_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "MultiPolygon");
    private final static QName _GeometryCollection_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "_GeometryCollection");
    private final static QName _MultiGeometry_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "MultiGeometry");
    private final static QName _PolygonMember_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "polygonMember");
    private final static QName _MultiPoint_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "MultiPoint");
    private final static QName _Point_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "Point");
    private final static QName _Coordinates_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "coordinates");
    private final static QName _GeometryMember_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "geometryMember");
    private final static QName _Coord_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "coord");
    private final static QName _Polygon_QNAME = new QName("http://www.multispeak.org/V5.0/gml", "Polygon");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.multispeak.v5_0.gml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MultiPolygonType }
     * 
     */
    public MultiPolygonType createMultiPolygonType() {
        return new MultiPolygonType();
    }

    /**
     * Create an instance of {@link GeometryAssociationType }
     * 
     */
    public GeometryAssociationType createGeometryAssociationType() {
        return new GeometryAssociationType();
    }

    /**
     * Create an instance of {@link PointMemberType }
     * 
     */
    public PointMemberType createPointMemberType() {
        return new PointMemberType();
    }

    /**
     * Create an instance of {@link LinearRingMemberType }
     * 
     */
    public LinearRingMemberType createLinearRingMemberType() {
        return new LinearRingMemberType();
    }

    /**
     * Create an instance of {@link GeometryCollectionType }
     * 
     */
    public GeometryCollectionType createGeometryCollectionType() {
        return new GeometryCollectionType();
    }

    /**
     * Create an instance of {@link MultiLineStringType }
     * 
     */
    public MultiLineStringType createMultiLineStringType() {
        return new MultiLineStringType();
    }

    /**
     * Create an instance of {@link LineStringType }
     * 
     */
    public LineStringType createLineStringType() {
        return new LineStringType();
    }

    /**
     * Create an instance of {@link BoxType }
     * 
     */
    public BoxType createBoxType() {
        return new BoxType();
    }

    /**
     * Create an instance of {@link LinearRingType }
     * 
     */
    public LinearRingType createLinearRingType() {
        return new LinearRingType();
    }

    /**
     * Create an instance of {@link MultiPointType }
     * 
     */
    public MultiPointType createMultiPointType() {
        return new MultiPointType();
    }

    /**
     * Create an instance of {@link PolygonMemberType }
     * 
     */
    public PolygonMemberType createPolygonMemberType() {
        return new PolygonMemberType();
    }

    /**
     * Create an instance of {@link CoordType }
     * 
     */
    public CoordType createCoordType() {
        return new CoordType();
    }

    /**
     * Create an instance of {@link PolygonType }
     * 
     */
    public PolygonType createPolygonType() {
        return new PolygonType();
    }

    /**
     * Create an instance of {@link PointType }
     * 
     */
    public PointType createPointType() {
        return new PointType();
    }

    /**
     * Create an instance of {@link CoordinatesType }
     * 
     */
    public CoordinatesType createCoordinatesType() {
        return new CoordinatesType();
    }

    /**
     * Create an instance of {@link LineStringMemberType }
     * 
     */
    public LineStringMemberType createLineStringMemberType() {
        return new LineStringMemberType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "LineString", substitutionHeadNamespace = "http://www.multispeak.org/V5.0/gml", substitutionHeadName = "_Geometry")
    public JAXBElement<LineStringType> createLineString(LineStringType value) {
        return new JAXBElement<LineStringType>(_LineString_QNAME, LineStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "LinearRing", substitutionHeadNamespace = "http://www.multispeak.org/V5.0/gml", substitutionHeadName = "_Geometry")
    public JAXBElement<LinearRingType> createLinearRing(LinearRingType value) {
        return new JAXBElement<LinearRingType>(_LinearRing_QNAME, LinearRingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineStringMemberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "lineStringMember", substitutionHeadNamespace = "http://www.multispeak.org/V5.0/gml", substitutionHeadName = "geometryMember")
    public JAXBElement<LineStringMemberType> createLineStringMember(LineStringMemberType value) {
        return new JAXBElement<LineStringMemberType>(_LineStringMember_QNAME, LineStringMemberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "Box")
    public JAXBElement<BoxType> createBox(BoxType value) {
        return new JAXBElement<BoxType>(_Box_QNAME, BoxType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "outerBoundaryIs")
    public JAXBElement<LinearRingType> createOuterBoundaryIs(LinearRingType value) {
        return new JAXBElement<LinearRingType>(_OuterBoundaryIs_QNAME, LinearRingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointMemberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "pointMember", substitutionHeadNamespace = "http://www.multispeak.org/V5.0/gml", substitutionHeadName = "geometryMember")
    public JAXBElement<PointMemberType> createPointMember(PointMemberType value) {
        return new JAXBElement<PointMemberType>(_PointMember_QNAME, PointMemberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "innerBoundaryIs")
    public JAXBElement<LinearRingType> createInnerBoundaryIs(LinearRingType value) {
        return new JAXBElement<LinearRingType>(_InnerBoundaryIs_QNAME, LinearRingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiLineStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "MultiLineString", substitutionHeadNamespace = "http://www.multispeak.org/V5.0/gml", substitutionHeadName = "_Geometry")
    public JAXBElement<MultiLineStringType> createMultiLineString(MultiLineStringType value) {
        return new JAXBElement<MultiLineStringType>(_MultiLineString_QNAME, MultiLineStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "_Geometry")
    public JAXBElement<AbstractGeometryType> createGeometry(AbstractGeometryType value) {
        return new JAXBElement<AbstractGeometryType>(_Geometry_QNAME, AbstractGeometryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPolygonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "MultiPolygon", substitutionHeadNamespace = "http://www.multispeak.org/V5.0/gml", substitutionHeadName = "_Geometry")
    public JAXBElement<MultiPolygonType> createMultiPolygon(MultiPolygonType value) {
        return new JAXBElement<MultiPolygonType>(_MultiPolygon_QNAME, MultiPolygonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeometryCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "_GeometryCollection", substitutionHeadNamespace = "http://www.multispeak.org/V5.0/gml", substitutionHeadName = "_Geometry")
    public JAXBElement<GeometryCollectionType> createGeometryCollection(GeometryCollectionType value) {
        return new JAXBElement<GeometryCollectionType>(_GeometryCollection_QNAME, GeometryCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeometryCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "MultiGeometry", substitutionHeadNamespace = "http://www.multispeak.org/V5.0/gml", substitutionHeadName = "_Geometry")
    public JAXBElement<GeometryCollectionType> createMultiGeometry(GeometryCollectionType value) {
        return new JAXBElement<GeometryCollectionType>(_MultiGeometry_QNAME, GeometryCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonMemberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "polygonMember", substitutionHeadNamespace = "http://www.multispeak.org/V5.0/gml", substitutionHeadName = "geometryMember")
    public JAXBElement<PolygonMemberType> createPolygonMember(PolygonMemberType value) {
        return new JAXBElement<PolygonMemberType>(_PolygonMember_QNAME, PolygonMemberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "MultiPoint", substitutionHeadNamespace = "http://www.multispeak.org/V5.0/gml", substitutionHeadName = "_Geometry")
    public JAXBElement<MultiPointType> createMultiPoint(MultiPointType value) {
        return new JAXBElement<MultiPointType>(_MultiPoint_QNAME, MultiPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "Point", substitutionHeadNamespace = "http://www.multispeak.org/V5.0/gml", substitutionHeadName = "_Geometry")
    public JAXBElement<PointType> createPoint(PointType value) {
        return new JAXBElement<PointType>(_Point_QNAME, PointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinatesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "coordinates")
    public JAXBElement<CoordinatesType> createCoordinates(CoordinatesType value) {
        return new JAXBElement<CoordinatesType>(_Coordinates_QNAME, CoordinatesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeometryAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "geometryMember")
    public JAXBElement<GeometryAssociationType> createGeometryMember(GeometryAssociationType value) {
        return new JAXBElement<GeometryAssociationType>(_GeometryMember_QNAME, GeometryAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "coord")
    public JAXBElement<CoordType> createCoord(CoordType value) {
        return new JAXBElement<CoordType>(_Coord_QNAME, CoordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.multispeak.org/V5.0/gml", name = "Polygon", substitutionHeadNamespace = "http://www.multispeak.org/V5.0/gml", substitutionHeadName = "_Geometry")
    public JAXBElement<PolygonType> createPolygon(PolygonType value) {
        return new JAXBElement<PolygonType>(_Polygon_QNAME, PolygonType.class, null, value);
    }

}
