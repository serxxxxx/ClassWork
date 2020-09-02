package ru.pflb.emulator.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.pflb.emulator.model.dto.ClientDto;
import ru.pflb.emulator.service.ClientService;

import java.util.Random;

@Service
public class ClientServiceImpl implements ClientService {

/*
    public ClientDto addClient (long id) {

        return ResponseEntity + ClientDto;
    }*/

    @Override
    public ClientDto getClient(long id) {
        ClientDto client = ClientDto.builder()
                .id(id)
                .firstName(getRandomString())
                .lastName(getRandomString()+ "beck")
                .cardNumber(getRandomNumber())
                .isActive(getRandomBoolean())
                .build();
        return client;
    }

    private boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();    }

    private String getRandomNumber() {
        int min = 1000;
        int max = 9999;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;

        return i +" "+i+" "+i+" "+i;
    }

    private String getRandomString() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder(9);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }
}
