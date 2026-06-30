package gianni_bussoletti.be_u2_s1_g1_menu_pizza.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Bevanda extends MenuPizzeria {
    private String nome;
    private double litri;
    private double tassoAlcolico;


    public Bevanda(double calorie, double prezzo, String nome, double litri, double tassoAlcolico) {
        super(calorie, prezzo, nome);
        this.litri = litri;
        this.tassoAlcolico = tassoAlcolico;
    }

    public Bevanda(double calorie, double prezzo, String nome, double litri) {
        super(calorie, prezzo, nome);
        this.litri = litri;

    }

    @Override
    public String toString() {
        return super.toString() + " (" + litri + "l - " + tassoAlcolico + "%)";
    }
}
