package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Empresa;
import ModeloDAO.EmpresaDAO;
import ModeloDAO.EmpresaDAO;
import java.text.DecimalFormat;
import Modelo.Administrador;
import java.util.ArrayList;
import ModeloDAO.AdministradorDAO;

public final class Administrador_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css\" integrity=\"sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"Estilos/estilos.css\"/>-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Estilos/estilosindex.css\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"Js/codigo.js\"></script> \n");
      out.write("        <title>Technology Networks</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <div class=\"d-flex\">\n");
      out.write("                <div class=\"card col-sm-2\">\n");
      out.write("                    <form action=\"Control?accion=registrarAdministrador\" method=\"POST\">\n");
      out.write("                        ");

                            AdministradorDAO adminDAO = new AdministradorDAO();
                            ArrayList<Administrador> listarAdministradores = adminDAO.listarTodoAdministrador();
                            int totalAdministradores = listarAdministradores.size() + 1;
                            String formato = "0000";
                            DecimalFormat objf = new DecimalFormat(formato);
                            String codAdmin = "A" + objf.format(totalAdministradores);
                            System.out.println("Administrador nuevo" + codAdmin);
                        
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Codigo</label>\n");
      out.write("                            <input type=\"text\" readonly=\"readonly\" name=\"txtCod_Admi\" value=\"");
      out.print(codAdmin);
      out.write("\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Nombre</label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Nombres\" name=\"txtNom_Admi\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Apellido paterno</label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Apellido Paterno\" name=\"txtApe_Pat_Admi\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Apellido materno</label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Apellido Materno\" name=\"txtApe_Mat_Admi\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Fecha de Ingreso</label>\n");
      out.write("                            <input type=\"text\" placeholder=\"yyyy-mm-dd\" name=\"txtFechaIngreso\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Locacion</label>                            \n");
      out.write("                            <select name=\"txtLoc\">\n");
      out.write("                                ");

                                    EmpresaDAO empDAO = new EmpresaDAO();
                                    ArrayList<Empresa> listarempresas = empDAO.listarEmpresas();
                                    for (int k = 0; k < listarempresas.size(); k++) {
      out.write("\n");
      out.write("                                <option value=\"");
      out.print( listarempresas.get(k).getLocacion());
      out.write('"');
      out.write('>');
      out.print( listarempresas.get(k).getLocacion());
      out.write("</option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Contraseña</label>\n");
      out.write("                            <input type=\"password\" placeholder=\"Contraseña\" name=\"txtpass\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Estado</label>\n");
      out.write("                            <select name=\"txtEstado\">\n");
      out.write("                                <option value=\"A\">Activo</option>\n");
      out.write("                                <option value=\"I\">Inactivo</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" value=\"Agregar\"  class=\"btn btn-info\">\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <table class=\"table table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>CODIGO</th>\n");
      out.write("                                <th>NOMBRE</th>\n");
      out.write("                                <th>PATERNO</th>\n");
      out.write("                                <th>MATERNO</th>\n");
      out.write("                                <th>FECHA INGRESO</th>\n");
      out.write("                                <th>LOC</th>\n");
      out.write("                                <th>CONTRASEÑA</th>\n");
      out.write("                                <th>ESTADO</th>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                for (int j = 0; j < listarAdministradores.size(); j++) {
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( listarAdministradores.get(j).getAdmin_cod());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( listarAdministradores.get(j).getAdmin_nombre());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( listarAdministradores.get(j).getAdmin_apepat());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( listarAdministradores.get(j).getAdmin_apemat());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( listarAdministradores.get(j).getAdmin_fec_ing());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( listarAdministradores.get(j).getAdmin_LOC());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( listarAdministradores.get(j).getAdmin_password());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( listarAdministradores.get(j).getAdmin_estado());
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                     <a href=\"#ventana1\" class=\"btn btn-primary\" data-toggle=\"modal\">Mostrar ventana</a>\n");
      out.write("                                    <a class=\"btn btn-danger\"  href=\"Control?accion=eliminarAdministrador&admin_cod=");
      out.print( listarAdministradores.get(j).getAdmin_cod());
      out.write("\" >Eliminar</a>\n");
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"ventana1\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form action=\"Control?accion=actualizarAdministrador\" method=\"POST\">   \n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <label>Codigo</label>\n");
      out.write("                            <input type=\"text\" readonly=\"readonly\" name=\"txtCod_Admi\" value=\"#\" class=\"form-control\" style=\"width: 420px;height: 38px\">\n");
      out.write("\n");
      out.write("                            <label>Nombre</label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Nombres\" name=\"txtNom_Admi\" value=\"#\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                            <label>Apellido paterno</label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Apellido Paterno\" name=\"txtApe_Pat_Admi\" value=\"#\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                            <label>Apellido materno</label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Apellido Materno\" name=\"txtApe_Mat_Admi\" value=\"#\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                            <label>Fecha de Ingreso</label>\n");
      out.write("                            <input type=\"text\" placeholder=\"yyyy-mm-dd\" name=\"txtFechaIngreso\" value=\"#\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <label>Locacion</label>                            \n");
      out.write("                                <select name=\"txtLoc\">\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <label>Contraseña</label>\n");
      out.write("                            <input type=\"password\" placeholder=\"Nueva contraseña\" name=\"txtpass\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <label>Estado</label>\n");
      out.write("                                <select name=\"txtEstado\">\n");
      out.write("                                    <option value=\"A\">Activo</option>\n");
      out.write("                                    <option value=\"I\">Inactivo</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" value=\"Actualizar\"  class=\"btn btn-info\">Actualizar</button>\n");
      out.write("                        <button class=\"btn btn-danger btn-large\" data-dismiss=\"modal\" aria-hidden=\"true\">Salir</button>\n");
      out.write("                    </form>                           \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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
