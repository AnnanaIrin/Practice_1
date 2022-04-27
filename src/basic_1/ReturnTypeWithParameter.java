package basic_1;

public class ReturnTypeWithParameter {
    //Return Type With Parameter
    //AccessModifier DataType/class/object methodName( parameter) {return ; }
    //Return Type: All type of Data, void, class type and object


    public String getTeacherInfo(String name){

        System.out.println("Teacher Name"+name);

        return name;
    }
    public double doSumation(double num1,double num2,double num3){
        return  num1+num2+num3;

    }
    //Signature pattern
      public double doSumation1(double num1,double num2,double num3,double num4){
          System.out.println("Sumation value "+(num1+num2+num3+num4));
        return num1+num2+num3+num4;

      }

       public int doMulti(int girl1,int girl2,int girl3){

        return girl1* girl2*girl3;

       }
     public boolean isPizzaAvailable(String pizzaName,char size, int price){
     char pizzaSize=size;
      double pizzaPrice=price;
         // If large size pizza ia available then say else say no
         //= equal sign but in java equal  sign is==
         if ( pizzaSize =='L') {

             System.out.println("yes L size pizza is available");

         }else {
             System.out.println(pizzaSize+ " size " +pizzaName+ " pizza is not available ");
         }

        return pizzaSize =='L';
     }





     public static void main(String argus[]){

         ReturnTypeWithParameter ob=new ReturnTypeWithParameter();
         ob.getTeacherInfo(" Vushra");//Argument passing inside the method

//     ob.doSumation(56,87);//Argument passing inside method

       System.out.println(ob.doSumation(56,87,67)   );

          ob.doSumation1(23,45,67,34);
           int math1=500;
           int math2=math1 + ob.doMulti(10,40,76);//500+(10*40*76)
           System.out.println("Math value is " +math2);

           int girl= ob.doMulti(78,56,45);
           System.out.println("Girl value"+girl);

            System.out.println("******************************************");

           ob.isPizzaAvailable("UnccelPizza",'M',15);




     }


















}
