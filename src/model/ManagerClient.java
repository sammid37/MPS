package model;

public class ManagerClient {
    private List<Cliente> clientes;

    public ManagerClient() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    public void atualizarCliente(Cliente cliente) {
        // implementar lógica para atualizar informações do cliente
    }

    public List<Pedido> getPedidos(Cliente cliente) {
        // implementar lógica para retornar lista de pedidos do cliente
        return null;
    }

    public List<Pedido> getHistoricoCompras(Cliente cliente) {
        // implementar lógica para retornar histórico de compras do cliente
        return null;
    }
}