package org.model2.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(".ax")
public class AjaxController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
		req.setCharacterEncoding("UTF-8");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		req.setCharacterEncoding("UTF-8");
		String path=req.getContextPath();
		String uri=req.getRequestURI();
		String userURI=uri.substring(path.length());
		String forwardURI="";
		
		if(userURI.equals("/ajaxOverlapCheck.ax")) {
			System.out.println(userURI);
			forwardURI="AjaxPage/ajaxCheck.jsp";
		}
		
		RequestDispatcher dispatch= req.getRequestDispatcher(forwardURI);
		dispatch.forward(req, resp);
		
	}
	
}
