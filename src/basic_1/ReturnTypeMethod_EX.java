package basic_1;

public class ReturnTypeMethod_EX {
//Without parameter
 public int doSum(){
     int num1=20;
     int num2=10;
     int total=num1+num2;
     System.out.println("Total: "+total);
   return total;
 }
    public int doSub(){
        int num1=20;
        int num2=10;
        int total=num1-num2;
        System.out.println("Total sub: "+total);
        return total;
    }
  public String getTeacherInformation(){
     String fname="Jule";
     String lastname="Usra";
     String fullName=fname+" "+lastname;
      System.out.println("First Name: "+""+fname+" "+"Last Name: "+""+lastname);


     return fullName;
  }
  //With parameter
    public double doAddition(double fruitPrice, double vegetablePrice){
        System.out.println("Total price: "+(fruitPrice+vegetablePrice));
     return fruitPrice+vegetablePrice;


    }
    public int doSub(int num1, int num2){
        System.out.println("Sub:"+(num1-num2));
     return num1-num2;
    }





    public static void main(String[] args) {

        ReturnTypeMethod_EX without=new ReturnTypeMethod_EX();
        without.doSum();
        without.doSub();
        without.getTeacherInformation();

        System.out.println("*********with perameter*************");
        without.doAddition(23,20);//Argument passing inside the method
        without.doSub(25,20);

    }











}
