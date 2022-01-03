public class QuickSort {
        public static int[] quickSort(int[] array) {
            // Write your solution here
            if (array == null || array.length <= 1) {
                return array;
            }

            quickSort(array, 0, array.length - 1);
            return array;
        }

        private static void quickSort(int[] array, int left, int right) {
            if (left >= right) {
                return;
            }
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }

        private static int partition(int[] array, int left, int right) {
            int pivotIndex = left + (int) (Math.random() * (right - left + 1));
            int pivot = array[pivotIndex];
            swap(array, pivotIndex, right);
            //sort the array so the all numbers smaller than the pivot is on one side
            //and all nunmbers bigger than the pivot is on the other side;
            int leftBound = 0;
            int rightBound = right - 1;
            while (leftBound <= rightBound) {
                if (array[leftBound] < pivot) {
                    leftBound++;
                } else if (array[rightBound] >= pivot) {
                    rightBound--;
                } else {
                    swap(array, leftBound, rightBound);
                    leftBound++;
                    rightBound--;
                }
            }
            //sawp back the pivot to the correct/final position in the array
            swap (array, leftBound, right);
            return leftBound;
        }

        private static void swap(int[] array, int left, int right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
    }
