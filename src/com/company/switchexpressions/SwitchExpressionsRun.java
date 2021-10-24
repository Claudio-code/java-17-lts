package com.company.switchexpressions;

public class SwitchExpressionsRun {
    private static void withYield(Fruit fruit) {
        String text = switch (fruit) {
            case APPLE, PEAR -> {
                System.out.println("the given fruit was: " + fruit);
                yield "Common fruit";
            }
            case ORANGE, AVOCADO -> "Exotic fruit";
            default -> "Undefined fruit";
        };
        System.out.println(text);
    }

    private static void withSwitchExpression(Fruit fruit) {
        switch (fruit) {
            case APPLE, PEAR -> System.out.println("Common fruit");
            case ORANGE, AVOCADO -> System.out.println("Exotic fruit");
            default -> System.out.println("Undefined fruit");
        }
    }

    public static void run() {
        withYield(Fruit.APPLE);
        withSwitchExpression(Fruit.ORANGE);
    }
}
