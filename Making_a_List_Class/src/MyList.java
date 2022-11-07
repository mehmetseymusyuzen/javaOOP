public class MyList<T> {
    private int capacity;
    private int index = 0;
    T[] arr;

    public MyList() {
        this.capacity = 10;
        this.arr = (T[]) new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                size++;
            }
        }
        return size;
    }

    public void add(T data) {
        if (this.index == this.capacity) {
            this.capacity += 10;
            T[] tempArr = (T[]) new Object[this.capacity - 10];
            tempArr = this.arr.clone();

            this.arr = (T[]) new Object[this.capacity];

            int temp = 0;
            for (T item : tempArr) {
                this.arr[temp] = item;
                temp += 1;
            }

            this.arr[this.index] = data;
        } else
            this.arr[this.index] = data;

        this.index++;
    }

    public T getIndex(int index) {
        if (this.index > index) {
            return this.arr[index];
        }
        return null;
    }

    public void setIndex(int index, T data) {
        if (this.index > index) {
            this.arr[index] = data;
        }
    }

    public T remove(int index) {
        if (index < this.index) {
            T t = this.arr[index];
            for (; index < this.index; index++) {
                this.arr[index] = this.arr[index + 1];
                this.index--;
                return t;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int index = 0; index < this.index; index++) {
            if (index == this.index - 1) {
                str += (this.arr[index].toString());
            } else {
                str += (this.arr[index].toString() + " , ");
            }
        }
        str += "]";
        return str;
    }

    public int indexOf(T data) {
        for (T item : this.arr) {
            if (item == data) {
                return 1;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (index = this.index; index > 0; index--) {
            if (this.arr[index] == data) {
                return index;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.index == 0;
    }

    public T[] toArray() {
        return this.arr.clone();
    }

    public void clear() {
        int index = 0;
        int capacity = 10;
        this.arr = (T[]) new Object[this.capacity];
    }

    public MyList<T> subList(int start, int finish) {
        MyList arr = new MyList(finish - start + 1);

        for (int index = 0; start <= finish; start++, index++) {
            arr.add(this.arr[start]);
        }
        return arr;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }
}