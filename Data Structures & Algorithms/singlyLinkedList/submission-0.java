class LinkedList {

    private ArrayList<Integer> array;

    public LinkedList() {
        array = new ArrayList();
    }

    public int get(int index) {
        try{
            return this.array.get(index);
        } catch(Exception e) {
            return -1;
        }
    }

    public void insertHead(int val) {
        ArrayList<Integer> newArr = new ArrayList();

        newArr.add(0, val);

        for (int i=0; i<this.array.size(); i++) {
            newArr.add(i+1, this.array.get(i));
        }

        this.array = newArr;
    }

    public void insertTail(int val) {
        this.array.add(val);
    }

    public boolean remove(int index) {
        try{
            this.array.remove(index);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public ArrayList<Integer> getValues() {
        return this.array;
    }
}
