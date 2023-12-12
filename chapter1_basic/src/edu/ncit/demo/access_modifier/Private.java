package edu.ncit.demo.access_modifier;

class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
    private void display(String displayAttributes){ // black box
        System.out.println("name::"+ displayAttributes);
    }
    public void displayName(Data data){
        display(data.getName());
    }
    private Data(){
        System.out.println("private constructor");
    }
    public Data(String name){
        this.name=name;
    }
}
public class Private {
    public static void main(String[] main) {
        //Data d = new Data();
        Data data= new Data("test Data");
//        // access the private variable using the getter and setter
////        d.name;//compile time error
////        d.setName("Programiz");
////        d.displayName(d);
////        d.display(d.getName());//compile time error
//        System.out.println(d.getName());
    }
}