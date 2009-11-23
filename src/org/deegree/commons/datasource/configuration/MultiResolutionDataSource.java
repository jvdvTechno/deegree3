//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.23 at 04:25:02 PM MEZ 
//


package org.deegree.commons.datasource.configuration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.deegree.org/datasource}AbstractGeospatialDataSourceType">
 *       &lt;sequence>
 *         &lt;element name="Resolution" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.deegree.org/datasource}AbstractGeospatialDataSource"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="res" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="crs" type="{http://www.w3.org/2001/XMLSchema}string" default="EPSG:4326" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resolution"
})
public class MultiResolutionDataSource
    extends AbstractGeospatialDataSourceType
{

    @XmlElement(name = "Resolution", required = true)
    protected List<MultiResolutionDataSource.Resolution> resolution;
    @XmlAttribute
    protected String crs;

    /**
     * Gets the value of the resolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiResolutionDataSource.Resolution }
     * 
     * 
     */
    public List<MultiResolutionDataSource.Resolution> getResolution() {
        if (resolution == null) {
            resolution = new ArrayList<MultiResolutionDataSource.Resolution>();
        }
        return this.resolution;
    }

    /**
     * Gets the value of the crs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrs() {
        if (crs == null) {
            return "EPSG:4326";
        } else {
            return crs;
        }
    }

    /**
     * Sets the value of the crs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrs(String value) {
        this.crs = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.deegree.org/datasource}AbstractGeospatialDataSource"/>
     *       &lt;/sequence>
     *       &lt;attribute name="res" type="{http://www.w3.org/2001/XMLSchema}double" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractGeospatialDataSource"
    })
    public static class Resolution {

        @XmlElementRef(name = "AbstractGeospatialDataSource", namespace = "http://www.deegree.org/datasource", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractGeospatialDataSourceType> abstractGeospatialDataSource;
        @XmlAttribute
        protected Double res;

        /**
         * Gets the value of the abstractGeospatialDataSource property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link RasterDataSource }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeospatialFileSystemDataSourceType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ConstrainedDatabaseDataSourceType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractGeospatialDataSourceType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MultiResolutionDataSource }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractGeospatialDataSourceType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractWebBasedDataSourceType }{@code >}
         *     {@link JAXBElement }{@code <}{@link WMSDataSourceType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractGeospatialDataSourceType> getAbstractGeospatialDataSource() {
            return abstractGeospatialDataSource;
        }

        /**
         * Sets the value of the abstractGeospatialDataSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link RasterDataSource }{@code >}
         *     {@link JAXBElement }{@code <}{@link GeospatialFileSystemDataSourceType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ConstrainedDatabaseDataSourceType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractGeospatialDataSourceType }{@code >}
         *     {@link JAXBElement }{@code <}{@link MultiResolutionDataSource }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractGeospatialDataSourceType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractWebBasedDataSourceType }{@code >}
         *     {@link JAXBElement }{@code <}{@link WMSDataSourceType }{@code >}
         *     
         */
        public void setAbstractGeospatialDataSource(JAXBElement<? extends AbstractGeospatialDataSourceType> value) {
            this.abstractGeospatialDataSource = ((JAXBElement<? extends AbstractGeospatialDataSourceType> ) value);
        }

        /**
         * Gets the value of the res property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getRes() {
            return res;
        }

        /**
         * Sets the value of the res property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setRes(Double value) {
            this.res = value;
        }

    }

}
