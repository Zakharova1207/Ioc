package nagikh.dev;

import org.springframework.stereotype.Service;

@Service
public class UserMessageService {
    public void createMessage(String name) {
        System.out.println("Привет, " + name + ", добро пожаловать!");
    }
}