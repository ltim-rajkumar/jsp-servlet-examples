package com.rajkumar.practice.jsp.controller;

import com.rajkumar.practice.jsp.service.HelloService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class HelloController extends HttpServlet {

    private static final HelloService helloService = new HelloService();

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("-------------- Inside the service() method ---------------");
        if(request.getMethod().equals("POST")) {
            this.doPost(request, response);
        } else if(request.getMethod().equals("GET")) {
            this.doGet(request, response);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("-------------- Inside the doGet() method ---------------");

        String name = request.getParameter("name");

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>"+ helloService.greet(name) +"</h1>");
        writer.println("</body></html>");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("-------------- Inside the doGet() method ---------------");

        String name = request.getParameter("name");

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>"+ helloService.greet(name) +"</h1>");
        writer.println("</body></html>");
    }

    public void destroy(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("-------------- Inside the destroy() method ---------------");
    }



}
