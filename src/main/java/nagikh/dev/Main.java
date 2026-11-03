package nagikh.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        UserMessagePrinter printer = applicationContext.getBean(UserMessagePrinter.class);
        printer.printMessage("Nastya!");
    }
}
