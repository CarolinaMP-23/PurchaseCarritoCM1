package screenplay;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public abstract class userAddProductToCart implements Task {
    private final String productName;
    public userAddProductToCart(String productName) {
        this.productName = productName;
    }
    public <T extends Actor> void performAs (@NotNull T actor) {
        Target addToCartButton = Target.the("Add to Cart button").locatedBy("//button[contains(text(), '" + productName + "']");
        actor.attemptsTo(
                new wait(addToCartButton).isVisible());
        Click.on(addToCartButton);

    }

    public static Performable named() {
        return named(null);
    }

    public static Performable named(String productName) {
        return instrumented(userAddProductToCart.class, productName);
    }

    private static class wait {
        public wait(Target addToCartButton) {
        }

        @Nullable
        @Contract(pure = true)
        public Performable isVisible() {
            return null;
        }
    }
}