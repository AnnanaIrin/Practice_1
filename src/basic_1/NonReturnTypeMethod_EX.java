package basic_1;

public class NonReturnTypeMethod_EX {
    //Non-Return Type Method : Void type
    //Non-Return Type Method without parameter

    //AccessModifier returnType methodName(){}
    //Return type is void always
    //Without parameter
    public void doSum(){
        int num1=45;
        int num2=25;
        int total=num1+num2;
        System.out.println("Total:"+total);

    }
    // with parameterize
    public void doSubtraction(double income, double spent){
        double sub=income-spent;
        System.out.println("Total spend: "+sub);

    }




    public static void main(String[] args) {

        NonReturnTypeMethod_EX ob=new NonReturnTypeMethod_EX();
        ob.doSum();
        ob.doSubtraction(12000,10000);




    }








}
