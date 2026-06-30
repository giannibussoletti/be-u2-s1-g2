package gianni_bussoletti.be_u2_s1_g1_menu_pizza.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Topping extends MenuPizzeria {
    private String nome;


    public Topping(double calorie, double prezzo, String nome) {
        super(calorie, prezzo, nome);
    }

    @Override
    public String toString() {
        return "\n" + super.toString();
    }
}
