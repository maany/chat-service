/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Project Java.1.src.com.chat.connection;

/**
 *
 * @author Euphern_Java
 */
import java.applet.Applet;
import java.awt.Graphics;
/* *  * Applet can either run by browser or appletviewer application.  * Define <applet> tag within comments as given below to speed up  * the testing. */ /*<applet code="HelloWorldApplet" width=100 height=100></applet>*/ //every applet must extend from java.applet.Applet classpublic
class HelloWorldApplet extends Applet
{
    /*	 * Override paint method.
     * paint method is called every time the applet needs to redisplay
     * it's output. For example, when applet is first displayed or applet
     * window is minimized and then restored.	 *
     */
     public void init() {
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g){
    /*		 * Use
     * void drawString(String str, int x, int y)
     * method to print the string at specified location x and y.
     */
        g.drawString("Hello World", 50, 50);
    }
}
