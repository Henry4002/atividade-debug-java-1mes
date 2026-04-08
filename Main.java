package Main;

import Classes.Produto;

public class Main {
   public static void main(String[] args) {
        Produto p1 = new Produto1(1, "Latão BRAHMA", 7.5, 2, 21379);
        System.out.println(p1);

        Produto p2 = new Produto2(2, "biscoito DANIX", 5.50, 10,12314);
        System.out.println(p2);

        Produto p3 = new Produto3(3, "salgado JOELHO", 7.0, 5,232434);
        System.out.println(p3);
        p1.pedido();
        p2.pedido();
        p3.pedido();
    }
}

