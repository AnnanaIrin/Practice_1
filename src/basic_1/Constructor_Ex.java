package basic_1;

public class Constructor_Ex {


    //Default constructor:
    public Constructor_Ex(){
        System.out.println("Welcome to my mentoring");
    }
    String name;
    int age;
    double salary;
    String address;
    int phoneNumber;

    //Single Parametrization:

    public Constructor_Ex(String name){
        this.name=name;
        System.out.println("My name is: "+this.name);

    }
    // Multi Parametrization:
    public Constructor_Ex(String name, int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
        System.out.println("My name is: "+" "+this.name+" "+"My age is: "+" "+this.age+" "+"My salary is: "+" "+this.salary);

    }

    //Signature pattern string, string, int:
    public Constructor_Ex(String name,String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        System.out.println("His name is: "+" "+this.name+" "+"His address is: "+" "+this.address+" "+"His phone number is: "+" "+this.phoneNumber);
    }








    public static void main(String[] args) {


        Constructor_Ex def=new Constructor_Ex();//default constructor

        Constructor_Ex single=new Constructor_Ex("Irin");//Single Parametrization:

        Constructor_Ex multi=new Constructor_Ex("Irin",24,100000); // Multi Parametrization
        Constructor_Ex sig=new Constructor_Ex("Aryan","NY",89000);









    }






















}
