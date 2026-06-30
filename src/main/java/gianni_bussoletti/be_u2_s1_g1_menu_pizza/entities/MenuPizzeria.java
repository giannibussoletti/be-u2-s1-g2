package gianni_bussoletti.be_u2_s1_g1_menu_pizza.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class MenuPizzeria {
    private double calorie;
    private double prezzo;
    private String nome;

    public MenuPizzeria(double calorie, double prezzo, String nome) {
        this.calorie = calorie;
        this.prezzo = prezzo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\n" + nome + "\ncalorie: " + calorie + " kcal" +
                "\nprezzo: " + prezzo + "€";
    }
}
