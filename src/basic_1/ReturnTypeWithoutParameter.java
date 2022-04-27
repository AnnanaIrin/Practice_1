package basic_1;

public class ReturnTypeWithoutParameter {

  //Return Type Without Parameter

    //AccessModifier DataType/class/object methodName() {return ; }


    //Return Type: All Type of Data, void, class type and object
    //Method Naming: Verb+Noun
    //Method name should start with lower case

   // void is a keyword which indicate non return type method
    public void getDisplay(){

        System.out.println("This is our Display method");
    }
    //AccessModifier DataType/class/object methodName() {return ; }
    public int doSummation(){

        System.out.println("This is do summation Method");
        int num1=20;
        int num2=30;
        int total=num1+num2;

        System.out.println("Total value is "+total);

        return total; //As it return type of method you need to use return key word.Return line should be last line of mathod

    }

    public int doSummation1(){
        System.out.println("This is do summation Method");
        int num1=20;
        int num2=30;

        System.out.println("Total value is "+ num1+num2);

        return num1+num2;

    }

     public double doMultiplicaton(){
        double man=45;
        int women=34;
        double multi=man* women;
//      System.out.println("Multipllied value"+multi);
         System.out.println("Multipllied value"+man* women);//Shortcut way

         return man* women;

     }

     public String getTeacherInformation(){

        String fname="Jule";
         String lname="Usra";

         String fullName=fname+" "+lname;

         System.out.println("Full Name "+fullName);

       return fullName;

     }
      public boolean isChikenAvailable(){

       boolean isAvailable=true;

       System.out.println("Pizza availability " +isAvailable);
        return isAvailable;
      }



  public static void main(String args []){
         //non-static method  call by object name

      ReturnTypeWithoutParameter obj=new ReturnTypeWithoutParameter();

      obj.getDisplay();
      obj.doSummation();
      obj.doMultiplicaton();
      obj.getTeacherInformation();
      obj.isChikenAvailable();


  }











}
