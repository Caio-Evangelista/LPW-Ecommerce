
package bin;

import java.util.ArrayList;

/**
 * @author Caio Felipe
 */
public class Produtos {

   private String descricao;
   private float preco;
   private int qtdEstoque;

   public static ArrayList<Produtos> produtos = new ArrayList();

   void Produtos(){}
   void Produtos(String descricao){
      this.setDescricao(descricao);
   }
   void Produtos(String descricao, float preco){
      this.setDescricao(descricao);
      this.setPreco(preco);
   }

   int getQtdEstoque(){
      return qtdEstoque;
   }

   void vender(int qtd){
      this.qtdEstoque -= qtd;
   }

   void addEstoque(int qtd){
      this.qtdEstoque += qtd;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public float getPreco() {
      return preco;
   }

   public void setPreco(float preco) {
      this.preco = preco;
   }





}
