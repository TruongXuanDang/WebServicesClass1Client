
package com.example.demo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for room complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="room">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceperday" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pricepermonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "room", propOrder = {
    "id",
    "name",
    "priceperday",
    "pricepermonth"
})
public class Room {

    protected int id;
    protected String name;
    protected int priceperday;
    protected int pricepermonth;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the priceperday property.
     * 
     */
    public int getPriceperday() {
        return priceperday;
    }

    /**
     * Sets the value of the priceperday property.
     * 
     */
    public void setPriceperday(int value) {
        this.priceperday = value;
    }

    /**
     * Gets the value of the pricepermonth property.
     * 
     */
    public int getPricepermonth() {
        return pricepermonth;
    }

    /**
     * Sets the value of the pricepermonth property.
     * 
     */
    public void setPricepermonth(int value) {
        this.pricepermonth = value;
    }

}
