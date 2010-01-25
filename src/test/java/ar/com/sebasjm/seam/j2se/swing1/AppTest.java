package ar.com.sebasjm.seam.j2se.swing1;

import ar.com.sebasjm.seam.j2se.jit_faces.servlet.ServletResponseImpl;
import ar.com.sebasjm.seam.j2se.jit_faces.servlet.ServletRequestImpl;
import ar.com.sebasjm.seam.j2se.jit_faces.jsf.SunFacesServlet;
import ar.com.sebasjm.seam.j2se.jit_faces.config.ServletConfigImpl;
import com.sun.faces.config.ConfigureListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testApp() throws ServletException, IOException {
        Logger.global.setLevel(Level.ALL);

        ConfigureListener cl = new ConfigureListener();

        ServletConfig scfg = new ServletConfigImpl();

        cl.contextInitialized(new ServletContextEvent(scfg.getServletContext()));

        ServletRequest srq = new ServletRequestImpl();

        ServletResponse srp = new ServletResponseImpl();


        Servlet fs = new SunFacesServlet();

        fs.init(scfg);

        fs.service(srq, srp);

        fs.destroy();

        srp.getWriter().close();

    }
}
