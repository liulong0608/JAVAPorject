package cn.com.scitc.model;

public class Student {
//    定义成员变量
    String stuid,stuName,stuSex,stuBirthday,stuPhoneNum,dept;

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(String stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    public String getStuPhoneNum() {
        return stuPhoneNum;
    }

    public void setStuPhoneNum(String stuPhoneNum) {
        this.stuPhoneNum = stuPhoneNum;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
//    构造方法

    public Student(String stuid, String stuName, String stuSex, String stuBirthday, String stuPhoneNum, String dept) {
        this.stuid = stuid;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuBirthday = stuBirthday;
        this.stuPhoneNum = stuPhoneNum;
        this.dept = dept;
    }
    public Student(){

    }
}
