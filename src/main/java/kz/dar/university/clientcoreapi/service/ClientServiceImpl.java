package kz.dar.university.clientcoreapi.service;


import kz.dar.university.clientcoreapi.model.ClientModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService {
    HashMap<String, ClientModel> clientModelHashMap = new HashMap<>();
    @Override
    public void createClient(ClientModel clientModel) {
        clientModel.setClientId(UUID.randomUUID().toString());
        clientModelHashMap.put(clientModel.getClientId(), clientModel);
    }

    @Override
    public List<ClientModel> getAllClients() {
        return new ArrayList<>(clientModelHashMap.values());
    }

    @Override
    public ClientModel getClientById(String clientId) {
        return clientModelHashMap.get(clientId);
    }

    @Override
    public void updateClientById(String clientId, ClientModel clientModel) {
        clientId = clientModel.getClientId();
        if (clientModelHashMap.containsKey(clientId)) {
            clientModel.setClientId(clientId);
            clientModelHashMap.put(clientId, clientModel);
        }
    }

    @Override
    public void deleteClientById(String clientId) {
        clientModelHashMap.remove(clientId);
    }
}
