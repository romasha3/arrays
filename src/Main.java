//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        int[] array = new int[50];
        for (int i = 0, j = 1; i < 50; j += 2, i++) {
            array[i] = j;
            System.out.println(array[i]);
        }
        System.out.println("Завдання 2");
        System.out.println("Старий масив: ");
        int[] array2 = new int[20];
        for (int a = 0; a < 20; a++) {
            array2[a] = (int) (Math.random() * 10);
            System.out.print(array2[a] + " ");
        }
        System.out.println();
        System.out.println("Новий масив: ");
        for (int a = 0; a < 20; a++) {
            if (a % 2== 0) {
                array2[a] = 0;
            }
            System.out.print(array2[a] + " ");
        }
        System.out.println("\nЗавдання 3");
        int[] array3 = new int[5];
        int[] array4 = new int[5];
        int[] array5 = new int[5];
        int sum1=0;
        int sum2=0;
        int sum3=0;

        System.out.print("Масив 1: ");
        for (int b = 0;b < 5;b++) {
            array3[b] = (int) (Math.random() * 6);
            System.out.print(array3[b] + " ");
            sum1+=array3[b];
        }
        double average=(double)sum1/array3.length;
        System.out.println("\nСереднє арифметичне значення для 1 масиву: " + average);
        System.out.print("Масив 2: ");
        for (int c = 0;c < 5;c++){
            array4[c]=(int) (Math.random() * 6);
            System.out.print(array4[c] + " ");
            sum2+=array4[c];
        }
        double average2=(double)sum2/array4.length;
        System.out.println("\nСереднє арифметичне значення для 2 масиву: " + average2);
        System.out.print("Масив 3: ");
        for (int d = 0;d < 5;d++){
            array5[d]=(int) (Math.random() * 6);
            System.out.print(array3[d] + " ");
            sum3+=array5[d];
        }
        double average3=(double)sum3/array4.length;
        System.out.println("\nСереднє арифметичне значення для 3 масиву: "+average3);
        if(average>average2 && average>average3){
            System.out.println("Середнє арифметичне 1 масиву є найбільшим");
        } else if (average==average2) {
            System.out.println("Масив 1 та 2 мають однакове середнє арифметичне значення");
        } else if (average==average3) {
            System.out.println("Масив 1 та 3 мають однакове середнє арифметичне значення");
        }else if (average2>average3 && average2>average) {
            System.out.println("Середнє арифметичне 2 масиву є найбільшим");
        } else if (average2==average3) {
            System.out.println("Масив 2 та 3 мають однакове середнє арифметичне значення");
        } else if (average3>average && average3>average2){
            System.out.println("Середнє арифметичне 3 масиву є найбільшим");
        }else{
            System.out.println("Середні арифметичні значення для всіх масивів є рівні");
        }
        System.out.println("\nЗавдання 4");
        int []array01=new int[10];
        int []array02=new int [10];
        int []array03=new int [10];
        System.out.print("Перший масив: ");
        for (int f=0;f<10;f++){
            array01[f]=(int)(Math.random()*11);
            System.out.print(array01[f]+" ");
        }
        System.out.print("\nДругий масив: ");
        for (int h=0;h<10;h++) {
            array02[h] = (int) (Math.random() * 11);
            System.out.print(array02[h] + " ");
        }
        System.out.print("\nТретій масив: ");
        for (int g=0;g<10;g++){
            array03[g]=array01[g]+array02[g];
            System.out.print(array03[g]+" ");
        }
        System.out.println("\nЗавдання 5: ");
        int []array04=new int [15];
        int count=0;
        for (int z=0;z<15;z++){
            array04[z]=(int)(Math.random()*10);
            System.out.print(array04[z]+" ");
            if(array04[z]%2==0){
                count++;
            }
        }
        System.out.println("\nКількість парних чисел в масиві : "+count);
        System.out.println("Завдання 6:");
        int [][]array05=new int[15][];
        array05[0]=new int[5];
        array05[1]=new int[5];
        array05[2]=new int[5];
        array05[3]=new int[5];
        array05[4]=new int[8];
        array05[5]=new int[8];
        array05[6]=new int[8];
        array05[7]=new int[8];
        array05[8]=new int[3];
        array05[9]=new int[3];
        array05[10]=new int[3];
        array05[11]=new int[3];
        array05[12]=new int[9];
        array05[13]=new int[9];
        array05[14]=new int[9];
        for (int x=0;x<array05.length;x++){
            for (int y=0;y<array05[x].length;y++){
                array05[x][y]=(int)(Math.random()*15);
                System.out.print(array05[x][y]+" ");
            }
            System.out.println();
        }
    }
}