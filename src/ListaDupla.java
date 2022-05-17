public class ListaDupla {

    private Node inicio;
    private Node fim;

    public ListaDupla(){
        inicio = fim = null;
    }

    public void insere_fim(Node head){
        if(inicio == null){
            inicio = fim = head;
            return;
        }
        Node insere = achar_prioridade();
        if(insere.getNext()!= null){
            Node next = insere.getNext();
            head.setNext(next);
            insere.setNext(head);
            head.setPreview(insere);
        }else{
            insere.setNext(head);
            head.setNext(null);
            head.setPreview(insere);
        }
    }

    public void remove_inicio(){
        if(inicio == null) return;
        Node remove =  inicio.getNext();
        inicio.setNext(null);
        remove.setPreview(null);
        inicio = remove;
    }

    public Cliente achar_cliente(String nome){
        for (Node nodo = inicio; nodo != null ; nodo.getNext()) {
            if(nodo.getCliente().getNome().equals(nome)){
                return nodo.getCliente();
            }
        }
        return null;
    }

    public Node achar_prioridade(){
        for (Node nodo = fim; nodo != null ; nodo.getPreview()) {
            if(nodo.getCliente().getPrioridade() == 1){
                return nodo;
            }
        }
        return fim;
    }

}
