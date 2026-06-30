package gianni_bussoletti.be_u2_s1_g1_menu_pizza.config;

import gianni_bussoletti.be_u2_s1_g1_menu_pizza.entities.Bevanda;
import gianni_bussoletti.be_u2_s1_g1_menu_pizza.entities.Pizza;
import gianni_bussoletti.be_u2_s1_g1_menu_pizza.entities.PrintMenu;
import gianni_bussoletti.be_u2_s1_g1_menu_pizza.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class ConfigClass {


    @Bean
    public Topping getPomodoro() {
        return new Topping(92, 0.69, "Formaggio");
    }

    @Bean
    public Topping getFormaggio() {
        return new Topping(92, 0.69, "Formaggio");
    }

    @Bean
    public Topping getProsciutto() {
        return new Topping(35, 0.99, "Prosciutto");
    }

    @Bean
    public Topping getCipolle() {
        return new Topping(22, 0.69, "Cipolle");
    }

    @Bean
    public Topping getAnanas() {
        return new Topping(24, 0.79, "Ananas");
    }

    @Bean
    public Topping getSalame() {
        return new Topping(86, 0.99, "Salame");
    }

    @Bean
    public Pizza getPizzaMargherita() {
        List<Topping> margherita = Arrays.asList(getPomodoro(), getFormaggio());

        return new Pizza("Margherita", margherita, 1140, 4.99);
    }

    @Bean
    public Pizza getPizzaHawaiiana() {
        List<Topping> hawaiiana = Arrays.asList(getPomodoro(), getFormaggio(), getProsciutto(), getAnanas());
        return new Pizza("Hawaiiana", hawaiiana, 1024, 6.49);
    }

    @Bean
    public Pizza getPizzaSalame() {
        List<Topping> salame = Arrays.asList(getPomodoro(), getFormaggio(), getSalame());
        return new Pizza("col Salame", salame, 1160, 5.99);
    }

    @Bean
    public Bevanda getLimonata() {
        return new Bevanda(128, 1.29, "Limonata", 0.33);
    }

    @Bean
    public Bevanda getAcqua() {
        return new Bevanda(0, 1.29, "Acqua", 0.5);
    }

    @Bean
    public Bevanda getVino() {
        return new Bevanda(607, 7.49, "Vino", 0.75, 13);
    }

    @Bean
    public PrintMenu printMenu() {
        List<Pizza> menuPizza = Arrays.asList(getPizzaMargherita(), getPizzaHawaiiana(), getPizzaSalame());
        List<Topping> menuTopping = Arrays.asList(getFormaggio(), getAnanas(), getCipolle(), getSalame(), getProsciutto());
        List<Bevanda> menuBevanda = Arrays.asList(getVino(), getAcqua(), getLimonata());

        return new PrintMenu(menuPizza, menuTopping, menuBevanda);
    }


}
