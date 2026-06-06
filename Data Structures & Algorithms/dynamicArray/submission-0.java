class DynamicArray {

    private int[] array;
    private int capacity;
    private int size;
    
    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (size==capacity) {
            resize();
        }
        this.array[this.size] = n;
        size++;
    }

    public int popback() {
        size--;
        int returnNum = this.array[this.size];
        this.array[this.size] = 0;
        return returnNum;
    }

    private void resize() {
        int ogSize = this.array.length;
        int[] ogArray = this.array;
        this.array = new int[ogSize*2];
        this.capacity = ogSize * 2;

        for(int i=0; i<ogSize; i++) {
            this.array[i] = ogArray[i];
        }
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
