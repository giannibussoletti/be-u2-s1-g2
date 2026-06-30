package gianni.bussoletti.be_u2_s1_g1.runners;

import gianni.bussoletti.be_u2_s1_g1.entities.Interviewer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class MyMainRunner implements CommandLineRunner {
    private Interviewer interviewer;

    public MyMainRunner(Interviewer interviewer) {
        this.interviewer = interviewer;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Ciao da runner");
        this.interviewer.askQuestion();
    }
}
