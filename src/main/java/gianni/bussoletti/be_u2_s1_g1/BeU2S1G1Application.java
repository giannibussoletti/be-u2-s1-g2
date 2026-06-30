package gianni.bussoletti.be_u2_s1_g1;

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

        String getAdminName = context.getBean("getAdminName", String.class);
        System.out.println(getAdminName);


        // 2. Tramite context posso usare il metodo .getBean() per leggere i bean dallo "scatolone" e posso farlo specificando
        // il NOME PRECISO DEL BEAN
//        FullStackStudent fsFromContext = context.getBean("getFSStudent", FullStackStudent.class);
//        System.out.println(fsFromContext);
//        // oppure il TIPO DEL BEAN
//        FrontEndStudent fEFromContext = context.getBean(FrontEndStudent.class);
//        System.out.println(fEFromContext);
//
//        Interviewer interviewer = context.getBean(Interviewer.class);
//        interviewer.askQuestion();


//----------------------COMPONENTI(COMPOMENT)----------------
//        Il component è un segnale che viene dato a spring.
//        Quando spring trovate questo segnale lo aggiunge al context.
//        Non c'è bisogno di creare il bean in maniera manuale.
//        Il contro di questo approccio è che limita le personalizzazione rispetto ai bean manuali.
//        Il Bean che andrà a creare sarà singolo.
//        La base di una classe component ha come costruttore uno vuoto e i vari attributi devono avere
//        un valore di base. Non possono essere null
//        Le classi componente devono essere devono essere messi in un package figlio di quello principale.

//------------------------DIFFERENZE--------------------
//        Classi di configurazioni:
//        Utili per creare multipli bean dalla stessa classe
//        voglio stabilire io come instaziare l'oggetto
//        quando voglio usare una logica complessa come degli if o dei for
//        quando devo creare un bean da una libreria esterna

//        In ogni altro caso possiamo usare la classe component se non abbiamo bisogno di cose specifiche
//        Un esempio sono i Dao che non hanno bisogno di grande personalizzazione

//        ---------------AUTOWIRED--------------
//         È un annotazione che serve per usare l'iniezione delle dipendenze nei component
//        Ci sono principalmente 3 metodi per utilizzarlo
//        Constructor Injection: Le dipendenze vengono passate come argomenti al costruttore della classe. Questo è il
//        metodo più comune e promuove la costruzione di oggetti completamente inizializzati fin dall'inizio
//        è quella più consigliata anche da Spring

//        ES.
//        public class ProductService {
//            private final ProductRepository productRepository;
//
//            @Autowired
//            public ProductService(ProductRepository productRepository) {
//                this.productRepository = productRepository;
//            }
//        }
//
//        Setter Injection: Le dipendenze vengono fornite attraverso metodi setter dedicati. Questo approccio è utile
//        quando si desidera rendere opzionale una dipendenza o modificarla dopo la creazione dell'oggetto
//
//        public class ProductService {
//            private final ProductRepository productRepository;
//
//        Qui il setter prende la dipendenza e usa l'autowired per iniettarla
//            @Autowired
//            public void setProductService(ProductRepository productRepository) {
//                this.productRepository = productRepository;
//            }
//        }

//        Field Injection: In questa modalità di Dl, le dipendenze vengono iniettate direttamente nei campi della classe,
//        senza utilizzare metodi setter o costruttori. È un approccio molto conciso ma può portare a un'infrastruttura
//        meno esplicita e più difficile da testare rispetto agli altri tipi di DI.
//        Bisogna stare attenti se per la classe gli attributi diventano tanti allora potrebbe creare ad una infrastruttura poco robusta

//        public class ShoppingCart {
//            @Autowired
//            private ProductService productService;
//        }

//        ---------------ESEMPIO DI CLASSE component
        Interviewer interviewer = context.getBean(Interviewer.class);
        interviewer.askQuestion();
    }


}

