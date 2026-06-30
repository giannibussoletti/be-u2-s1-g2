package gianni_bussoletti.be_u2_s1_g1_menu_pizza.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Pizza extends MenuPizzeria {
    private List<Topping> toppings;
    private String nome;
    private Topping topping;

    public Pizza(String nome, List<Topping> toppings, double calorie, double prezzo) {
        super(calorie, prezzo, nome);
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "\nPizza: " + toppings + super.toString();
    }
}
