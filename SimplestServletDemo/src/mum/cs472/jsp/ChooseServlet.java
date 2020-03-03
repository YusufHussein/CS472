package mum.cs472.jsp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ChooseServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("radioJSPCool", true);
        request.setAttribute("JSFwayCool", true);
        request.setAttribute("moonCheese", true);
        RequestDispatcher dispatch = request.getRequestDispatcher("choose.jsp");
        dispatch.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String choice = request.getParameter("radioJSPCool");
        String choiceJSPCool = request.getParameter("JSFwayCool");
        String choiceJSPMoon = request.getParameter("moonCheese");
        if (choice != null) {
            if (choice.equals("1")) {
                request.setAttribute("radioJSPCool", "checked");
            } else {
                request.setAttribute("NotradioJSPCool", "checked");
            }
            System.out.println("choice= " + choice);
        } else
            System.out.println("No choice made");

        if (choiceJSPCool != null) {
            if (choiceJSPCool.equals("1")) {
                request.setAttribute("JSFwayCool", "checked");
            } else {
                request.setAttribute("NotJSFwayCool", "checked");
            }
            System.out.println("choice JSF way Cool= " + choiceJSPCool);
        } else
            System.out.println("No choice made");

        if (choiceJSPMoon != null) {
            if (choiceJSPMoon.equals("1")) {
                request.setAttribute("moonCheese", "checked");
            } else {
                request.setAttribute("NotMoonCheese", "checked");
            }
            System.out.println("choice moon= " + choiceJSPMoon);
        } else
            System.out.println("No choice made");

        RequestDispatcher dispatch = request.getRequestDispatcher("choose.jsp");
        dispatch.forward(request, response);
    }
}

