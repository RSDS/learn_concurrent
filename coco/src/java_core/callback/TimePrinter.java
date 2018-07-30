package java_core.callback;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Description:
 * Author:             徐少斌
 * CreateTime:	       2018/7/17 11:08
 * ModifiedBy:
 * ModifiedTime:
 */
public class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent){
        System.out.println("the time is "+new Date());
        Toolkit.getDefaultToolkit().beep();
    }





}
