package gianni.bussoletti.be_u2_s1_g1;

import gianni.bussoletti.be_u2_s1_g1.entities.FrontEndStudent;
import gianni.bussoletti.be_u2_s1_g1.entities.FullStackStudent;
import gianni.bussoletti.be_u2_s1_g1.entities.Interviewer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
// La classe main viene automaticamente con SpringBootApplication
// è predisposta per fare alcune cose sottobanco
// SpringBoot gestisce tutte le sue dipendenze grazie a due principali dipendenze principali
// spring-boot-starter e spring-boot-starter-test che gestiscono tutto.
public class BeU2S1G1Application {

    public static void main(String[] args) {
        SpringApplication.run(BeU2S1G1Application.class, args);
        // Questo è un metodo già preimpostato
        // Questo run è quello che permette a spring di funzionare
        // entrambe non abbiamo bisogno di modificare
        // Il codice va messo sotto il run
        // Ma in una applicazione finita, la logica verrà gestita altrove.
        // E non sul main


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

