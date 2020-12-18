package onlineShop.log;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentAction {

    private Logger logger;

    public PaymentAction(Logger logger) {
        this.logger = logger;
    }

    public PaymentAction() {

    }

    public void pay(BigDecimal payValue) {
        logger.log("pay begin, payValue is " + payValue);
        logger.log("pay end");
    }
}
