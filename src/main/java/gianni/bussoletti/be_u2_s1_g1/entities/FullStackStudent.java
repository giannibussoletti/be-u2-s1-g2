package gianni.bussoletti.be_u2_s1_g1.entities;

public class FullStackStudent extends Student {
    public FullStackStudent(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void answerQuestion() {
        System.out.println("Salve il mio nome è " + this.getName() + " " + this.getSurname());
    }

    @Override
    public String toString() {
        return "FullStackStudent{} " + super.toString();
    }
}
