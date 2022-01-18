package cn.com.scitc.dao;

import cn.com.scitc.conn.MysqlHlper;
import cn.com.scitc.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    //    获取数据库连接对象
    Connection conn = null;

    //    构造方法
    public StudentDao() {
        MysqlHlper s = new MysqlHlper();
        conn = s.get();
    }

    //    查询所有学生
//    public void findALL() {
    public List<Student> findALL(){
        List<Student> lis= new ArrayList<>();
        String sql = "select * from student";
        try {
            Statement st = conn.createStatement();
//            执行sql语句
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
//                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
                Student s=new Student();
                s.setStuid(rs.getString(1));
                s.setStuName(rs.getString(2));
                s.setStuSex(rs.getString(3));
                s.setStuBirthday(rs.getString(4));
                s.setStuPhoneNum(rs.getString(5));
                s.setDept(rs.getString(6));
                lis.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lis;
    }
    //    按学号查询学生
    public Student findById(String stuid){
        Student s=null;
        String sql = "select * from student where stuid='"+stuid+"'";
        try {
            Statement st = conn.createStatement();
//            执行sql语句
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
//                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
                s=new Student();
                s.setStuid(rs.getString(1));
                s.setStuName(rs.getString(2));
                s.setStuSex(rs.getString(3));
                s.setStuBirthday(rs.getString(4));
                s.setStuPhoneNum(rs.getString(5));
                s.setDept(rs.getString(6));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }

    //    添加学生
    public int insertStu(Student s){
        int i=0;
        String sql="insert into student values(?,?,?,?,?,?)";
        try {
            PreparedStatement pst=conn.prepareStatement(sql);
//            赋值
            pst.setString(1,s.getStuid());
            pst.setString(2,s.getStuName());
            pst.setString(3,s.getStuSex());
            pst.setString(4,s.getStuBirthday());
            pst.setString(5,s.getStuPhoneNum());
            pst.setString(6, s.getDept());
//            执行sql
            i = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;

    }
//      按学号删除学生
    public int delStu(String stuid) {
        int i=0;
        String sql="delete from student where stuid='"+stuid+"'";
//        Statement st=null;
        try {
            Statement st= conn.createStatement();
//            执行sql语句
            i = st.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

//    按姓名删除学生

//    修改学生
    public int updateStu(Student s){
        int i=0;
        String sql="update student set stuName=?,stuSex=?,stuBirthday=?,stuPhoneNum=?,dept=? where stuid=?";
        try {
            PreparedStatement pst= conn.prepareStatement(sql);
            pst.setString(1,s.getStuName());
            pst.setString(2,s.getStuSex());
            pst.setString(3,s.getStuBirthday());
            pst.setString(4, s.getStuPhoneNum());
            pst.setString(5,s.getDept());
            pst.setString(6,s.getStuid());
            i = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
     }

}