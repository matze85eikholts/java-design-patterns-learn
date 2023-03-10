package iterator;

public class FruitRepository implements Container{
    public String fruits[] = {"apple", "banana", "orange"};

    @Override
    public Iterator getIterator() {
        return new FruitIterator();
    }
    private class FruitIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < fruits.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext())
                return fruits[index++];
            return null;
        }
    }
}
