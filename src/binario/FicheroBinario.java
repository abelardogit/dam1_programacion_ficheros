package binario;

import java.io.*;

public class FicheroBinario {

    public static void escribir(BDCredentials bdCredentials) {
        File bdCredentialsDAT = new File("BDCredentials.txt");

        // guardamos la información
        try {
            FileOutputStream fos = new FileOutputStream(bdCredentialsDAT);
            BufferedOutputStream bos =  new BufferedOutputStream(fos);
            ObjectOutputStream writer = new ObjectOutputStream(bos);

            writer.writeObject(bdCredentials);

            writer.close();
            bos.close();
            fos.close();
        } catch(FileNotFoundException fileNotFoundException) {
            // ...
            //
        } catch(IOException ioException) {
            // ...
            System.err.println("No hemos podido grabar la información.");
        }
    }

    public static BDCredentials leer() {
        File bdCredentialsDAT = new File("BDCredentials.txt");
        BDCredentials bdCredentials = null;

        if(bdCredentialsDAT.exists()) {
            // guardamos la información
            try {
                FileInputStream fos = new FileInputStream(bdCredentialsDAT);
                BufferedInputStream bos =  new BufferedInputStream(fos);
                ObjectInputStream reader = new ObjectInputStream(bos);

                bdCredentials = (BDCredentials) reader.readObject();

                reader.close();
                bos.close();
                fos.close();
            } catch(FileNotFoundException fileNotFoundException) {
                // ...
                //
            } catch(IOException ioException) {
                // ...
                System.err.println("No hemos podido grabar la información.");
            } catch(ClassNotFoundException classNotFoundException) {
                // ...
                System.err.println("No hemos podido encontrar la clase.");
            }
        }

        return bdCredentials;
    }


}
