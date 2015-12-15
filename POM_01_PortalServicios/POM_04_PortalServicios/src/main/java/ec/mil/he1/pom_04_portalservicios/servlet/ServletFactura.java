/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_04_portalservicios.servlet;

/**
 *
 * @author byron_simbana
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ec.mil.he1.pom_01_domain.SegUrls;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


/**
 *
 * @author christian_ruiz
 */
@WebServlet(name = "factura", urlPatterns = {"/xldrHnd"})
public class ServletFactura extends HttpServlet {

    @Resource(name = "dataSourceHe1")
    private DataSource dataSourceHe1;

    @EJB
    private SegUrlsFacade segUrlsFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        ServletContext servletContext = request.getSession().getServletContext();
        HashMap hashMap = new HashMap();

        Connection connection = null;
        byte[] bytes = null;
        try {
            //lamada al url del sello
            SegUrls findURL = segUrlsFacade.findURL("imagen sello he1");

            String RID = request.getParameter("kkjdndj");
            String VALOR = request.getParameter("sddvaxd");
            //aca se coloca los parámetros del reporte

            hashMap.put("rid", RID);
            hashMap.put("valor", VALOR);
            hashMap.put("sello", findURL.getUrl());

            //dentro de la carpeta WEB-INF se debe colocar los reportes, 
            //en este caso se coloca los .jrxml no el .jasper
            String jrxmlPath = servletContext.getRealPath("/WEB-INF/report/");
            // directories where the report files are 
            String reportfile = "FacturasHE1_V2.jrxml";
            String jrxmlfile = jrxmlPath + "/" + reportfile;

            //InputStream is = this.getClass().getClassLoader().getResourceAsStream("/WEB-INF/report/"+jrxmlfile);
            JasperReport jasperReport = JasperCompileManager.compileReport(jrxmlfile);            //is.close();

            //se obtiene la conexion a la base de datos
            connection = dataSourceHe1.getConnection();
            //se envia los parametros en este caso el compilado, el hashmap con los param del reporte y la conexión 
            //a la base de datos
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hashMap, connection);
            //se almacena la impresión en un arreglo de bytes    
            bytes = JasperExportManager.exportReportToPdf(jasperPrint);
        } catch (JRException e) {
            //en caso de error imprimirlo
            System.out.println("e = " + e.getLocalizedMessage());
        } finally {
            //se cierra la conexion
            connection.close();
        }

        response.setHeader("Content-disposition", "inline;filename=morningShift.pdf;");
        response.setContentType("application/pdf");
        response.setContentLength(bytes.length);

        response.getOutputStream().write(bytes);
        response.flushBuffer();

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ServletFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ServletFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
