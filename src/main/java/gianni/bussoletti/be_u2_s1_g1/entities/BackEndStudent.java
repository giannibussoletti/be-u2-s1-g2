package gianni.bussoletti.be_u2_s1_g1.entities;

public class BackEndStudent extends Student {
    public BackEndStudent(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void answerQuestion() {
        System.out.println("Salve il mio nome è " + this.getName() + " " + this.getSurname());
    }


    @Override
    public String toString() {
        return "BackEndStudent{} " + super.toString();
    }
}
