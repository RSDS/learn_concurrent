package java_core.callback;


import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/17 11:10
 * ModifiedBy:
 * ModifiedTime:
 */
public class TestCallback {

    public static void main(String[] args) {
        ActionListener actionListener = new TimePrinter();
        Timer t = new Timer(2000, actionListener);
        t.start();


        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);

    }


}
