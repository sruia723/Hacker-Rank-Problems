//Every class in java extends the Object class

class Item1
{
    int ino;
    String iname;
    Item1(int ino, String iname)
    {
        this.ino = ino;
        this.iname = iname;
    }

    Item1(){}// default constructor

    @Override // toString() is method in Object class.
    public String toString() {
        return "Item number = " + ino + "\nItem name = " + iname;
    }
}


public class ToStringDemo {

    public static void main(String[] args) {

        Item1 itemA = new Item1(100, "Fruit");

        System.out.println(itemA);//invokes the toString() method implicitly
                                  //o/p is "Item1@7d9331eb", which shows class name and hashcode of the obj.

        //We override the toString() method to display the details of the object in readable format.
        //Now the o/p will be what you write in the toString() method

    }
}
