package configserver.client.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import configserver.client.entities.Subscription;
import configserver.client.repositories.SubRepo;
import configserver.client.utilities.Response;

@Service
public class SubService {

    @Autowired
    SubRepo subRepo;

    public void save(Subscription subscription) {
        subRepo.save(subscription);
    }
}