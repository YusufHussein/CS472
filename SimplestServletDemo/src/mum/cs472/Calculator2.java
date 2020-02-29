package mum.cs472;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculator2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String aFNumber = request.getParameter("aFNumber");
        String aSNumber = request.getParameter("aSNumber");
        String mFNumber = request.getParameter("mFNumber");
        String mSNumber = request.getParameter("mSNumber");
        String aAns = "";
        String mAns = "";
        if (aFNumber != null && aSNumber != null) {
            aAns = new Integer(Integer.parseInt(aFNumber) + Integer.parseInt(aSNumber)).toString();
        }
        if (mFNumber != null && mSNumber != null) {
            mAns = new Integer(Integer.parseInt(mFNumber) * Integer.parseInt(mSNumber)).toString();
        }
        out.print("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Calculator</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"./calc2\" method=\"get\">\n" +
                "    <div>\n" +
                "        <input type=\"number\" id=\"aFNumber\" name=\"aFNumber\" value=\"" + aFNumber + "\">\n" +
                "         +\n" +
                "        <input type=\"number\" id=\"aSNumber\" name=\"aSNumber\" value=\"" + aSNumber + "\">\n" +
                " = " + aAns + "\n" +
                "        <br>\n" +
                "        <input type=\"number\" id=\"mFNumber\" name=\"mFNumber\" value=\"" + mFNumber + "\">\n" +
                "        *\n" +
                "        <input type=\"number\" id=\"mSNumber\" name=\"mSNumber\" value=\"" + mSNumber + "\">\n" +

                " = " + mAns + "\n" +
                "<br>" +
                "        <input type=\"submit\"  value=\"Submit\">\n" +
                "\n" +
                "    </div>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");

        out.print("</body></html>");
    }
}
