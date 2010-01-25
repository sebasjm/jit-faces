/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.seam.j2se.jit_faces.servlet;

import com.sun.faces.util.RequestStateManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;

/**
 *
 * @author hernanv
 */
public class ServletRequestImpl implements ServletRequest {

    private Logger log = Logger.getLogger( ServletRequestImpl.class.getName() );

    private Map<String,Object> attributes = new HashMap<String,Object>();

    private Map<String,String> parameters = new HashMap<String,String>();

    private Locale[] locales = new Locale[]{ new Locale("es") };

    public ServletRequestImpl() {
        attributes.put("javax.servlet.include.path_info", "/home.jsf");
//        attributes.put("javax.servlet.include.servlet_path", "/");

        Map<String,Object> rqStateManager = new HashMap<String,Object>();
        rqStateManager.put(RequestStateManager.ACTUAL_VIEW_MAP, null);
        rqStateManager.put(RequestStateManager.AFTER_VIEW_CONTENT, null);
        rqStateManager.put(RequestStateManager.CLIENT_ID_MESSAGES_NOT_DISPLAYED, new HashSet<String>() );
        rqStateManager.put(RequestStateManager.EL_RESOLVER_CHAIN_TYPE_NAME, null);
        rqStateManager.put(RequestStateManager.EXTERNALCONTEXT_IMPL_ATTR_NAME, null);
        rqStateManager.put(RequestStateManager.FACESCONTEXT_IMPL_ATTR_NAME, null);
        rqStateManager.put(RequestStateManager.FACES_VIEW_STATE, null);
        rqStateManager.put(RequestStateManager.FACES_VIEW_STRUCTURE, null);
        rqStateManager.put(RequestStateManager.INVOCATION_PATH, "/");
        rqStateManager.put(RequestStateManager.LOGICAL_VIEW_MAP, null);
        rqStateManager.put(RequestStateManager.RENDER_KIT_IMPL_REQ, null);
        rqStateManager.put(RequestStateManager.REENTRANT_GUARD, null);
        rqStateManager.put(RequestStateManager.TARGET_COMPONENT_ATTRIBUTE_NAME, null);
        rqStateManager.put(RequestStateManager.VIEWTAG_STACK_ATTR_NAME, null);

        attributes.put("com.sun.faces.util.RequestStateManager", rqStateManager);

    }

    public Object getAttribute(String name) {
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

    public String getCharacterEncoding() {
        return "UTF-8";
    }

    public void setCharacterEncoding(String env) throws UnsupportedEncodingException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getContentLength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getContentType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ServletInputStream getInputStream() throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getParameter(String name) {
        return parameters.get(name);
    }

    public Enumeration getParameterNames() {
        return new Enumeration() {
            private Iterator<Entry<String,String>> i = parameters.entrySet().iterator();

            public boolean hasMoreElements() {
                return i.hasNext();
            }

            public Object nextElement() {
                return i.next().getValue();
            }
        };
    }

    public String[] getParameterValues(String name) {
        return (String[])parameters.values().toArray();
    }

    public Map getParameterMap() {
        return new HashMap<String,String>(parameters);
    }

    public String getProtocol() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getScheme() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getServerName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getServerPort() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public BufferedReader getReader() throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getRemoteAddr() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getRemoteHost() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setAttribute(String name, Object o) {
        log.info("setAttr name = " + name);
        attributes.put(name, o);
    }

    public void removeAttribute(String name) {
        attributes.remove(name);
    }

    public Locale getLocale() {
        return locales[0];
    }

    public Enumeration getLocales() {
        return new Enumeration() {
            private Iterator<Locale> i = Arrays.asList( locales ).iterator();

            public boolean hasMoreElements() {
                return i.hasNext();
            }

            public Object nextElement() {
                return i.next();
            }
        };
    }

    public boolean isSecure() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public RequestDispatcher getRequestDispatcher(String path) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getRealPath(String path) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getRemotePort() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getLocalName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getLocalAddr() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getLocalPort() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
