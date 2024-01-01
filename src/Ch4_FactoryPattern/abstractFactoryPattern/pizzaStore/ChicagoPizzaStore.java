package Ch4_FactoryPattern.abstractFactoryPattern.pizzaStore;

import Ch4_FactoryPattern.abstractFactoryPattern.factory.ChicagoPizzaIngredientFactory;
import Ch4_FactoryPattern.abstractFactoryPattern.factory.PizzaIngredientFactory;
import Ch4_FactoryPattern.abstractFactoryPattern.pizzaType.CheesePizza;
import Ch4_FactoryPattern.abstractFactoryPattern.pizzaType.ClamPizza;
import Ch4_FactoryPattern.abstractFactoryPattern.pizzaType.Pizza;
import Ch4_FactoryPattern.abstractFactoryPattern.pizzaType.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{

    PizzaIngredientFactory factory;

    public ChicagoPizzaStore(){
        this.factory = new ChicagoPizzaIngredientFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("시카고 스타일 치즈 피자");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(factory);
            pizza.setName("시카고 스타일 야채 피자");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(factory);
            pizza.setName("시카고 스타일 조개 피자");
        } else {
            System.out.println("피자가 없습니다ㅠ");
            return null;
        }
        return pizza;
    }
}
