//Relational Operators

public class RelationalOps {
    public static void main(String[] args)
    {
        float a=20.5f,b=5.75f,c=35.5f;

        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);

        //check condition is less than
        System.out.println("Statement a<b is "+(a<b));

        //check a is greater than b
        System.out.println("Statement a>b is "+(a>b));

        //check a is equal to c
        System.out.println("Statement a==c is "+(a==c));

        //check a is less than equal to c
        System.out.println("Statement a<=c is "+(a<=c));

        //check a is greater than equal to c
        System.out.println("Statement a>=c is "+(a>=c));

        //check b is not equal to c
        System.out.println("Statement b!=c is "+(b!=c));
    }
}

/*
Output
------

a= 20.5
b= 5.75
c= 35.5
Statement a<b is false
Statement a>b is true
Statement a==c is false
Statement a<=c is true
Statement a>=c is false
Statement b!=c is true


 */