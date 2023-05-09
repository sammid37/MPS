package model;

import java.util.ArrayList;


public class ManagerClient {
    private List<Client> clients;

    public ManagerClient() {
        this.clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public void removeClient(Client client) {
        this.clients.remove(client);
    }

    public void updateClient(Client client) {
        // implementar lógica para atualizar informações do cliente
    }

    public Client findClientByName(Strinf name){
        for(Client client: clients){
            if(cleints.getClientName() == name) return client;
        }
        return null;
    }
    
    public List<Pedido> getPedidos(Cliente cliente) {
        // implementar lógica para retornar lista de pedidos do cliente
        return null;
    }

}