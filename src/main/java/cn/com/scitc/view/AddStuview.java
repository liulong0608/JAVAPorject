package cn.com.scitc.view;

import cn.com.scitc.dao.StudentDao;
import cn.com.scitc.model.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStuview extends JInternalFrame implements ActionListener{
//    定义变量
    JLabel labStuid,labStuname,labStusex,labStubirthday,labStuphonenum,labDept;
    JTextField txtStuid,txtStuname,txtStusex,txtStubirthday,txtStuphonenum,txtDept;
    JButton btnDk,btnCancle;

    public AddStuview(){
        labStuid = new JLabel("学号");
        labStuname = new JLabel("姓名");
        labStusex = new JLabel("性别");
        labStubirthday = new JLabel("出生日期");
        labStuphonenum = new JLabel("电话号码");
        labDept = new JLabel("系部");
        txtStuid = new JTextField(10);
        txtStuname = new JTextField(10);
        txtStusex = new JTextField(10);
        txtStubirthday = new JTextField(8);
        txtStuphonenum = new JTextField(8);
        txtDept = new JTextField(10);

        btnDk = new JButton("确定");
        btnCancle = new JButton("取消");
        this.setTitle("添加学生");
//        流布局
        this.setLayout(new FlowLayout());
        this.add(labStuid);
        this.add(txtStuid);
        this.add(labStuname);
        this.add(txtStuname);
        this.add(labStusex);
        this.add(txtStusex);
        this.add(labStubirthday);
        this.add(txtStubirthday);
        this.add(labStuphonenum);
        this.add(txtStuphonenum);
        this.add(labDept);
        this.add(txtDept);

        this.add(btnDk);
        this.add(btnCancle);

//        可见，大小
        this.setVisible(true);
        this.setSize(180,220);
        this.setClosable(true);
//        监听
        btnDk.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnDk)){
//           新建学生对象
            Student s = new Student();
            s.setStuid(txtStuid.getText());
            s.setStuName(txtStuname.getText());
            s.setStuSex(txtStusex.getText());
            s.setStuBirthday(txtStubirthday.getText());
            s.setStuPhoneNum(txtStuphonenum.getText());
            s.setDept(txtDept.getText());
            StudentDao dao = new StudentDao();
            int i = dao.insertStu(s);
            if (i>0){
                JOptionPane.showMessageDialog(this,"添加成功！");
            }else {
                JOptionPane.showMessageDialog(this,"添加失败！");
            }
        }
    }
}
