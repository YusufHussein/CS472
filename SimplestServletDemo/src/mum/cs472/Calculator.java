package mum.cs472;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculator extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<html><head><title>Calculator</title></head><body>");
        String aFNumber = request.getParameter("aFNumber");
        String aSNumber = request.getParameter("aSNumber");
        String mFNumber = request.getParameter("mFNumber");
        String mSNumber = request.getParameter("mSNumber");
        if (aFNumber != null && aSNumber != null) {
            out.print("<p>" + aFNumber + " + " + aSNumber + " = " + (Integer.parseInt(aFNumber) + Integer.parseInt(aSNumber)) + "</p>");
        }
        if (mFNumber != null && mSNumber != null) {
            out.print("<p>" + mFNumber + " + " + mSNumber + " = " + (Integer.parseInt(mFNumber) + Integer.parseInt(mSNumber)) + "</p>");
        }
        out.print("</body></html>");
    }
}
