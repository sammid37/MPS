package business.template;

public class MealOrder extends OrderTemplate {
  @Override
  protected void selectProduct() {
    System.out.println("Selecione o alimento");
  }

  @Override
  protected void payment() {
    System.out.println("Realize o pagamento");
  }

  @Override
  protected void deliver() {
    System.out.println("Entregue o alimento");
  }
}
