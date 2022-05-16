package com.labs.day2;

class HemaBook{

    public String hemaTitle;
    public String hemaAuthor;
    public int hemaPrice;

    public void printBookDetails(){

        System.out.println("Book:  Title=" + hemaTitle+ ", Author = " + hemaAuthor+ ", Price = "+ hemaPrice );
    }

    public HemaBook(String hemaTitle, String hemaAuthor, int hemaPrice){
        this.hemaTitle= hemaTitle;
        this.hemaAuthor=hemaAuthor;
        this.hemaPrice=hemaPrice;
    }

}

class TestHema{

    public TestHema(){
    System.out.println("default constructor");
    }

    public TestHema(int a){
        System.out.println("Parameterized constructor");
    }

    public TestHema(String name){
        System.out.println("Parameterized constructor String = " + name);
    }

    public TestHema(String name, int a){
        System.out.println("Parameterized constructor with String and Integer");
    }


    public TestHema(int a, String name){
        System.out.println("Parameterized constructor with Integer and String");
    }


    public TestHema(int a, String name, int b ){
        System.out.println("Parameterized constructor with Integer, String and Integer order");
    }

    public void display()
    {
        System.out.println("default constructor");

    }
}

public class ConstructorsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


HemaBook objHemaBook = new HemaBook("Title1", "Hema", 100);


//          HemaBook objHemaBook= new HemaBook();
//          objHemaBook.hemaTitle= "Hema's new Trials";
//          objHemaBook.hemaAuthor="Hemajyothi R";
//          objHemaBook.hemaPrice= 100;
//
//        // System.out.println("Book:  Title='" + objHemaBook.hemaTitle+ "', Author = '" + objHemaBook.hemaAuthor+ "', Price = "+ objHemaBook.hemaPrice );

      objHemaBook.printBookDetails();

      HemaBook objHemaBook1 = new HemaBook("Title2", "Ajeya", 200);

//      HemaBook objHemaBook1= new HemaBook();
//
//      objHemaBook1.hemaTitle= "Ajeya's new book Trials";
//      objHemaBook1.hemaAuthor="Ajeya S ";
//      objHemaBook1.hemaPrice= 200;
//
//
//      // System.out.println("Book:  Title='" + objHemaBook1.hemaTitle+ "', Author = '" + objHemaBook1.hemaAuthor+ "', Price = "+ objHemaBook1.hemaPrice );
      objHemaBook1.printBookDetails();

      TestHema objTestHema = new TestHema();
      TestHema objTestHema1 = new TestHema( 10);
      TestHema objTestHema2 = new TestHema("Hema");
      TestHema objTestHema3 = new TestHema("Hema", 15);
      TestHema objTestHema4 = new TestHema(25, "Hema");
      TestHema objTestHema5 = new TestHema( 35, "Hema", 45);
	}

}
