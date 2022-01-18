package cn.com.scitc.dao;

import cn.com.scitc.model.Student;

import java.util.List;

public class TestDao {
    public static void main(String[] args) {
//        StudentDao dao=new StudentDao();
//
//        List<Student> all = dao.findALL();
//        for (Student stu : all  ){
//            System.out.println(stu.getStuId()+"\t"+stu.getStuName()+"\t"+stu.getStuSex());
//        }

//        Student s=new Student();
//        s.setStuId("20301161");
//        s.setStuName("刘龙");
//        s.setStuSex("男");
//        s.setStuBirthday("2000-6-8");
//        s.setStuPhoneNum("19198756208");
//        s.setDept("软件学院");
//        int i

        /********************************************************************************************************/
        StudentDao dao = new StudentDao();

//        删除学生
//        int i = dao.delStu("206011");
//        System.out.println(i);
//
//
////        查看学生
//        List<Student> all = dao.findALL();
//        for (Student stu : all) {
//            System.out.println(stu.getStuId() + "\t" +stu.getStuName() + "\t" + stu.getStuSex()+"\t"+stu.getStuBirthday()+"\t"+stu.getStuPhoneNum()+"\t"+stu.getDept());
//
//        }
//        添加学生
        Student s = new Student();
        s.setStuid("20308845");
        s.setStuName("李小鹿");
        s.setStuSex("女");
        s.setStuBirthday("2000-03-13");
        s.setStuPhoneNum("17798566198");
        s.setDept("软件学院");
//        int i = dao.insertStu(s);
        final int i = dao.updateStu(s);
        System.out.println(i);
    }
}
