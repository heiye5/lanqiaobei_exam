package wuyou.ch14;

import java.io.*;

public class Java_2 {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            File f = new File("Person.dat");
            //*********Found**********
            oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(new Person("小王"));
            oos.close();
            ois = new ObjectInputStream(new FileInputStream(f));
            //*********Found**********
            Person d = (Person) ois.readObject();
            System.out.println(d);
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//*********Found**********
class Person implements Serializable {
    String name = null;
    public Person(String s) {
        name = s;
    }
    //*********Found**********
    public String toString() {
        return name;
    }
}