package model;

public class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        String result;
        if (this.imaginary == 0){
            result = String.format("%.2f",this.real);
        } else {
            result = String.format("%.2f", this.real);
            if (this.imaginary < 0)
                result += String.format("%.1fi", this.imaginary);
            else result += String.format("+%.1fi", this.imaginary);
        }
        return result;
    }
}
