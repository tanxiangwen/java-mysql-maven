package Teacher; /**
 * 更新教师密码
 */

import Teacher.MainViews;
import res.TeaGetDTO;

import javax.swing.*;
import java.awt.*;

//修改教师密码
public class UpdaeTeacherpsw extends JDialog {
    JPanel jPanel=new JPanel();
    JLabel jLabel=new JLabel("职工号");
    JTextField jTextField=new JTextField();
    JLabel jLabelpsw=new JLabel("密码");
    JPasswordField jPasswordField=new JPasswordField();
    JLabel jLabel2=new JLabel("新密码");
    JPasswordField jPasswordField2=new JPasswordField();
    JButton jButton=new JButton("提交");
    public UpdaeTeacherpsw(){
    }
    UpdateTeacherpswHander updateTeacherpswHander=new UpdateTeacherpswHander(this);
    public UpdaeTeacherpsw(MainViews mainViews){
        super(mainViews,true);
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
        jButton.addActionListener(updateTeacherpswHander);
        jPanel.add(jButton);
        Container con=getContentPane();
        con.add(jPanel);
        setTitle("修改密码");
        setSize(350,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//只销毁当前窗体

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
    public TeaGetDTO getifm(){
        TeaGetDTO teaGetDTO=new TeaGetDTO();
        teaGetDTO.setSno(jTextField.getText());
        teaGetDTO .setPassword(new String(jPasswordField.getPassword()));
        teaGetDTO.setPassword2(new String(jPasswordField2.getPassword()));
        return  teaGetDTO;
    }
}

