
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by 三七 on 2020/6/27.
 * 1、导入驱动jar包
 * 2、注册驱动
 * 3、获取数据库连接对像
 * 4、定义sql
 * 5、获取执行sql语句的对象Statement
 * 6、执行sql,接受返回结果
 * 7、处理结果
 * 8、释放资源
 */
public class Jdbc01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
        //定义sql语句
        String sql = "insert into user (username, password) VALUES('san',123);";
        //获取sql执行对象Statement
        Statement stmt = conn.createStatement();
        //执行sql
        int count  =stmt.executeUpdate(sql);
        //处理结果
        System.out.println(count);
        //释放资源
        stmt.close();
        conn.close();
    }
}
