package business.template;

/*
 * A seguinte implementação é um esboço.
 * Ainda a pode ser reestruturado com base no diagram de classes do projeto
 */

public abstract class OrderTemplate {
  // construtor
  public final void processOrder() {
    selectProduct();
    payment();
    deliver();
  }


  protected abstract void selectProduct();

  protected abstract void payment();

  protected abstract void deliver();
}
