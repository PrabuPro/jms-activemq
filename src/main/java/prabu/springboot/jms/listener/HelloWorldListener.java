package prabu.springboot.jms.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import prabu.springboot.jms.config.JmsConfig;
import prabu.springboot.jms.model.HelloWorldMessage;

import javax.jms.Message;

@Component
public class HelloWorldListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders messageHeaders, Message message){
        System.out.println("I got the message");
        System.out.println(helloWorldMessage);
    }

}
