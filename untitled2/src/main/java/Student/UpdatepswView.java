package Student; /**
 * 修改学生密码
 */


import Student.StudentMain;
import res.StugetDTO;

import javax.swing.*;
import java.awt.*;

public class UpdatepswView extends JDialog {
    JPanel jPanel=new JPanel();
    JLabel jLabel=new JLabel("学号");
    JTextField jTextField=new JTextField();
    JLabel jLabelpsw=new JLabel("密码");
    JPasswordField jPasswordField=new JPasswordField();
    JLabel jLabel2=new JLabel("新密码");
    JPasswordField jPasswordField2=new JPasswordField();
    JButton jButton=new JButton("提交");
    //Student.StudentLogin studentLogin=new Student.StudentLogin();
   // Stuifo stuifo=new Stuifo();
   // Student.StudentMain studentMain
    public UpdatepswView(){
    }
    StudentMain studentMain;
    UpdatepswViewHander updatepswViewHander=new UpdatepswViewHander(this);
    JFrame jFrame=new JFrame();
    public UpdatepswView(StudentMain studentMain){
        super(studentMain,true);
          jLabel.setPreferredSize(new Dimension(80,20));
          jPanel.add(jLabel);
          jTextField.setPreferredSize(new Dimension(200,30));

          jPanel.add(jTextField);
          jLabelpsw.setPreferredSize(new Dimension(80,20));
          jPanel.add(jLabelpsw);
          jPasswordField.setPreferredSize(new Dimension(200,30));
          jPanel.add(jPasswordField);
          jLabel2.setPreferredSize(new Dimension(80,20));
          jPanel.add(jLabel2);
          jPasswordField2.setPreferredSize(new Dimension(200,30));
          jPanel.add(jPasswordField2);
          jButton.addActionListener(updatepswViewHander);
          jPanel.add(jButton);
        Container con=getContentPane();
        con.add(jPanel);
        setTitle("修改密码");
       setSize(350,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//只销毁当前窗体
        //setDefaultCloseOption(Jframe.Exit_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }

    public JTextField getjTextField() {
        return jTextField;
    }

    public void setjTextField(JTextField jTextField) {
        this.jTextField = jTextField;
    }
    //接收输入的学号密码
    public StugetDTO getifm(){
        StugetDTO stugetDTO=new StugetDTO();
        stugetDTO.setSno(jTextField.getText());
        stugetDTO.setPassword(new String(jPasswordField.getPassword()));
        stugetDTO.setPassword2(new String(jPasswordField2.getPassword()));
        return stugetDTO;
    }
}
