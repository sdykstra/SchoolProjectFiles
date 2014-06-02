package evilHangman;

/**
 *
 * @author Scott Dykstra
 * @version v1.0 October 18,2012
 */
public class KeyType {

    private int numCount = 0;
    private String keyType = null;

    public KeyType(String key, int count) {
        keyType = key;
        numCount = count;
    }

    public void setCount(int newCount) {
        numCount = newCount;
    }
    
    public void setKey(String keyString){
        keyType = keyString;
    }
    
    public int getCount(){
        return numCount;
    }
    
    public String getKey(){
        return keyType;
    }
}// end KeyType



        