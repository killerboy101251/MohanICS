package com.assignment.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductClass
 */
@WebServlet("/ProductClass")
public class ProductClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductClass() {
        super();
        // TODO Auto-generated consutrctor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		String product=request.getParameter("product");
		String productDesc=request.getParameter("productDesc");
		out.println(userName);
		out.println(password);
		
		 Connection conn = null;
		 String un="root";
        String pass="Mohanreddy123@";
        String s = "jdbc:mysql://localhost:3306/mohan";
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


        try {
			conn=DriverManager.getConnection(s,un,pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
       if(conn!=null)
       {
        out.println("<h1>"+"connection success"+"<h1>");
       }
       
       PreparedStatement st=null;
       
       
       
       		if(request.getParameter("username")!=null)
       		{
			try {
				st = conn.prepareStatement("insert into mohan values(?,?)");
				st.setString(1, product);
				st.setString(2, productDesc);
				st.executeUpdate();
				out.println("updated successfully");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       		}
       		
       		
       		
       		
       		
       		
       		else if(request.getParameter("delete")!=null)
       		{
       			
       			try {
       				String value=request.getParameter("delete");
       				st = conn.prepareStatement("DELETE FROM mohan where id= value ");
					st.executeUpdate();
					out.println("successfully deleted");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
       		}
       		
       		
       		
       	
       		
       		 

       		

       	
       		

       		
       		
       			String name="Select * from mohan";
       			PreparedStatement pstmt;																				
				try {
					
				
					pstmt = conn.prepareStatement(name);
					ResultSet res = pstmt.executeQuery();
					
					out.println("<table border='1'> ");
					out.println("<tr> <th>");

		       		out.println("prodName </th>");

		       		out.println("<th> proddesc </th>");

		       		out.println("<th> Price </th>");

	       			while(res.next())
	       			{
	       				out.println("<tr><td>" +res.getString("id") +"</td>");

	       	       		out.println("<td>" +res.getString("productDesc") +"</td> </tr>");

	       	       		

	       			}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
       			
       			
       			
       		}
       
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
