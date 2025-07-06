import java.io.*;
import java.util.Objects;


/**
 * Explanation:
 *     Person Class:
 *         Implements Serializable to allow object serialization
 *         Contains three fields: name, age, and address
 *         Has a parameterized constructor that initializes all fields
 *         Includes a toString() method for string representation
 *         Uses Objects.requireNonNull() for null checks
 *
 *     Serialization (Writing to file):
 *         Creates an ObjectOutputStream wrapped around a FileOutputStream
 *          Writes the Person object to "person.dat" file using writeObject()
 *         Prints the original object for verification
 *
 *     Deserialization (Reading from file):
 *         Creates an ObjectInputStream wrapped around a FileInputStream
 *         Reads the Person object from "person.dat" using readObject()
 *         Casts the returned Object to Person type
 *         Prints the deserialized object
 */
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
        this.age = age;
        this.address = Objects.requireNonNull(address, "Address cannot be null");
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
    }
}

public class PersonSerializationDemo {
    public static void main(String[] args) {
        String filePath = "person.dat";
        Person person = new Person("John Doe", 30, "123 Main St, New York");

        // Writing to file
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(person);
            System.out.println("Person object written to file successfully.");
            System.out.println("Original object: " + person);
        } catch (IOException e) {
            System.err.println("Error writing object to file: " + e.getMessage());
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing output stream: " + e.getMessage());
            }
        }

        // Reading from file
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(filePath));
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("\nPerson object read from file successfully.");
            System.out.println("Deserialized object: " + deserializedPerson.toString());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading object from file: " + e.getMessage());
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing input stream: " + e.getMessage());
            }
        }
    }
}
