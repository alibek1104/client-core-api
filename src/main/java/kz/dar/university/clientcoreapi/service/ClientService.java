package kz.dar.university.clientcoreapi.service;

import kz.dar.university.clientcoreapi.model.ClientModel;

import java.util.List;

public interface ClientService {
    void createClient(ClientModel clientModel);
    List<ClientModel> getAllClients();
    ClientModel getClientById(String clientId);
    void updateClientById(ClientModel clientModel);
    void deleteClientById(String clientId);
}
