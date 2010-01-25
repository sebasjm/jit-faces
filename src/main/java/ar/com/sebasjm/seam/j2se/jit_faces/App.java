package ar.com.sebasjm.seam.j2se.jit_faces;

import ar.com.sebasjm.seam.j2se.jit_faces.form.NewJFrame;
import java.io.IOException;
import javax.servlet.ServletException;

/**
 * Hello world!
 *
 */

public class App {
    public static void main( String[] args ) throws ServletException, IOException {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });

    }

}
