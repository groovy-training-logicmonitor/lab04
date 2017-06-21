/**
 * Created by allan on 6/21/17.
 */

def initializeArray(int[] array) {
    for(i in 0 .. array.size() - 1) {
        array[i] = i;
    }
}

int[] arrayInsert(int[] array, int at, int value) {
    int[] newArray = java.util.Arrays.copyOf(array, array.size() + 1)
    for (i in newArray.size() - 1 .. at + 1) {
        newArray[i] = newArray[i-1]
    }
    newArray[at] = value;

    return newArray;
}

int[] arrayDelete(int[] array, int at) {
    int[] newArray = java.util.Arrays.copyOf(array, array.size() - 1)
    for (i in at .. newArray.size() - 1) {
        newArray[i] = array[i+1]
    }

    return newArray
}

def performArrayExperiment(int size) {
    int[] smallArray = new int[size];
    initializeArray(smallArray);
    arrayInsert(smallArray, (int)(size/2), size+1)

    def start = System.nanoTime()
    arrayInsert(smallArray, (int)(size/2), size+1)
    def end = System.nanoTime();

    println "Insert on array of size ${size} takes ${(end-start)/1000000000} s"

    start = System.nanoTime()
    arrayDelete(smallArray, (int)(size/2))
    end = System.nanoTime();

    println "Delete on array of size ${size} takes ${(end-start)/1000000000} s"

    start = System.nanoTime()
    int i = smallArray[(int)(size/2)]
    end = System.nanoTime();

    println "Get nth element of array of size ${size} takes ${(end-start)/1000000000} s"
}

def performListExperiment(int size) {
    def list = []

    for (int i in 1 .. size) {
        list.add(i)
    }

    def start = System.nanoTime()
    list.add((int)(size/2), size+1)
    def end = System.nanoTime()

    println "Insert on list of size ${size} takes ${(end-start)/1000000000} s"

    start = System.nanoTime()
    list.remove((int)(size/2))
    end = System.nanoTime()

    println "Delete on list of size ${size} takes ${(end-start)/1000000000} s"

    start = System.nanoTime()
    int i = list.get((int)(size/2))
    end = System.nanoTime();

    println "Get nth element of array of size ${size} takes ${(end-start)/1000000000} s"
}

performArrayExperiment(10)
performArrayExperiment(100)
performArrayExperiment(1000)
performArrayExperiment(10000)
performArrayExperiment(100000)
performArrayExperiment(1000000)

performListExperiment(10)
performListExperiment(100)
performListExperiment(1000)
performListExperiment(10000)
performListExperiment(100000)
performListExperiment(1000000)
