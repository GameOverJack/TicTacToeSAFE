
package ttt.game.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setIsFound complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setIsFound">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="found" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setIsFound", propOrder = {
    "uName",
    "found"
})
public class SetIsFound {

    protected String uName;
    protected int found;

    /**
     * Gets the value of the uName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUName() {
        return uName;
    }

    /**
     * Sets the value of the uName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUName(String value) {
        this.uName = value;
    }

    /**
     * Gets the value of the found property.
     * 
     */
    public int getFound() {
        return found;
    }

    /**
     * Sets the value of the found property.
     * 
     */
    public void setFound(int value) {
        this.found = value;
    }

}
