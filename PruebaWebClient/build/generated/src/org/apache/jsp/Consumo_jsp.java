package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.Double;

public final class Consumo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String sueldoH,s_dia1,s_dia2,s_dia3,s_dia4,s_dia5,s_dia6;
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Suma</title>\n");
      out.write("        <!-- CSS only -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Suma</h1>\n");
      out.write("            <form action=\"Consumo.jsp\" method=\"POST\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"txt_nombre\">Ingrese el pago por hora:</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"txt_sueldo\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"txt_nombre\">Ingrese las horas trabajadas el dia 1</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"txt_num1\" required>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"txt_nombre\">Ingrese las horas trabajadas el dia 2</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"txt_num2\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"txt_nombre\">Ingrese las horas trabajadas el dia 3</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"txt_num3\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"txt_nombre\">Ingrese las horas trabajadas el dia 4</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"txt_num4\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"txt_nombre\">Ingrese las horas trabajadas el dia 5</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"txt_num5\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"txt_nombre\">Ingrese las horas trabajadas el dia 6</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"txt_num6\" required>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Enviar datos</button>\n");
      out.write("            </form>\n");
      out.write("        </div>       \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            sueldoH=request.getParameter("txt_sueldo");
            s_dia1=request.getParameter("txt_num1");
            s_dia2=request.getParameter("txt_num2");
            s_dia3=request.getParameter("txt_num3");
            s_dia4=request.getParameter("txt_num4");
            s_dia5=request.getParameter("txt_num5");
            s_dia6=request.getParameter("txt_num6");
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <hr/>\n");
      out.write("            <p>\n");
      out.write("                \n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("    \n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
