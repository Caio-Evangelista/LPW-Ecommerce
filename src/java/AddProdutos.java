
import bin.Produtos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Desenvolvimento
 */
public class AddProdutos extends HttpServlet {

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

      String descricao = request.getParameter("decricao");
      float preco = Float.parseFloat(request.getParameter("preco"));

      Produtos produto = new Produtos();

      produto.setDescricao(descricao);
      produto.setPreco(preco);

      Produtos.produtos.add(produto);



   }

}
