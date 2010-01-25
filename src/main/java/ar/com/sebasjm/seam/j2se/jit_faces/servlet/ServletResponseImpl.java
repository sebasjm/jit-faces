/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.seam.j2se.jit_faces.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.logging.Logger;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;

/**
 *
 * @author hernanv
 */
public class ServletResponseImpl implements ServletResponse {

    private Logger log = Logger.getLogger( ServletResponseImpl.class.getName() );

    private String contentType = "text/html";

    public ServletResponseImpl() {
    }

    public String getCharacterEncoding() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getContentType() {
        return contentType;
    }

    public ServletOutputStream getOutputStream() throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private PrintWriter printWriter = null;

    public PrintWriter getWriter() throws IOException {
        if (printWriter == null){
            this.printWriter = new PrintWriter( new File("/Users/hernanv/pagina_loca.html") );
        }
        return printWriter;
        
    }

    public void setCharacterEncoding(String charset) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setContentLength(int len) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setContentType(String type) {
        this.contentType = type;
    }

    public void setBufferSize(int size) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getBufferSize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void flushBuffer() throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void resetBuffer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isCommitted() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void reset() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setLocale(Locale loc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Locale getLocale() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
