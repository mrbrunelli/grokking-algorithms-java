package dev.mrbrunelli;

public class BinarySearch {
    int play(int[] list, int target) {
        var leftPointer = 0;
        var rightPointer = list.length - 1;
        while (leftPointer <= rightPointer) {
            var midPointer = (leftPointer + rightPointer) / 2;
            var attempt = list[midPointer];
            if (attempt == target) {
                return midPointer;
            }
            if (attempt > target) {
                rightPointer = midPointer - 1;
            } else {
                leftPointer = midPointer + 1;
            }
        }
        return -1;
    }
}


