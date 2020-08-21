<%-- 
    Document   : Consumo
    Created on : 20/08/2020, 16:03:22
    Author     : Elvis
--%>

<%@page import="java.lang.Double"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Suma</title>
        <!-- CSS only -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    
    </head>
    <body>
        <%!
            String sueldoH,s_dia1,s_dia2,s_dia3,s_dia4,s_dia5,s_dia6;
        %>
        <div class="container">
            <h1>Suma</h1>
            <form action="Consumo.jsp" method="POST">
                <div class="form-group">
                    <label for="txt_nombre">Ingrese el pago por hora:</label>
                    <input type="number" class="form-control" name="txt_sueldo" required>
                </div>
                <div class="form-group">
                    <label for="txt_nombre">Ingrese las horas trabajadas el dia 1</label>
                    <input type="number" class="form-control" name="txt_num1" required>
                </div>
                
                <div class="form-group">
                    <label for="txt_nombre">Ingrese las horas trabajadas el dia 2</label>
                    <input type="number" class="form-control" name="txt_num2" required>
                </div>
                <div class="form-group">
                    <label for="txt_nombre">Ingrese las horas trabajadas el dia 3</label>
                    <input type="number" class="form-control" name="txt_num3" required>
                </div>
                <div class="form-group">
                    <label for="txt_nombre">Ingrese las horas trabajadas el dia 4</label>
                    <input type="number" class="form-control" name="txt_num4" required>
                </div>
                <div class="form-group">
                    <label for="txt_nombre">Ingrese las horas trabajadas el dia 5</label>
                    <input type="number" class="form-control" name="txt_num5" required>
                </div>
                <div class="form-group">
                    <label for="txt_nombre">Ingrese las horas trabajadas el dia 6</label>
                    <input type="number" class="form-control" name="txt_num6" required>
                </div>
                
                <button type="submit" class="btn btn-primary">Enviar datos</button>
            </form>
        </div>       
        <%-- Almacenar los datos capturados de las variables--%>
        <%
            sueldoH=request.getParameter("txt_sueldo");
            s_dia1=request.getParameter("txt_num1");
            s_dia2=request.getParameter("txt_num2");
            s_dia3=request.getParameter("txt_num3");
            s_dia4=request.getParameter("txt_num4");
            s_dia5=request.getParameter("txt_num5");
            s_dia6=request.getParameter("txt_num6");
        %>
        <div class="container">
            <hr/>
            <p>
                
        <%-- start web service invocation --%>
    <%
    try {
	uddi.ServicioDGIP_Service service = new uddi.ServicioDGIP_Service();
	uddi.ServicioDGIP port = service.getServicioDGIPPort();
	 // TODO initialize WS operation arguments here
	int dia1 = Integer.parseInt(s_dia1);
	int dia2 = Integer.parseInt(s_dia2);
	int dia3 = Integer.parseInt(s_dia3);
	int dia4 = Integer.parseInt(s_dia4);
	int dia5 = Integer.parseInt(s_dia5);
	int dia6 = Integer.parseInt(s_dia6);
	// TODO process result here
	int result = port.calculo(dia1, dia2, dia3, dia4, dia5, dia6);
	out.println("El total del horas trabajadas son "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%>

        <%-- start web service invocation --%>
    <%
    try {
	uddi.ServicioDGIP_Service service = new uddi.ServicioDGIP_Service();
	uddi.ServicioDGIP port = service.getServicioDGIPPort();
	 // TODO initialize WS operation arguments here
	double pagoH = Double.parseDouble(sueldoH);
	// TODO process result here
	double result = port.calculosueldo(pagoH);
	out.println("y el sueldo es "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%>
        </p>
    </div>
        
    </body>
</html>
