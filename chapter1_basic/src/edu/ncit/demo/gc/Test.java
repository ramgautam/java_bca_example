package edu.ncit.demo.gc;


public class Test
{
    // to store object name
    String obj_name;

    public Test(String obj_name)
    {
        this.obj_name = obj_name;
    }

    // Driver method
    public static void main(String args[])
    {
        Test t1 = new Test("t1");
        Test t2 = new Test("t2");

        //t1 now referred to t2
        t1 = t2;

        // calling garbage collector
        System.gc();
    }

    @Override
    /* Overriding finalize method to check which object
     is garbage collected */
    protected void finalize() throws Throwable
    {
       // this.obj_name=null;
        // will print name of object
        System.out.println(this.obj_name + " :::successfully garbage collected");
        System.out.println("display before program got exist");
    }
}