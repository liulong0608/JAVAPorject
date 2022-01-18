package cn.com.scitc.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlHlper {
//    定义字符串
    String driver="com.mysql.cj.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=GMT%2B8";
    String user="root";
    String pwd="root";
    Connection c=null;


    public Connection get(){
//        1、加载驱动程序
        try {
            Class.forName(driver);
//            2、建立链接
            c=DriverManager.getConnection(url,user,pwd);
            System.out.println("建立成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("建立失败");
        }
        return c;
    }
}
