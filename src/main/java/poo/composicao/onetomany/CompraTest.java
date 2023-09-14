package poo.composicao.onetomany;

public class CompraTest {

    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "David";

        c1.adicionarItem("Caneta", 20, 7.45);
        c1.adicionarItem(new Item("Borracha", 12, 3.89));
        c1.adicionarItem(new Item("Caderno", 3, 18.79));

        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());

        //so para testar relação bidirecional
        System.out.println(c1.itens.get(0).compra.itens.get(1).compra.obterValorTotal());
    }
}
