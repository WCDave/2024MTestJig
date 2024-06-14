package beans.control;

import org.springframework.scheduling.annotation.Scheduled;
/**
 * Created with IntelliJ IDEA.
 * User: Dave
 * Date: 7/15/13
 * Time: 7:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class TaskTest {

    @Scheduled(fixedDelay =30000)
    public void doIt()
    {
         //System.out.println("*******  IT WORKS  ****");
    }
}
