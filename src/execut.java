public class execut {
    public static void main(String[] args) {
        ListaDupla teste = new ListaDupla();
        teste.insere_fim(new Node(new Cliente("Carlos","0099393",0,0)));
        Cliente c = teste.achar_cliente("Carlos");
        teste.insere_fim(new Node(new Cliente("calito","00222003",0,0)));
        Cliente d = teste.achar_cliente("calito");
        System.out.println(c.getNome());
        System.out.println(d.getNome());
    }
}
