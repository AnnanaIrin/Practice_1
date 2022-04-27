package basic_1;

public class NonReturnTypeMethod {
    //Non-Return Type Method : Void type
    //Non-Return Type Method without parameter

    //AccessModifier returnType methodName(){}
      //Return type is void always
    public void tvDisplay(){

        System.out.println("This is Tv Display method");
    }

     public void doSum(){
       int num1=45;
       int num2=46;
       int total=num1+num2;
       System.out.println("Total value "+total);



     }
    //Non-Return Type Method with paramiterize
      public void  doSum1(int num1,int num2){
        int total=num1+num2;
        System.out.println("Total value"+total);


      }
      public void doSubtraction(double num1, double num2, double num3, double num4){

        double sub= num1-num2-num3-num4;
        System.out.println("Subtraction value "+sub);



      }




    public static void main(String argus []){
        NonReturnTypeMethod nonReturnTypeMethod=new NonReturnTypeMethod();
        nonReturnTypeMethod.tvDisplay();

        nonReturnTypeMethod.doSum();//non return type method
        nonReturnTypeMethod.doSum();
        System.out.println("*************************************");
        nonReturnTypeMethod.doSum1(76,68);

        nonReturnTypeMethod.doSubtraction(999,888,567,333);


    }










}
