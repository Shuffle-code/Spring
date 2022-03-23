package servlet;
import model.Player;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PlayerServlet", urlPatterns = "/player")
public class PlayerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("player", createPlayer());
        getServletContext().getRequestDispatcher("/player.jsp")
                .forward(req, resp);
    }

    private List<Player> createPlayer() {
        List<Player> players = List.of(
            new Player(1, "Петров В.А.", 540),
            new Player(2, "Малюгин Е.В.", 530),
            new Player(3, "Аникин Р.А.", 690),
            new Player(4, "Андронов А.А.", 580),
            new Player(5, "Потапов В.А.", 566),
            new Player(6, "Потапов М.А.", 512),
            new Player(7, "Голущенко Р.А.", 640),
            new Player(8, "Игонин П.А.", 555),
            new Player(9, "Кирющов Г.А.", 355),
            new Player(10, "Рымар С.А.", 460));
        return players;
    }
}
