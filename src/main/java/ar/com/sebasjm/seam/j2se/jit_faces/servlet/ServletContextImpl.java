/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.seam.j2se.jit_faces.servlet;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 *
 * @author hernanv
 */
public class ServletContextImpl implements ServletContext {

    private Logger log = Logger.getLogger( ServletContextImpl.class.getName() );

    private Map<String,Object> attributes = new HashMap<String,Object>();

    private ServletConfig sc = null;

    public ServletContextImpl(ServletConfig sc) {
        this.sc = sc;
    }

    public String getContextPath(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ServletContext getContext(String uripath) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getMajorVersion() {
        return 2;
    }

    public int getMinorVersion() {
        return 2;
    }

    public String getMimeType(String file) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Set getResourcePaths(String path) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public URL getResource(String path) throws MalformedURLException {
//        log.info("getResource path " + path);
        return ClassLoader.getSystemResource(path);
    }

    public InputStream getResourceAsStream(String path) {
        try {
            log.info("getResource path " + path);
            
            return ServletContextImpl.class.getClassLoader().getResourceAsStream( path.startsWith("/") ? path.substring(1) : path );
        } catch (Exception ex) {
            Logger.getLogger(ServletContextImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public RequestDispatcher getRequestDispatcher(String path) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public RequestDispatcher getNamedDispatcher(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Servlet getServlet(String name) throws ServletException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Enumeration getServlets() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Enumeration getServletNames() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void log(String msg) {
        log.log(Level.INFO,msg);
    }

    public void log(Exception exception, String msg) {
        log.log(Level.SEVERE,msg + exception.getMessage());
    }

    public void log(String message, Throwable throwable) {
        log.log(Level.SEVERE,message + throwable.getMessage());
    }

    public String getRealPath(String path) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getServerInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getInitParameter(String name) {
//        log.info(" getInitParam name = " + name);
        return sc.getInitParameter(name);
    }

    public Enumeration getInitParameterNames() {
        return sc.getInitParameterNames();
    }

    public Object getAttribute(String name) {
//        log.info(" getAttr name = " + name);
        return attributes.get(name);
    }

    public Enumeration getAttributeNames() {
        return new Enumeration() {
            private Iterator<Entry<String,Object>> i = attributes.entrySet().iterator();

            public boolean hasMoreElements() {
                return i.hasNext();
            }

            public Object nextElement() {
                return i.next().getValue();
            }
        };
    }

    public void setAttribute(String name, Object object) {
        attributes.put(name, object);
    }

    public void removeAttribute(String name) {
        attributes.remove(name);
    }

    public String getServletContextName() {
        return "j2se_servletCtxName";
    }

}
