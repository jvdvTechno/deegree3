//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.09 at 05:33:49 PM MEZ 
//


package org.deegree.feature.persistence.postgis.jaxbconfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="DBTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GMLDefaultProps" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dbTable",
    "gmlDefaultProps"
})
@XmlRootElement(name = "FeatureTypeMappingHints")
public class FeatureTypeMappingHints {

    @XmlElement(name = "DBTable", required = true)
    protected String dbTable;
    @XmlElement(name = "GMLDefaultProps")
    protected boolean gmlDefaultProps;

    /**
     * Gets the value of the dbTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBTable() {
        return dbTable;
    }

    /**
     * Sets the value of the dbTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBTable(String value) {
        this.dbTable = value;
    }

    /**
     * Gets the value of the gmlDefaultProps property.
     * 
     */
    public boolean isGMLDefaultProps() {
        return gmlDefaultProps;
    }

    /**
     * Sets the value of the gmlDefaultProps property.
     * 
     */
    public void setGMLDefaultProps(boolean value) {
        this.gmlDefaultProps = value;
    }

}
