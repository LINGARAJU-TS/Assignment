package multithreading_EH;

@SuppressWarnings("serial")
class MyExceptionKey extends Exception 
{ 
    public MyExceptionKey(String s) 
    { 
        super(s); 
    } 

    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("temp"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
