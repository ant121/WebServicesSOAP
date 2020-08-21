/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDDI;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Elvis
 */
@WebService(serviceName = "ServicioDGIP")
public class ServicioDGIP {
    private static int h;
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "calculo")
    public int  calculoSH(@WebParam(name = "dia1") int dia1,@WebParam(name = "dia2") int dia2,@WebParam(name = "dia3") int dia3,@WebParam(name = "dia4") int dia4,@WebParam(name = "dia5") int dia5,@WebParam(name = "dia6") int dia6) {
        int horas=Calculo.horasTrabajadas(dia1,dia2,dia3,dia4,dia5,dia6);
        h=horas;
        return  horas;
    }
    public double calculosueldo(@WebParam(name = "pagoH") double pagoH){
        double sueldo=pagoH*h;
        return sueldo;
    }
}
