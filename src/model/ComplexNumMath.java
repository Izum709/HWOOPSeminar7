package model;

public class ComplexNumMath {
    ComplexNumber number;

    public static ComplexNumber add(ComplexNumber a1, ComplexNumber b1)
    {
        return new ComplexNumber(a1.getReal() + b1.getReal(), a1.getImaginary() + b1.getImaginary());
    }

    public static ComplexNumber subtract(ComplexNumber a1, ComplexNumber b1)
    {
        return new ComplexNumber(a1.getReal() - b1.getReal(), a1.getImaginary() - b1.getImaginary());
    }

    public static ComplexNumber multiply(ComplexNumber a1, ComplexNumber b1)
    {
        return new ComplexNumber(a1.getReal() * b1.getReal() - a1.getImaginary() * b1.getImaginary(),
                a1.getReal() * b1.getImaginary() + a1.getImaginary() * b1.getReal());
    }

    public static ComplexNumber divide(ComplexNumber a1, ComplexNumber b1)
    {
        return new ComplexNumber((a1.getReal() * b1.getReal() + a1.getImaginary() * b1.getImaginary()) / (b1.getReal() * b1.getReal() + b1.getImaginary() * b1.getImaginary()),
                (a1.getImaginary() * b1.getReal() - a1.getReal() * b1.getImaginary()) / (b1.getReal() * b1.getReal() + b1.getImaginary() * b1.getImaginary()));
    }
}
