package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    private static final String BIRTHDAY = "Birthday";
    private static final String BLACK_FRIDAY = "Black Friday";
    private static final String NEW_YEAR = "New Year";

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        return switch (specialEvent) {
            case BIRTHDAY -> new BirthdayDiscountService();
            case BLACK_FRIDAY -> new BlackFridayDiscountService();
            case NEW_YEAR -> new NewYearDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}
