package github.first;

import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class Consumer {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Logger logger = (Logger) LoggerFactory.getLogger(Consumer.class);
    }
}
