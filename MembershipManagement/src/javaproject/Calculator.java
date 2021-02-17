package javaproject;

@FunctionalInterface
interface Calculator<T extends Number> {
    double calculateFees(T clubID);
}
