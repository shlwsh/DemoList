
package Demo;



        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.PrintWriter;
        import java.io.Reader;
        import java.math.BigDecimal;
        import java.net.URL;
        import java.sql.*;
        import java.util.Calendar;
        import java.util.Map;

        import Demo.util.common;


/**
 * Created by smq on 16/8/12.
 */
@WebServlet(name = "DemoServlet",urlPatterns = "/Web003")
public class DemoServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            String first_name,second_name,code;
            first_name = request.getParameter("first_name");
            second_name =request.getParameter("second_name");


            Demo.mysql.mysqlDao db = new Demo.mysql.mysqlDao();
            db.connSQL();

            db.InsertNameList(first_name,second_name);
            request.getRequestDispatcher("namelist.jsp").forward(request,response);

        }catch (Exception err){
            out.println("Db err");
            out.println(err.getMessage());

        }
        finally {

            out.close();
        }
    }
//    @Override
    public void doPost1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            System.out.println(common.GetCurrentDateTime());

            String first_name,second_name,code;
            first_name = request.getParameter("first_name");
            second_name =request.getParameter("second_name");



            out.println("<html>");
            out.println("<head>");
            out.println("<title>DoPost</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("<h1>Insert mysql Data:"+common.GetCurrentDateTime()+"</h1>");

            Demo.mysql.mysqlDao db = new Demo.mysql.mysqlDao();
            db.connSQL();

            db.InsertNameList(first_name,second_name);
            out.println("namelist:select * from namelist<br>");
            out.println("<hr>");
            ResultSet res = db.selectSQL("select * from namelist order by code");
//            res = psql.executeQuery();          //执行预处理sql语句


            while(res.next()){
                code = res.getString("code");
                first_name = res.getString("first_name");
                second_name = res.getString("second_name");
                //ju_userName = new String(ju_userName.getBytes("ISO-8859-1"),"gb2312");
                System.out.println(first_name + "\t" + second_name);
                out.println("code:"+code+";first_name:"+first_name+";second_name"+second_name+"<br>");
            }
            System.out.println("执行增加、修改、删除后的数据");
//            out.println("<h2>DoPostat " + request.getContextPath() + "</h2>");
//            System.out.println(request.getParameter("first_name"));
//
//            System.out.println(request.getParameter("second_name"));
//            out.println("first_name:"+request.getParameter("first_name"));
//            out.println("<br>");
//            out.println("second_name:"+request.getParameter("second_name")+"<br>");

            out.println("</body>");
            out.println("</html>");
        }catch (Exception err){
            out.println("Db err");
            out.println(err.getMessage());

        }
        finally {

            out.close();
        }
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            System.out.println(common.GetCurrentDateTime());
//            System.out.println("-------------Str tip infor001----------------");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>MyFirstServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>"+common.GetCurrentDateTime()+"</h1>");
            out.println("<h2>Servlet MyFirstServlet at " + request.getContextPath() + "</h2>");
            System.out.println(request.getParameter("first_name"));

            System.out.println(request.getParameter("second_name"));
            out.println("first_name:"+request.getParameter("first_name"));
            out.println("<br>");
            out.println("second_name:"+request.getParameter("second_name")+"<br>");

            try {
                String strList = "";

//                out.println(" testInsert ");


                // Write some content
                out.println(" testQuery ");
                out.println(strList);


            }catch (Exception err){
                out.println(err.getMessage());
                System.out.println(err.getMessage());
            }
            out.println(" end ");



            out.println("</body>");
            out.println("</html>");
        }catch (Exception err){
            out.println("Db err");
            out.println(err.getMessage());
        }
        finally {

            out.close();
        }
    }
}
