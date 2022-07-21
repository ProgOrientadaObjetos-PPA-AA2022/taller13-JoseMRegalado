/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
import java.util.ArrayList;
import p2.Estudiante;
import p3.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
        */
        
        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        
        
        ArrayList<Correo> lista = new ArrayList<>();

        DominioGmail d1 = new DominioGmail();
        d1.establecerDominio(".gmail.com");
        
        GeneradorCorreos gc = new GeneradorCorreos();
        gc.establecerDominio(d1);
        gc.establecerCorreo(e.obtenerUserName());
        
        
        Correo c = new Correo();
        c.establecerDominio(d1);
        c.establecerUserName(e.obtenerUserName());
        c.establecerCorreo();
        
        lista.add(c);
        
        DominioGobierno d2 = new DominioGobierno();
        d2.establecerDominio(".gobiernoec.gob");
        
        GeneradorCorreos gc2 = new GeneradorCorreos();
        gc2.establecerDominio(d2);
        gc2.establecerCorreo(e.obtenerUserName());
        
        
        Correo c2 = new Correo();
        c2.establecerDominio(d2);
        c2.establecerUserName(e.obtenerUserName());
        c2.establecerCorreo();
        
        lista.add(c2);
        
        DominioOutlook d3 = new DominioOutlook();
        d3.establecerDominio(".outlook.com");
        
        GeneradorCorreos gc3 = new GeneradorCorreos();
        gc3.establecerDominio(d3);
        gc3.establecerCorreo(e.obtenerUserName());
        
        
        Correo c3 = new Correo();
        c3.establecerDominio(d3);
        c3.establecerUserName(e.obtenerUserName());
        c3.establecerCorreo();
        
        lista.add(c3);
        
        DominioUTPL d4 = new DominioUTPL();
        d4.establecerDominio(".utpl.edu.ec");
        
        GeneradorCorreos gc4 = new GeneradorCorreos();
        gc4.establecerDominio(d4);
        gc4.establecerCorreo(e.obtenerUserName());
        
        
        Correo c4 = new Correo();
        c4.establecerDominio(d4);
        c4.establecerUserName(e.obtenerUserName());
        c4.establecerCorreo();
        
        lista.add(c4);
        
        DominioYahoo d5 = new DominioYahoo();
        d5.establecerDominio("yahoo.com");
        
        GeneradorCorreos gc5 = new GeneradorCorreos();
        gc5.establecerDominio(d5);
        gc5.establecerCorreo(e.obtenerUserName());
        
        
        Correo c5 = new Correo();
        c5.establecerDominio(d5);
        c5.establecerUserName(e.obtenerUserName());
        c5.establecerCorreo();
        
        lista.add(c5);
        
        e.establecerCorreos(lista);

        System.out.printf("%s\n", e);

        
        
    }
    
}
