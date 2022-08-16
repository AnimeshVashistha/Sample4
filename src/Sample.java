//constructorchaining
class Sample{
    Sample() {
        System.out.println("In default constructor");

    }
    Sample(int a)
    {
        this();
        System.out.println("In Parameterized constructor");
    }
}
class Test{
    public static void main(String args[]){
        Sample s = new Sample(10);
    }
}