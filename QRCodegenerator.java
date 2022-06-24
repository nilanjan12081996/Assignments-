package qrcodegenerator;
/**
 *
 * @author nilan
 */
import net.glxn.qrgen.QRCode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class QRCodegenerator {
    public static void main(String[] args) throws FileNotFoundException, IOException{
    
    String info="My name is Nilanjan"; //this is the message
    ByteArrayOutputStream out=QRCode.from(info).to(net.glxn.qrgen.image.ImageType.PNG).stream();//create the QRCode and convert it into suitable image format
    File f=new File("C:\\Users\\nilan\\OneDrive\\Documents\\NetBeansProjects\\QRCode\\src\\qr.png");//give the path where the QRCode image file is created
    FileOutputStream fos=new FileOutputStream(f);
    fos.write(out.toByteArray()); //write the data in to the file
    fos.close();//close the file
    }
}
