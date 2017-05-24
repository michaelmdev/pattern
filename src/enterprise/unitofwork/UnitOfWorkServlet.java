package enterprise.unitofwork;// program@globall.ru @ 24.04.2017.

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class UnitOfWorkServlet extends HttpServlet {
    // ...
    final protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            UnitOfWork.newCurrent();
            handleGet (request, response);
            UnitOfWork.getCurrent().commit();
        } finally {
            UnitOfWork.setCurrent(null);
        }
    }

    abstract void handleGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
