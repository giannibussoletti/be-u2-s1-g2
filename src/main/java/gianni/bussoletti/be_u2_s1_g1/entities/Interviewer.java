package gianni.bussoletti.be_u2_s1_g1.entities;

public class Interviewer {
    private final Student student; // Dipendenza nei confronti dì un altra classe

    public Interviewer(Student student) {
        this.student = student;
    }

    public void askQuestion() {
        System.out.println("Buongiorno " + this.student.getSurname() + ", mi risponda alla domanda");
        this.student.answerQuestion();
    }
}
