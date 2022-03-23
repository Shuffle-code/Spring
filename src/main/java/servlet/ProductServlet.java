package servlet;

import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("product", createProduct());
        getServletContext().getRequestDispatcher("/product.jsp")
                .forward(req, resp);
    }

    public ArrayList<Product> createProduct() {
        ArrayList<Product> productsList = new ArrayList<>();

        productsList.add(new Product(1, "apple", 52));
        productsList.add(new Product(2, "tomato", 13));
        productsList.add(new Product(3, "potatoes", 30));
        productsList.add(new Product(4, "orange", 12));
        productsList.add(new Product(5, "mandarin", 44));
        productsList.add(new Product(6, "beet", 35));
        productsList.add(new Product(7, "pineapple", 76));
        productsList.add(new Product(8, "leek", 87));
        productsList.add(new Product(9, "cucumber", 10));
        productsList.add(new Product(10, "plum", 20));

        return productsList;
    }

}
