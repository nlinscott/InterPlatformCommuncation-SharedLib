package obj;

import apachecommons.Serializer;

/**
 * Created by Nic on 4/27/2016.
 */
public class CustomSerializer extends Serializer{

    //TODO: add custom objects to this package
    //TODO: implement serialize and deserialize methods using Apache Commons functions

    public static byte[] serializeContact(Contact c){
        return serialize(c);
    }

    public static Contact deserializeContact(byte[] contactBytes){
        return deserialize(contactBytes);
    }


}
