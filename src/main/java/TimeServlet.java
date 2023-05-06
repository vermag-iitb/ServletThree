import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;


//@WebServlet("/time")
public class TimeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    public TimeServlet() 
    {
        super();
    }

	@SuppressWarnings("deprecation")
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		try
        {
            Date d = new Date();
			PrintWriter pw = response.getWriter();
            pw.println("<html><body bgcolor=green text=yellow><h1>");
            pw.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
            pw.println("</h1></body></html>");
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
	}

}
