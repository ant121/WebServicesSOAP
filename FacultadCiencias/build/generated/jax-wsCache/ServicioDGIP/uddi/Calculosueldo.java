
package uddi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calculosueldo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="calculosueldo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pagoH" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculosueldo", propOrder = {
    "pagoH"
})
public class Calculosueldo {

    protected double pagoH;

    /**
     * Obtiene el valor de la propiedad pagoH.
     * 
     */
    public double getPagoH() {
        return pagoH;
    }

    /**
     * Define el valor de la propiedad pagoH.
     * 
     */
    public void setPagoH(double value) {
        this.pagoH = value;
    }

}
