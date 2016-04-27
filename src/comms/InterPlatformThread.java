package comms;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Nic on 4/27/2016.
 */
public abstract class InterPlatformThread extends Thread {

    protected InputStream inputStream;
    protected OutputStream outputStream;

    protected InterPlatformThread(InputStream in, OutputStream out){
        this.inputStream = in;
        this.outputStream = out;
    }

    protected void close(){
        if(inputStream != null){
            try{
                inputStream.close();
            }catch (IOException e){
                //ignore
            }
        }
        if(outputStream != null){
            try{
                outputStream.close();
            }catch (IOException e){
                //ignore
            }
        }
    }



}
