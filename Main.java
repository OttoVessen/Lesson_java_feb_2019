public class Main {

    public static void main(String[] args) {

        Worker[] workArray = new Worker[5];
        workArray[0]= new Worker("Сидоров","Директор","sidorov@ku.com","89990000000",300000,57);
        workArray[1]= new Worker("Иванов","Стажер","ivanov@ku.com","89990000001",300000,23);
        workArray[2]= new Worker("Петров","Бухгалтер","petrov@ku.com","89990000002",300000,37);
        workArray[3]= new Worker("Тараканов","Охранник","tarakanov@ku.com","89990000003",300000,41);
        workArray[4]= new Worker("Пауков","Диррижер","paukov@ku.com","89990000004",300000,60);


        for (int i = 0; i < 5; i++) {

            if(workArray[i].age > 40){

                workArray[i].printInfo();
            }

        }


    }






}


