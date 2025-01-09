package collection.array;

import java.util.Arrays;

/*
배열의 구조적 한계
배열에서 데이터를 추가하는 위치에 따른 성능 차이
배열은 정적 크기를 가지므로, 크기 조정이나 데이터 이동이 필요한 작업에서 성능이 떨어질 수 있음.
성능 측면에서 배열의 동적 자료 구조로의 전환(예: ArrayList) 필요성 대두.
 */
public class ArrayMain2 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        /*
         배열의 첫 번째 위치에 데이터 추가:
         기존 데이터를 한 칸씩 뒤로 이동하여 새로운 데이터를 추가할 공간을 확보해야 함.
         시간 복잡도: O(n) (배열 크기에 비례).
         */
        System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
        int newValue = 3;

        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        /*
        배열의 중간 위치에 데이터 추가:
        중간 위치부터 오른쪽으로 데이터를 이동하여 공간을 확보.
        시간 복잡도: O(n/2), 평균적으로 O(n)로 간주.
         */
        System.out.println("배열의 index(2)에 4 cnrk O(n)");
        int value = 4;
        int index = 2;

        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));

        /*
        배열의 마지막 위치에 데이터 추가:
        데이터 이동이 필요 없으므로 단순히 값을 할당.
        시간 복잡도: O(1)
         */
        System.out.println("배열의 마지막 인덱스에 5 추가 O(1)");
        int lastValue = 5;
        extracted(arr, lastValue);
        System.out.println(Arrays.toString(arr));

    }

    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newValue;
    }

    private static void addAtIndex(int[] arr, int index, int newValue2) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = newValue2;
    }

    private static void extracted(int[] arr, int lastValue) {
        arr[arr.length-1] = lastValue;
    }
}
