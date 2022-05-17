
public class Node {
    private Node Next;
    private Node Preview;
    private Cliente Cliente;

    public Node getNext() {
        return Next;
    }

    public void setNext(Node next) {
        Next = next;
    }

    public Node getPreview() {
        return Preview;
    }

    public void setPreview(Node preview) {
        Preview = preview;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }

    public Node(Cliente Cliente){
        this.Next = null;
        this.Preview = null;
        this.Cliente = Cliente;

    }
}
