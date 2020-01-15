package com.naver;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertUICommand implements Command {

	@Override
	public void execute(HttpServletRequest request, 
			HttpServletResponse response) 
			throws IOException, ServletException {
		RequestDispatcher dis = request.getRequestDispatcher("insert.jsp");
		dis.forward(request, response);
		
		
	}

	

}
