package basic_1;

public class Constructor {



   String name="Jule";
   int age;
   String address;
   double salary;



    //Defalut Constructor
    public Constructor(){


        System.out.println("hello");


    }
   //Single Parametrization
    public Constructor( String month ){
    this.name= month; //1st name variable. 2nd value come string variable

    System.out.println(this.name);
    }

    // Multi Parametrization
        public Constructor( String month, int age,String address){

      this.name= month;
      this.age=age;
      this.address=address;
//      System.out.println("Month name is "+this.name+"  "+"Student age is "+this.age);
            System.out.println("Month name is "+this.name+"  "+"Student age is "+this.age+"My address"+this.address);

        }
        //Signature pattern string, string, int
      public Constructor(String month,String address,int age){
         this.name=month;
         this.address=address;
         this.age=age;
          System.out.println( this.name);
          System.out.println( this.address);
          System.out.println( this.age);
      }

    public Constructor(int age,String month,String address){





    }


    public static void main(String[] args) {


        Constructor ob=new Constructor();

       int age=23;

      System.out.println(ob.age);
      System.out.println(ob.name);
      System.out.println("**********************");

//      Constructor aryan=new Constructor( "january");
//
//       Constructor aryan1=new Constructor("january"23 );
//
//        Constructor aryan2=new Constructor("February",23,"NY");


        Constructor aryan3=new Constructor("May","NY",56);


        aryan3.address="jamica";
        System.out.println(aryan3.address);













    }









}
