package gianni_bussoletti.be_u2_s1_g1_menu_pizza.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PrintMenu {
    private List<Pizza> pizzaList;
    private List<Topping> toppingList;
    private List<Bevanda> bevandaList;

    public PrintMenu(List<Pizza> pizzaList, List<Topping> toppingList, List<Bevanda> bevandaList) {
        this.pizzaList = pizzaList;
        this.toppingList = toppingList;
        this.bevandaList = bevandaList;
    }

    public void print() {
        System.out.println("Benvenuto, Questo è il nostro menù".toUpperCase());
        System.out.println("\nLe nostre Pizze".toUpperCase());
        this.pizzaList.forEach(System.out::println);
        System.out.println("\nI nostri topping".toUpperCase());
        this.toppingList.forEach(System.out::println);
        System.out.println("\nLe nostre bevande".toUpperCase());
        this.bevandaList.forEach(System.out::println);
    }

    ;
}
