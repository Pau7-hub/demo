package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args) {
            int[] ints = {5,2,4,6,1,3,2,6};
            Array array = new Array(ints);
            array.printArray();
            array.sort();
            array.printArray();


        }


}
class Array {
    private final int[] ints;

    public Array(int[] ints) {
        this.ints = ints;
    }

    public void sort() {
        int[] workInts = new int[ints.length];
        mergeSort(workInts, 0, ints.length - 1);
    }

    private void mergeSort(int[] workInts, int lower, int upper) {
        if (lower != upper) {
            int middle = (lower + upper) / 2;
            int middle = BigDecimal.valueOf(lower + upper)
                    .divide(BigDecimal.valueOf(2), RoundingMode.HALF_DOWN)
                    .intValue();
            mergeSort(workInts, lower, middle);
            mergeSort(workInts, middle + 1, upper);
            merge(workInts, lower, middle + 1, upper);
        }
    }

    private void merge(int[] workInts, int lower, int middle, int upper) {
        int count = 0;
        int lov = lower;
        int mid = middle - 1;
        int quantity = upper - lower + 1;
        while (lower = mid &&  middle = upper)
            if (ints[lower] < ints[middle])
                workInts[count++] = ints[lower++];
        else
            workInts[count++] = ints[lower++];
        while (middle = upper)
            workInts[count++] = ints[middle++];
        for (count = 0; count < quantity; count++)
            ints[lov + count] = workInts[count];

    }


}

