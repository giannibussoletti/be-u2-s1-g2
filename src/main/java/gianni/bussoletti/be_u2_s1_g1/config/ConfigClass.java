package gianni.bussoletti.be_u2_s1_g1.config;


import gianni.bussoletti.be_u2_s1_g1.entities.BackEndStudent;
import gianni.bussoletti.be_u2_s1_g1.entities.FrontEndStudent;
import gianni.bussoletti.be_u2_s1_g1.entities.FullStackStudent;
import gianni.bussoletti.be_u2_s1_g1.entities.Interviewer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
/*
Grazie a questa annotazione, questa sarà una classe speciale all'interno di questa applicazione.
Essa conterrà infatti tutte le dichiarazione dei BEAN (oggetti gestiti da Spring)
ciò significa che possiamo chiedere a Spring di creare e gestire determinati oggetti seguendo
le istruzioni che daremo in questa classe.
Ogni metodo annotato con @Bean serve per definire un oggetto diverso
*/
public class ConfigClass {

    @Bean
    public FrontEndStudent getFEStudent() {
        return new FrontEndStudent("Mario", "Rossi");
    }

    @Bean
    public BackEndStudent getBEStudent() {
        return new BackEndStudent("Gianni", "Bianchi");
    }

    @Bean
    public FullStackStudent getFSStudent() {
        return new FullStackStudent("Giuseppe", "Verdi");
    }

    // Cosa succede quando una dipendenza viene chiamata tramite classe ma esistono più dipendenze dello stesso genere
    // Se c'è più di un Bean dello stesso tipo bisogna essere più specifici con le istruzioni
    @Primary // Annotazione opzionale che permette di risolvere le ambiguità
    @Bean
    public FullStackStudent getFSStudent2() {
        return new FullStackStudent("Franco", "Neri");
    }

    @Bean
    public Interviewer getInterviewer(FullStackStudent fullStackStudent) {
        return new Interviewer(fullStackStudent);
    }

//    @Bean
//    public Interviewer getInterviewer(Student student) {
//        // Il parametro Student è una DIPENDENZA di Interviewer
//        // Spring pertanto non è che solo crea oggetti semplici, ma è anche
//        // in grado di risolvere le dipendenze andando a ricercare nello
//        // scatolone se ci siano dei Bean compatibili (in questo caso per tipo)
//        // se li trova li passa ad Interviewer
//        return new Interviewer(student);

}

