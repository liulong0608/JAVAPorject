package cn.com.scitc.view;

import javax.swing.*;

public class EditStuView extends AddStuview{
    JButton btnFind;
    public EditStuView(){
        this.setTitle("编辑学生");
        btnDk.setText("修改");
        btnFind=new JButton("查询");
        this.add(btnFind);
        this.setSize(180,250);
    }
}
