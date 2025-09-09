class Complex {
    double real;
    double imaginary;

   
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    public void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        }
    }

  
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

  
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    
    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    
    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(realPart, imaginaryPart);
    }
}


class AdvancedComplex extends Complex {

    
    public AdvancedComplex(double real, double imaginary) {
        super(real, imaginary);
    }

   
    public double magnitude() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    
    public Complex conjugate() {
        return new Complex(real, -imaginary);
    }
}

public class Main {
    public static void main(String[] args) {
       
        Complex c1 = new Complex(4, 3);
        Complex c2 = new Complex(2, 5);

        System.out.println("Complex Number 1: ");
        c1.display();

        System.out.println("Complex Number 2: ");
        c2.display();

      
        Complex sum = c1.add(c2);
        System.out.println("Addition of Complex Numbers: ");
        sum.display();

        
        Complex difference = c1.subtract(c2);
        System.out.println("Subtraction of Complex Numbers: ");
        difference.display();

       
        Complex product = c1.multiply(c2);
        System.out.println("Multiplication of Complex Numbers: ");
        product.display();

        
        Complex quotient = c1.divide(c2);
        System.out.println("Division of Complex Numbers: ");
        quotient.display();

        
        AdvancedComplex ac1 = new AdvancedComplex(4, 3);
        System.out.println("Magnitude of Complex Number 1: " + ac1.magnitude());
        Complex conjugate = ac1.conjugate();
        System.out.println("Conjugate of Complex Number 1: ");
        conjugate.display();
    }
}
