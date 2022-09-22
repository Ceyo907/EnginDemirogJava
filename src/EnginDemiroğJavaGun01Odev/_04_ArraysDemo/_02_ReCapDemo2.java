package EnginDemiroğJavaGun01Odev._04_ArraysDemo;

public class _02_ReCapDemo2 {
    public static void main(String[] args) {
        double[] myList = {1.2, 3.3, 4.3, 5.6};  //newlemekle bunun arasında fark yoktur.

        double total = 0;
        double max = myList[0];   //En büyük sayı olarak 0. elemanı atadık
        for (double number : myList) { //MyListteki sayıları gez
            if (max < number) {
                max = number;
            }
            total += number;
            System.out.println(number);

        }
        System.out.println("Toplam = " + total);
        System.out.println("En Büyük = " + max);


    }
}
