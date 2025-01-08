package collection.array;

import java.util.Arrays;

/*
배열은 첫번째 인덱스로부터 데이터 타입에 맞게 일정한 크기로 쪼개져 있고 인덱스 수도 정해져 있기 때문에
인덱스만 알면 배열 안에서의 위치를 바로 찾을 수 있다.
따라서 배열은 입력, 변경, 조회는 단 한번의 계산, 즉 O(1)으로 필요한 위치를 찾을 수 있으며 매우 빠르다.

배열의 검색
배열에 들어있는 데이터를 찾는 것.
예를 들어, 어떤 값이 배열에 존재하는지 검색하고 해당 값이 들어있는 인덱스를 반환받는다고 생각해보자.
이때는 인덱스를 모르기 때문에 인덱스에 들어있는 데이터와 찾는 값을 하나하나 비교해야 한다.
만약 값이 없거나 마지막에 있는 경우에는 배열의 크기 만큼 해야한다.
배열의 크기가 n이면 연산도 n만큼 필요하다.
 */
public class ArrayMain1 {
    public static void main(String[] args) {

        int[] arr = new int[5];

        // index 입력 : O(1)
        System.out.println("==index 입력: 0(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        //index 변경 : O(1)
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        //index 조회 : O(1)
        System.out.println("arr[2] = " + arr[2]);

        // 배열 내부 검색 : O(n)
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
            if (arr[i] == value) {
                System.out.println(value + " 찾음, index = " + i + ", 반복 횟수 = " + (i + 1));
                break;
            }
        }
    }
}
