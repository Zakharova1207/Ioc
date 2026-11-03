package nagikh.dev;

import org.springframework.stereotype.Component;

@Component
public class UserMessagePrinter {
    private final UserMessageService userMessageService;

    public UserMessagePrinter(UserMessageService userMessageService) {
        this.userMessageService = userMessageService;
    }

    public void printMessage(String name) {
        userMessageService.createMessage(name);
    }
}
