package gianni.bussoletti.be_u2_s1_g1;

import gianni.bussoletti.be_u2_s1_g1.entities.FrontEndStudent;
import gianni.bussoletti.be_u2_s1_g1.entities.FullStackStudent;
import gianni.bussoletti.be_u2_s1_g1.entities.Interviewer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeU2S1G1Application {

    public static void main(String[] args) {
        SpringApplication.run(BeU2S1G1Application.class, args);

        //--------------METODO CREAZIONE OGGETTI CON I BEANS----------------
        // 1. Devo accedere all'ApplicationContext creando un oggetto di tipo AnnotationConfigApplicationContext
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeU2S1G1Application.class);

        // 2. Tramite context posso usare il metodo .getBean() per leggere i bean dallo "scatolone" e posso farlo specificando
        // il NOME PRECISO DEL BEAN
        FullStackStudent fsFromContext = context.getBean("getFSStudent", FullStackStudent.class);
        System.out.println(fsFromContext);
        // oppure il TIPO DEL BEAN
        FrontEndStudent fEFromContext = context.getBean(FrontEndStudent.class);
        System.out.println(fEFromContext);

        Interviewer interviewer = context.getBean(Interviewer.class);
        interviewer.askQuestion();
    }


}
