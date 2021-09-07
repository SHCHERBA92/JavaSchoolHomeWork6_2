import java.util.Iterator;
/**
 * Реализация моего списка, с собственным итератором
 * */
public class MyList<T> implements Iterable<T>{

    private T[] arrayList;
    private int sizeArrayList;
    private T[] newArrayList;

    public MyList(T[] arrayList)
    {
        this.arrayList = arrayList;
        this.sizeArrayList = arrayList.length;
    }

  @Override
    public Iterator<T> iterator() {

        Iterator<T> tIterator = new Iterator<T>() {

            int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < arrayList.length && arrayList[currentIndex]!= null;
            }

            @Override
            public T next() {
                if (arrayList[currentIndex].toString().startsWith("A"))
                {
                    return arrayList[currentIndex++];
                }
                else{
                    currentIndex++;
                    return null;
                }
            }

        };
        return tIterator;
    }
}
