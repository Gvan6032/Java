import java.security.acl.LastOwnerException;
import org.apache.log4j.Logger;

public class Log4g {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Log4g.class);
        System.out.println("Logger!");
        log.info("Logger!!!");
    }
}
