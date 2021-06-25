package Main; /**
 * 主界面监听
 */


import Main.AllView;
import Student.StudentLogin;
import Teacher.Loginview;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AllViewListen implements ActionListener {
    AllView allView;

    public AllViewListen(AllView allView){
        this.allView=allView;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton jButton=(JButton)actionEvent.getSource();
        String text=jButton.getText();
        if("学生端".equals(text)){
            JOptionPane.showMessageDialog(allView, "欢迎进入");
            allView.disposwswing();
            new StudentLogin();


        }else if("教师端".equals(text)) {

            JOptionPane.showMessageDialog(allView, "欢迎进入");
            allView.disposwswing();
            new Loginview();


        }

    }


}


