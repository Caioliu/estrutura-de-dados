

public class Main {
    public static void main(String[] args) {
        Una7LList<Integer> myList = new Una7LList<>();

        for (int i = 0; i < 10; i++) {
            myList.insertAtBeginning(i + 1);
            // System.out.println(myList);
        }

        System.out.println("Lista Completa:");
        WriteList(myList);
 
        Integer insertValue = 99;
        System.out.println("---------------- Inserindo valor [" + insertValue + "] ao fim da lista -------------------");
        myList.insertAtEnd(insertValue);
        WriteList(myList);

        System.out.println("---------------- Removendo o último elemento da lista -------------------");
        myList.removeAtEnd();
        WriteList(myList);

        Integer removeValue = 4;
        System.out.println("---------------- Removendo o elemento por valor [" + removeValue + "] -------------------");
        myList.deleteElementByValue(removeValue);
        System.out.println(myList);

        Integer searchValue = 7;
        System.out.println("---------------- Pesquisando o elemento por valor [" + searchValue + "] -------------------");
        System.out.println(myList);
        Node<Integer> result = myList.searchElementByValue(searchValue);
        System.out.println("Resultado da busca [" + result + "]");
    }

    private static void WriteList(Una7LList<Integer> myList) {

        System.out.println(myList);
        String firstElement = myList.getFirstElement().toString();
        System.out.println("Primeiro elemento: " + firstElement);
        String lastElement = myList.getLastElement().toString();
        System.out.println("Ultimo elemento " + lastElement);
    }
}