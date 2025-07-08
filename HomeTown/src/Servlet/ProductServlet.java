package Servlet;

import Dto.ProductDto;
import Service.ProductService;
import ServiceImpl.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    public ProductServlet() {
        System.out.println("ProductServlet running in tomcat");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in ProductServlet");
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String incomingprice = req.getParameter("incomingprice");
        String sellingprice = req.getParameter("sellingprice");
        String MRP = req.getParameter("MRP");
        String description = req.getParameter("description");
        String brand = req.getParameter("brand");
        String quality = req.getParameter("quality");
        String color = req.getParameter("color");
        String weight = req.getParameter("weight");
        String manufdate = req.getParameter("manufdate");
        String warranty = req.getParameter("warranty");
        String returnpolicy = req.getParameter("returnpolicy");

        ProductDto productDto = new ProductDto();
        productDto.setName(name);
        productDto.setType(type);
        productDto.setIncomingprice(incomingprice);
        productDto.setSellingprice(sellingprice);
        productDto.setMRP(MRP);
        productDto.setDescription(description);
        productDto.setBrand(brand);
        productDto.setQuality(quality);
        productDto.setColor(color);
        productDto.setWeight(weight);
        productDto.setManufdate(manufdate);
        productDto.setWarranty(warranty);
        productDto.setReturnpolicy(returnpolicy);

        ProductService productService = new ProductServiceImpl();
        boolean saved = productService.save(productDto);

        if (saved) {

            RequestDispatcher  dispatcher= req.getRequestDispatcher("ProductSucess.jsp");
            req.setAttribute("message", "Form is saved");
            req.setAttribute("productDto", productDto);
            dispatcher.forward(req,resp);

        } else {

            RequestDispatcher   dispatcher= req.getRequestDispatcher("Product.jsp");
            req.setAttribute("messageF", "save failed");
            req.setAttribute("productDto", productDto);
            dispatcher.forward(req, resp);

        }

    }
}
