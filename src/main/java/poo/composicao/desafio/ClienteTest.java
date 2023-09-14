package poo.composicao.desafio;

import java.util.Arrays;

public class ClienteTest {

    public static void main(String[] args) {
        Produto lapis = new Produto();
        lapis.nome = "Lapis";
        lapis.preco = 1.00;

        Produto borracha = new Produto();
        borracha.nome = "Borracha";
        borracha.preco = 1.50;

        Produto caneta = new Produto();
        caneta.nome = "Caneta";
        caneta.preco = 2.50;

        Produto regua = new Produto();
        regua.nome = "Regua";
        regua.preco = 2.00;

        Item item1 = new Item(lapis);
        item1.quantidade = 2;

        Item item2 = new Item(borracha);
        item2.quantidade = 1;

        Item item3 = new Item(caneta);
        item3.quantidade = 2;

        Item item4 = new Item(regua);
        item4.quantidade = 1;

        Compra compra1 = new Compra(Arrays.asList(item1, item2));

        Compra compra2 = new Compra(Arrays.asList(item3, item4));

        Cliente cliente = new Cliente(Arrays.asList(compra1, compra2));
        cliente.nome = "David";
        System.out.println(cliente.obterValorTotal());
    }
}
