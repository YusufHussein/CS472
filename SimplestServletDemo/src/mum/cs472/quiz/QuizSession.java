package mum.cs472.quiz;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class QuizSession extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.isNew()) {
            session.setAttribute("quiz", new Quiz());
        } else {
            int answer = Integer.parseInt(request.getParameter("answer"));
            Quiz r = new Quiz();
            Quiz q = (Quiz) session.getAttribute("quiz");
            r.score = q.getScore();
            r.qNumber = q.getQNumber();
            r.ourLogic(answer);
            session.setAttribute("quiz", r);
        }
        response.sendRedirect("session");
    }
}
