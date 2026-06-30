package gianni.bussoletti.be_u2_s1_g1.entities;

import org.springframework.stereotype.Component;

@Component
public class Interviewer {
    //    @Autowired // FIELD INJECTION Gli attributi se non c'è costruttore devono avere l'autowired
//    Se voglio che in fase di creazione mi venga iniettato uno student devo usare Autowired
//    Altrimenti l'oggetto viene considerato null
//    È considerata una BAD PRACTICE
    private Student student; // Dipendenza nei confronti dì un altra classe

    //    Esempio di accoppiamento debole.
    // Se il costrure è unico l'autowired non è necessario
//    La CONSTRUCTOR INJECTION è quella più consigliata
    public Interviewer(Student student) {
        this.student = student;
    }

    public void askQuestion() {
        System.out.println("Buongiorno " + this.student.getSurname() + ", mi risponda alla domanda");
        this.student.answerQuestion();
    }
}
