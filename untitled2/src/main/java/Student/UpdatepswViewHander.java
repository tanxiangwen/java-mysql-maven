package Student; /**
 * 更新学生密码监听
 */

import Student.StudentLogin;
import Teacher.StudentService;
import Teacher.StudentServiceImpl;
import Student.UpdatepswView;
import res.StugetDTO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdatepswViewHander implements ActionListener {
    UpdatepswView updatepswView;
    public UpdatepswViewHander(UpdatepswView updatepswView){
         this.updatepswView=updatepswView;
      // this.studentMain=studentMain;

    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
      // StugetDTO stugetDTO=new StugetDTO();
        JButton jButton =(JButton) actionEvent.getSource();
        String text=jButton.getText();
        if("提交".equals(text)){
            StudentService studentService=new StudentServiceImpl();
            StugetDTO getifm = updatepswView.getifm();
            boolean checkpsw = studentService.checkpsw(getifm);
            if("".equals(getifm.getSno())||"".equals(getifm.getPassword())){
                JOptionPane.showMessageDialog(updatepswView,"用户名或密码不能为空");
            }
           // Student.StudentMain studentMain = null;
            else if(!checkpsw){
                JOptionPane.showMessageDialog(updatepswView,"学号或密码不正确");

            }

            else {
                boolean checked = studentService.updatenewpsw(getifm);
                if (checked) {
                    JOptionPane.showMessageDialog(updatepswView, "修改成功");
                 // studentMain.disposeswing();
                   updatepswView.dispose();

                      new StudentLogin();
                }
            }

        }

    }
}
