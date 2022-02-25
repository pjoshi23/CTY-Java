package com.company;

public class MyProgram
{

    public static void main( String [] args )
    {
        MyStuff obj = new MyStuff( 10, 20 );
        swap( obj );
        System.out.println( obj.getX() + " " + obj.getY() );
    }

    public static void swap( MyStuff o )
    {
        int a = o.getX();
        int b = o.getY();

        if( a < b )
        {
            int temp = b;
            b = a;
            a = temp;
            o.setData( a, b );
        }
    }

}