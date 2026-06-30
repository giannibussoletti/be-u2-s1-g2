package gianni_bussoletti.be_u2_s1_g1_menu_pizza;

import gianni_bussoletti.be_u2_s1_g1_menu_pizza.entities.PrintMenu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
// La classe main viene automaticamente con SpringBootApplication
// è predisposta per fare alcune cose sottobanco
// SpringBoot gestisce tutte le sue dipendenze grazie a due principali dipendenze principali
// spring-boot-starter e spring-boot-starter-test che gestiscono tutto.
public class BeU2S1G1MenuPizzaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeU2S1G1MenuPizzaApplication.class, args);
        // Questo è un metodo già preimpostato
        // Questo run è quello che permette a spring di funzionare
        // entrambe non abbiamo bisogno di modificare
        // Il codice va messo sotto il run
        // Ma in una applicazione finita, la logica verrà gestita altrove.
        // E non sul main
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeU2S1G1MenuPizzaApplication.class);

        PrintMenu pM = context.getBean("printMenu", PrintMenu.class);

        pM.print();
    }

}
