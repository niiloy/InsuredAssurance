package com.kamrul.app;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet 
{
@Override
  public void service( HttpServletRequest req, HttpServletResponse res ) throws IOException {
    PrintWriter out = res.getWriter();
    out.println( "Hello, Welcome to Insured Assurance Company!" );
    out.close();
  }
}
