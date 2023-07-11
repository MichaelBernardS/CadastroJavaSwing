package controle;

import java.io.Serializable;
import java.util.Objects;

public class ItemPedido implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer qtde;
    private Double precoVenda;

    private Pedido pedido;
    private Item item;

    public ItemPedido() {
    }

    public ItemPedido(Integer id, Integer qtde, Double precoVenda, Pedido pedido, Item item) {
        this.id = id;
        this.qtde = qtde;
        this.precoVenda = precoVenda;
        this.pedido = pedido;
        this.item = item;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Double subTotal() {
        return precoVenda * qtde;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, item, precoVenda, qtde);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemPedido other = (ItemPedido) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.qtde, other.qtde)) {
            return false;
        }
        if (!Objects.equals(this.precoVenda, other.precoVenda)) {
            return false;
        }
        if (!Objects.equals(this.pedido, other.pedido)) {
            return false;
        }
        return Objects.equals(this.item, other.item);
    }    

    @Override
    public String toString() {
        return qtde + ", " + getItem().getDescricao()
                + ", " + String.format("%.2f", precoVenda)
                + ", SubTotal: " + String.format("%.2f", subTotal());
    }
}
