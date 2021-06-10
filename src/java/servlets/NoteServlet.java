package servlets;

import domain.Note;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // access note.txt
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to read files
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        // read the two lines from note.txt
        String title = br.readLine();
        String contents = br.readLine();
        br.close();
         
        Note note = new Note(title, contents);
        // set the attributes for the JSP
        request.setAttribute("note", note);
        
        String edit = request.getParameter("edit");
        if (edit != null) {
            // this will display editnote.jsp when edit button is clicked
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        } else {
            // this will display viewnote.jsp otherwise
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // access note.txt
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to write to a file
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));

        // capture the parameters from the form
        String title = request.getParameter("title");
        String contents = request.getParameter("contents");

        pw.write(title + "\n");
        pw.write(contents + "\n");
        pw.close();
        
        Note note = new Note(title, contents);
        // set the attribute for the JSP
        request.setAttribute("note", note);
       
        // this will display viewnote.jsp after saving the form from edit mode
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }
}
