package poo.composicao.onetomany;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    String cliente;
    List<Item> itens = new ArrayList<>();

    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    void adicionarItem(Item item) {
        itens.add(item);
        item.compra = this;
    }

    double obterValorTotal() {
        return itens.stream().mapToDouble(i -> i.quantidade * i.preco).sum();
    }
}
