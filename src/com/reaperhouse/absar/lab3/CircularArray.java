package com.reaperhouse.absar.lab3;

public class CircularArray {

    private int start;
    private int size;
    private Object [] cir;

    /*
     * if Object [] lin = {10, 20, 30, 40, null}
     * then, CircularArray(lin, 2, 4) will generate
     * Object [] cir = {40, null, 10, 20, 30}
     */
    public CircularArray(Object [] lin, int st, int sz){
        cir = new Object[lin.length];
        int index = st;
        for(int i = 0; i < sz; i++) {
            cir[index] = lin[i];
            index = (index + 1) % lin.length;
        }
        start = st;size = sz;
    }

    //Prints from index --> 0 to cir.length-1
    public void printFullLinear(){
        for(Object i : cir) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Starts Printing from index start. Prints a total of size elements
    public void printForward(){
        int index = start;
        for (int i = 0; i < size; i++) {
            System.out.print(cir[index] + " ");
            index = (index + 1) % cir.length;
        }
        System.out.println();
    }


    public void printBackward(){
        int lastPos = (start + size - 1) % cir.length;
        for (int i = 0; i < size; i++) {
            System.out.print(cir[lastPos] + " ");
            lastPos--;
            if(lastPos == -1)
                lastPos = cir.length - 1;
        }
        System.out.println();
    }

    // With no null cells
    public void linearize(){
        Object[] temp = new Object[size];
        int index = start;
        int count = 0;
        for (int i = 0; i < size; i++) {
            temp[count++] = cir[index];
            index = (index + 1) % cir.length;
        }
        start = 0; cir = temp;
    }

    // Do not change the Start index
    public void resizeStartUnchanged(int newcapacity){
        Object[] temp = new Object[newcapacity];
        int index = start;
        int count = start;
        for (int i = 0; i < size; i++) {
            temp[count] = cir[index];
            index = (index + 1) % cir.length;
            count = (count + 1) % temp.length;
        }
        cir = temp;
    }

    // Start index becomes zero
    public void resizeByLinearize(int newcapacity){
        Object[] temp = new Object[newcapacity];
        int ind = start;
        for (int i = 0; i < size; i++) {
            temp[i] = cir[ind];
            ind = (ind + 1) % cir.length;
        }
        start = 0; cir = temp;
    }

    /* pos --> position relative to start. Valid range of pos--> 0 to size.
     * Increase array length by 3 if size==cir.length
     * use resizeStartUnchanged() for resizing.
     */
    public void insertByRightShift(Object elem, int pos){
        if((pos < 0) || (pos > size)) {
            return; //closes the function
        }
        if(size == cir.length) {
            resizeStartUnchanged(size + 3);
        }
        int index = (start + pos) % cir.length;
        int rem = size - pos;
        int matha = (start + size - 1) % cir.length;
        int pa = (matha + 1) % cir.length;

        for(int i = 0; i < rem; i++) {
            cir[pa] = cir[matha];
            pa = matha;
            matha--;
            if(matha < 0) {
                matha = cir.length - 1;
            }
        }
        cir[index] = elem;
        size++;
    }

    public void insertByLeftShift(Object elem, int pos){
        if((pos < 0) || (pos > size)) {
            return; //closes the function
        }
        if (size == cir.length) {
            resizeStartUnchanged(size + 3);
        }
        int index = (start + pos) % cir.length;
        int mvVar = pos + 1;
        int matha = start;
        int pa = start - 1;
        if(pa < 0) {
            pa = cir.length - 1;
        }

        for (int i = 0; i < mvVar; i++) {
            cir[pa] = cir[matha];
            pa = matha;
            matha = (matha + 1) % cir.length;
        }

        cir[index] = elem;
        size++;
        start--;
        if(start < 0) {
            start = cir.length - 1;
        }
    }

    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByLeftShift(int pos){
        if((pos < 0) || (pos > size)) {
            return; //closes the function
        }
        int index = (start + pos) % cir.length;
        int mVar = size - (pos + 1);
        int matha = (index + 1) % cir.length;
        int pa = index;

        for (int i = 0; i < mVar; i++) {
            cir[pa] = cir[matha];
            pa = matha;
            matha = (matha + 1) % cir.length;
        }

        cir[(start + size - 1) % cir.length] = null;
        size--;
    }

    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByRightShift(int pos){
        if((pos < 0) || (pos > size)) {
            return; //closes the function
        }

        int index = (start + pos) % cir.length;
        int mVar = pos;
        int pa = index;
        int matha = pa - 1;
        if(matha < 0) {
            matha = cir.length - 1;
        }

        for (int i = 0; i < mVar; i++) {
            cir[pa] = cir[matha];
            pa = matha;
            matha--;
            if(matha < 0) {
                matha = cir.length - 1;
            }
        }

        cir[start] = null;
        size--;
        start = (start + 1 ) % cir.length;
    }


    //This method will check whether the array is palindrome or not
    public void palindromeCheck(){
        int s = start;
        int l = (start + size - 1) % cir.length;
        boolean flag = true;

        for(int i = 0; i < size/2; i++) {
            if(cir[s] != cir[l]) {
                flag = false;
                break;
            }
            s = (l + 1) % cir.length;
            l--;
            if(l < 0) {
                l = cir.length - 1;
            }
        }

        if(flag) {
            System.out.println("This array is a palindrome");
        } else {
            System.out.println("This array is NOT a palindrome");
        }
    }


    //This method will sort the values by keeping the start unchanged
    public void sort(){
        for(int i = 0; i < size; i++) {
            for(int j = 1; j < (size - i); j++) {
                int y = (start + j) % cir.length;
                int x=y-1;
                if(y==0){
                    x=cir.length-1;
                }
                int c = (int)cir[x]; //typecast the values
                int d = (int)cir[y];

                if(c > d) {   //swap the values
                    Object tem = cir[x];
                    cir[x] = cir[y];
                    cir[y] = tem;
                }
            }
        }
    }

    //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
    public boolean equivalent(CircularArray k){
        if(this.size != k.size) {
            return false;
        }
        int stThis = this.start;
        int stK = k.start;

        for(int i = 0; i < size; i++) {
            if(this.cir[stThis] != k.cir[stK]) {
                return false;
            }
            stThis = (stThis + 1) % this.cir.length;
            stK = (stK + 1) % k.cir.length;
        }
        return true;
    }
}