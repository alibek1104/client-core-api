package kz.dar.university.clientcoreapi.controller;

import kz.dar.university.clientcoreapi.model.ClientModel;
import kz.dar.university.clientcoreapi.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;


    @GetMapping("/check")
    public String check() {
        return "client-core-api is working";
    }
    @PostMapping
    public void createClient(@RequestBody @Valid ClientModel clientModel) {
        clientService.createClient(clientModel);
    }
    @GetMapping("/all")
    public List<ClientModel> getAllClients() {
        return clientService.getAllClients();
    }
    @GetMapping("/{clientId}")
    public ClientModel getClientById(@PathVariable String clientId) {
        return clientService.getClientById(clientId);
    }
    @PutMapping("/{clientId}")
    public void updateClientById(@RequestBody ClientModel clientModel) {
        clientService.updateClientById(clientModel);
    }
    @DeleteMapping("/{clientId}")
    public void deleteClientById(@PathVariable String clientId) {
        clientService.deleteClientById(clientId);
    }


}
