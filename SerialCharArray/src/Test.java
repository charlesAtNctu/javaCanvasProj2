import java.io.*;

/**
 * Created by aime1 on 6/30/18.
 */
public class Test {
    public static void main(String[] args) throws Exception {

        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("test.ser")));
        out.writeObject(new char[] {'B', 'C'});
        out.flush();
        out.close();

        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("test.ser")));
        char[] array = (char[]) in.readObject();
        in.close();

        System.out.println("Is it " + (array instanceof Serializable));

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }


    }
}
