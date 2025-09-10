public class Operators {
    public static void main(String args[]){
        //Assignment operators
        int a=12;
        System.out.println(a);
        a+=10;
        System.out.println(a);
        a-=2;
        System.out.println(a);
        a*=2;
        System.out.println(a);
        a/=2;
        System.out.println(a);
        a%=2;
        System.out.println(a);

        //Relational operators
        int x=20;
        int y=30;
        if(x==y){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        if(x!=y){
            System.out.println("Not Equal");
        }
        else{
            System.out.println("Equal");
        }
        if(x>y){
                System.out.println("x is greater");
            }
            else{
                System.out.println("Not");
            }
        if(x<y){
            System.out.println("y is greater");
        }
        else{
            System.out.println("Not");
        }
        if(x>=y){
            System.out.println("x is greater and Equal");
        }
        else{
            System.out.println("NO");
        }
        if(x<=y){
            System.out.println("y is greater and Equal");
        }
        else{
            System.out.println("NO");
        }

        //Logical Operators
        boolean p = true;
        boolean q = false;
        if (p && q) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
        if (p || q) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("p = " + !p);
        System.out.println("q = " + !q);

        //Ternary Operator
        int num1 = 15, num2 = 25;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println(max);
        String result = (num1 % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
        }
    }
