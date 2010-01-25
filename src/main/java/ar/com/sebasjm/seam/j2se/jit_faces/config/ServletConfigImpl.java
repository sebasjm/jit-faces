/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.seam.j2se.jit_faces.config;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import ar.com.sebasjm.seam.j2se.jit_faces.servlet.ServletContextImpl;
/**
 *
 * @author hernanv
 */
public class ServletConfigImpl implements ServletConfig {

    private ServletContext sc = null;

    public ServletConfigImpl() {
        sc = new ServletContextImpl(this);
    }

    public String getServletName() {
        return "j2seServlet";
    }

    public ServletContext getServletContext() {
        return this.sc;
    }

    public String getInitParameter(String name) {

        for(ServletInitParams sip : ServletInitParams.values()){
            if (sip.getId().equals(name)){
                return sip.getValue();
            }
        }

        throw new UnsupportedOperationException("Parameter ("+ name+") not supported yet in ServletInitParams.");
    }

    public Enumeration getInitParameterNames() {
        return new Enumeration() {
            private Iterator i = Arrays.asList( ServletInitParams.values() ).iterator();

            public boolean hasMoreElements() {
                return i.hasNext();
            }

            public Object nextElement() {
                return i.next();
            }
        };
    }

}
