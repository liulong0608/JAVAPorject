package cn.com.scitc.view;

import cn.com.scitc.model.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentWin implements ActionListener {
//    定义控件
    JFrame f;
    JMenu mSys,mStu,mCou,mSco;
    JMenuItem iAddStu,iEditStu,iFindStu,iDelStu;
    public StudentWin(){
//        实例化控件
        f=new JFrame();
        f.setTitle("学生信息管理系统");
//        实例化菜单
        mSys=new JMenu("系统管理");
        mStu=new JMenu("学生管理");
        mCou=new JMenu("课程管理");
        mSco=new JMenu("成绩管理");

//        实例化菜单项
        iAddStu=new JMenuItem("添加学生");
        iEditStu=new JMenuItem("编辑学生");

        mStu.add(iAddStu);
        mStu.add(iEditStu);
        JMenuBar bar=new JMenuBar();
        bar.add(mSys);
        bar.add(mStu);
        bar.add(mCou);
        bar.add(mSco);
//        f.add(bar,"North");
        f.setJMenuBar(bar);
//        可见
        f.setVisible(true);
        f.setSize(800,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        添加监听
        iAddStu.addActionListener(this);
        iEditStu.addActionListener(this);

    }

    public static void main(String[] args) {
        StudentWin stuwin=new StudentWin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        事件代码
        if (e.getSource().equals(iAddStu)){
//            桌面面板
            JDesktopPane pane=new JDesktopPane();
            pane.add(new AddStuview());
            f.setContentPane(pane);
        }
//        编辑学生
        if (e.getSource().equals(iEditStu)){
//            桌面面板
            JDesktopPane pane=new JDesktopPane();
            pane.add(new EditStuView());
            f.setContentPane(pane);
        }
    }
}
