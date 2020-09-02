package ru.pflb.emulator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.pflb.emulator.model.dto.ClientDto;
import ru.pflb.emulator.service.ClientService;

@RestController
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

/*    @GetMapping("/client/{id}")
    public ResponseEntity<ClientDto> getHello(@PathVariable long id) {
        ClientDto client = clientService.getUserById(id);
        return ResponseEntity.ok(client);
    }*/

    @GetMapping("/client/{id}")
    public ResponseEntity<ClientDto> getHello(@PathVariable long id) {
        ClientDto client = clientService.getClient(id);
        return ResponseEntity.ok(client);
    }


   /* @PostMapping("/addclient")
    public ResponseEntity<ClientDto> addCl(@RequestBody String body) {
       int creationStatus = clientService.addClient(client);
    }*/
}
