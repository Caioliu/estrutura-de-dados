public class Una7LList<T> {
    // Hold the reference to the first node of this List.
    private Node<T> firstNode;
    private int totalElements;

    public void insertAtBeginning(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(firstNode);
        firstNode = newNode;
        totalElements++;
    }

    public Node<T> removeAtBeginning() {
        Node<T> aux = firstNode;
        firstNode = firstNode.getNext();
        totalElements--;
        return aux;
    }

    @Override
    public String toString() {
        if(this.totalElements == 0) {
            return "[ ]";
        }

        Node<T> currentNode = firstNode;
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalElements; i++) {
            builder.append(currentNode.getValue());
            builder.append(", ");

            currentNode = currentNode.getNext();

        }

        builder.append("]");

        return  builder.toString();
    }

    //    Design the other list methods.
    //    Insert at the end, in order, remove at the end,
    //    remove elements by value, search an element.

    public Node<T> deleteElementByValue(T value) {
        Node<T> aux = firstNode;
        // Essa variável deve armazenar o elemento anterior
        Node<T> lastReference = new Node<T>(value);

        // Percorrer a lista, comparando cada elemento com o parâmetro de busca
        // Ao encontrar o elemento de busca, alterar a referência "Next" do elemento anterior para "Value" do próximo elemento.
        for (int i = 1; i < totalElements; i++) {
            if (aux.getValue() == value) {
                lastReference.setNext(aux.getNext());
                break;
            } else {
                Node<T> currentNode = aux.getNext();
                lastReference = aux;
                aux = currentNode;
            }
        }
        //Reduzir o elemento removido.
        totalElements--;
        return aux;
    }

    public Node<T> searchElementByValue(T element) {
        Node<T> aux = firstNode;

        // Percorrer a lista, comparando cada elemento com o parâmetro de busca
        for (int i = 1; i < totalElements; i++) {
            if (aux.getValue() == element) {
                break;
            } else {
                Node<T> currentNode = aux.getNext();
                aux = currentNode;
            }
        }
        return aux;
    }

    public Node<T> getFirstElement() {
        return firstNode;
    }

    public Node<T> getLastElement() {
        Node<T> aux = firstNode;
        
        //Obter o último item da lista
        for (int i = 1; i < totalElements; i++) {
            Node<T> currentNode = aux.getNext();
            aux = currentNode;
        }
        
        return aux;
    }

    public Node<T> insertAtEnd(T value) {
        //Construir o novo objeto com valor obtido.
        Node<T> newNode = new Node<>(value);

        //Obter o último item da lista
        Node<T> aux = firstNode;
        
        for (int i = 1; i < totalElements; i++) {
            Node<T> currentNode = aux.getNext();
            aux = currentNode;
        }

        //Adicionar na referência de próximo, o Node obtido.
        aux.setNext(newNode);
        //Incrementar o tamanho da lista.
        totalElements++;

        return newNode;
    }

    public Node<T> removeAtEnd() {
        // Obter o penúltimo elemento e armazená-lo em aux.
        Node<T> aux = firstNode;
        // Não sei escrever penúltimo em inglês XD.
        int penultimoElemento = totalElements - 1;
        
        for (int i = 1; i < penultimoElemento; i++) {
            Node<T> currentNode = aux.getNext();
            aux = currentNode; 
        }
        
        //Remover a referência do último elemento
        aux.setNext(null);
        //Reduzir o tamanho da lista
        totalElements--;

        return aux;
    }
    
    
}