package poo.composicao.desafio;

import java.util.List;
import java.util.stream.Collectors;

public class Cliente {

    String nome;
    List<Compra> compras;

    Cliente(List<Compra> compras) {
        this.compras = compras;
    }

    double obterValorTotal() {
        List<Item> itens = this.compras.stream().flatMap(i -> i.itens.stream()).collect(Collectors.toList());
        return itens.stream().mapToDouble(item -> item.quantidade * item.produto.preco).sum();
    }
}
