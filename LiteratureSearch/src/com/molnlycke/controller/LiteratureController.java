package com.molnlycke.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.molnlycke.literatureDAO.Literature;
import com.molnlycke.literatureDAO.LiteratureDAO;
import com.molnlycke.literatureDAO.LiteratureDAOImpl;

@WebServlet("/home")
public class LiteratureController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LiteratureDAO literature = new LiteratureDAOImpl();
		List<Literature> all = literature.getAllLiterature();
		Iterator<Literature> it = all.iterator();
		while(it.hasNext()){
			Literature item = it.next();
			resp.getWriter().write(item.getName());
		}
	}
}
