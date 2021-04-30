public class SimplePair<K, V> implements MyPair {

    private K key;
    private V value;

    public SimplePair(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public Object getKey() {
        return this.key;
    }

    @Override
    public Object getValue() {
        return this.value;
    }
    
}
