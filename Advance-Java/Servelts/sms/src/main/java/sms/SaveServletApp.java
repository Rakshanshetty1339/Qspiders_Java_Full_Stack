package sms;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class SaveServletApp extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException{
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phone=req.getParameter("phoneno");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		
		
		
		
	
	}
	

}
