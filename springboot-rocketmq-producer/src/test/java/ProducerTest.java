import com.my.shopping.ShoppingProducerMain;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Gzy
 * @version 1.0
 * @Description
 * @date create on 2023/4/17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ShoppingProducerMain.class})
public class ProducerTest {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @Test
    public void testSendMessage(){
        //topic,message Object
        rocketMQTemplate.convertAndSend("springboot-rocketmq","testSendMessageBody,发送时间:" +
                new SimpleDateFormat("yyyy-MM-dd HH:mm:SS").format(new Date()));
        System.out.println("消息发送成功");
    }

}
