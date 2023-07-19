import java.util.Arrays;

public class CustomList {
    private int[] array;

    public CustomList(int size){
        array = new int[size];
    }



    public void addLastElement(int element) {
        expendCapacityArray(array);
        array[array.length] = element;

    }

    public void addElementByIndex(int index, int element) {
        if (checkIndexValid(index))
            expendCapacityArray(array);
        System.arraycopy(array, index, array, index + 1, array.length - index);


    }

    public void addLastElements(int[] elements) {
        expendCapacityArray(array, elements);
        System.arraycopy(elements, 0, array, array.length, elements.length);
    }

    public void addElementsByIndex(int index, int[] elements) {

    }


    private void expendCapacityArray(int[] array, int[] elements) {
        while (array.length + elements.length > array.length) {
            int[] expendedArray = new int[array.length + array.length / 2];
            System.arraycopy(array, 0, expendedArray, 0, array.length);
            array = expendedArray;
        }
    }

    private boolean checkIndexValid(int index) {
        if (index <= array.length & index < 0) {
            return true;
        } else {
            System.out.println("indexIsNotValid");

        }
        return false;
    }

    @Override
    public String toString() {
        return "CustomList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
