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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeaturePropertyMappingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeaturePropertyMappingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.deegree.org/feature/featuretype}PropertyMappingType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.deegree.org/feature/featuretype}DBColumn"/>
 *         &lt;element ref="{http://www.deegree.org/feature/featuretype}FeatureJoinTable"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeaturePropertyMappingType", propOrder = {
    "dbColumn",
    "featureJoinTable"
})
public class FeaturePropertyMappingType
    extends PropertyMappingType
{

    @XmlElement(name = "DBColumn")
    protected DBColumn dbColumn;
    @XmlElement(name = "FeatureJoinTable")
    protected FeatureJoinTable featureJoinTable;

    /**
     * Gets the value of the dbColumn property.
     * 
     * @return
     *     possible object is
     *     {@link DBColumn }
     *     
     */
    public DBColumn getDBColumn() {
        return dbColumn;
    }

    /**
     * Sets the value of the dbColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DBColumn }
     *     
     */
    public void setDBColumn(DBColumn value) {
        this.dbColumn = value;
    }

    /**
     * Gets the value of the featureJoinTable property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureJoinTable }
     *     
     */
    public FeatureJoinTable getFeatureJoinTable() {
        return featureJoinTable;
    }

    /**
     * Sets the value of the featureJoinTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureJoinTable }
     *     
     */
    public void setFeatureJoinTable(FeatureJoinTable value) {
        this.featureJoinTable = value;
    }

}
