package session13;

// sealed: tell me that should be extend circle & rectangle
public sealed abstract class AbstractShape permits Recangle,Circle {

    public abstract double calculator();
    public abstract double area();

}
//chaining of inheritance ro dare compiler
//baraye check null

//"""
