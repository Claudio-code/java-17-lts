package com.company.sealedclasses;

public class SealedClassesRun {
    public static void run() {
        AppleSealed apple = new AppleSealed();
        PearSealed pear = new PearSealed();
        FruitSealed fruit = apple;
        class Avocado extends AppleSealed {};
    }
}
