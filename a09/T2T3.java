package a09;

public class T2T3 {
  public static void main(String[] args) {
    Student[] arr = { new Student("Dan", 148103, 4.92), new Student("Alex", 1481, 4.38),
        new Student("Gregory", 19934, 3.33),
        new Student("Emma", 13, 4.55) };

    for (Student st : arr) {
      System.out.println(st.toString());
    }
    System.out.println();

    QuickSort.sort(arr);

    for (Student st : arr) {
      System.out.println(st.toString());
      ;
    }

    System.out.println("-".repeat(20));

    Student[] arr2 = { new Student("Dan", 148103, 4.92), new Student("Alex", 1481, 4.38),
        new Student("Gregory", 19934, 3.33),
        new Student("Emma", 13, 4.55) };

    for (Student st : arr2) {
      System.out.println(st.toString());
    }
    System.out.println();

    QuickSort.sort(arr2);

    for (Student st : arr2) {
      System.out.println(st.toString());
      ;
    }
  }
}

class MergeSort {
  private static SortingStudentsByGPAComparator comp = new SortingStudentsByGPAComparator();

  public static void sort(Student[] arr) {
    mergeSort(arr, arr.length);
  }

  public static void mergeSort(Student[] a, int n) {
    if (n < 2) {
      return;
    }
    int mid = n / 2;
    Student[] l = new Student[mid];
    Student[] r = new Student[n - mid];

    for (int i = 0; i < mid; i++) {
      l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
      r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);

    merge(a, l, r, mid, n - mid);
  }

  public static void merge(
      Student[] a, Student[] l, Student[] r, int left, int right) {

    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
      if (comp.compare(l[i], r[j]) <= 0) {
        a[k++] = l[i++];
      } else {
        a[k++] = r[j++];
      }
    }
    while (i < left) {
      a[k++] = l[i++];
    }
    while (j < right) {
      a[k++] = r[j++];
    }
  }
}

class QuickSort {
  private static SortingStudentsByGPAComparator comp = new SortingStudentsByGPAComparator();

  public static void sort(Student[] arr) {
    recursiveSort(arr, 0, arr.length - 1);
  }

  private static void recursiveSort(Student arr[], int begin, int end) {
    if (begin >= end) {
      return;
    }

    Student pivot = arr[end];
    int splitIndex = begin; // also called partition index
    for (int i = begin; i < end; i++) {
      if (comp.compare(arr[i], pivot) <= -1) {
        if (splitIndex != i) {
          Student temp = arr[splitIndex];
          arr[splitIndex] = arr[i];
          arr[i] = temp;
        }

        splitIndex++;
      }
    }

    arr[end] = arr[splitIndex];
    arr[splitIndex] = pivot;

    recursiveSort(arr, begin, splitIndex - 1);
    recursiveSort(arr, splitIndex + 1, end);
  }
}