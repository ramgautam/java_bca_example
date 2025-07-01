package edu.ncit.demo.access_modifier.for_default1;

  public class PackageA {
     public void msg() {
        System.out.println("Hello");
    }

    public static  void main(String args []){
       PackageA a = new PackageA();
       a.msg();
    }
}
