package list.operacoesBasicas.carrinhoDeCompras;

import list.operacoesBasicas.listaDeTarefas.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String descricao) {
        itemList.add(new Item(descricao));
    }

    public void removerItem(String descricao){
        List<Item> ItensParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getDescricao().equalsIgnoreCase(descricao)){
                ItensParaRemover.add(i);
            }
        }
        itemList.removeAll(ItensParaRemover);
    }

    public int obterNumeroTotalItens() {
        return itemList.size();
    }

    public void obterDescricoesItens(){
        System.out.println(itemList.toString());
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println(carrinhoDeCompras.obterNumeroTotalItens());

        carrinhoDeCompras.adicionarItem("test1");
        carrinhoDeCompras.adicionarItem("test2");
        carrinhoDeCompras.adicionarItem("test3");

        System.out.println(carrinhoDeCompras.obterNumeroTotalItens());

        carrinhoDeCompras.obterDescricoesItens();

        carrinhoDeCompras.adicionarItem("test1");

        System.out.println(carrinhoDeCompras.obterNumeroTotalItens());

        carrinhoDeCompras.obterDescricoesItens();

        carrinhoDeCompras.removerItem("test1");

        System.out.println(carrinhoDeCompras.obterNumeroTotalItens());

        carrinhoDeCompras.obterDescricoesItens();
    }
}
