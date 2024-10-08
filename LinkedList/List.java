//Classe dos Nodes
class Nodes {
    String Data;
    Nodes Next;

    //Constructor
    public Nodes(String Data) {
        this.Data = Data;
        this.Next = null;
    }

    //Getters e Setters / Não Utilizado Nesse Algoritimo
    public String getData() {
        return Data;
    }
    public void setElement(String Data) {
        this.Data = Data;
    }
    public Nodes getNext() {
        return Next;
    }
    public void setNext(Nodes Next) {
        this.Next = Next;
    }
}

//==========================================================================================
//Classe da ListaEncadeada
class ListaEncadeadaSimples {
    private Nodes FirstNode;

    public ListaEncadeadaSimples() {
        this.FirstNode = null;
    }
    //==========================================================================================
    //Adicionar Elemento
    public void InsertEnd(String Data) {
        Nodes NewNode = new Nodes(Data);
        NewNode.Next = FirstNode;
        FirstNode = NewNode;
    }
    //==========================================================================================
    //Adicionar Elemento no Fianl da Lista
    public void InsertStart(String Data) {
        Nodes NewNode = new Nodes(Data);
        if (FirstNode == null) {
            FirstNode = NewNode;
        } else {
            Nodes Current = FirstNode;
            while (Current.Next != null) {
                Current = Current.Next;
            }
            Current.Next = NewNode;
        }
    }
    //==========================================================================================
    //Remover Elemento
    //Lista Vazia
    public boolean Remove(String Data) {
        if (FirstNode == null) {
            return false; 
        }
        //Valor no FirstNode
        if (FirstNode.Data.equals(Data)) {
            FirstNode = FirstNode.Next;
            return true;
        }
        Nodes Current = FirstNode;
        while (Current.Next != null && !Current.Next.Data.equals(Data)) {
            Current = Current.Next;
        }
        //Dado Não Encontrado
        if (Current.Next == null) {
            return false; 
        }
        //Remover o Node
        Current.Next = Current.Next.Next;
        return true;
    }
    //==========================================================================================
    //Buscar um Elemento
    public boolean Search(String Data) {
        Nodes Current = FirstNode;
        while (Current != null) {
            if (Current.Data.equals(Data)) {
                return true;
            }
            Current = Current.Next;
        }
        return false;
    }
    //==========================================================================================
    //Imprimir a Lista
    public void Print() {
        Nodes Current = FirstNode;
        if (Current == null) {
            System.out.println("A Lista Está Vazia.");
        } else {
            while (Current != null) {
                System.out.print(Current.Data + " -> ");
                Current = Current.Next;
            }
            System.out.println("Null");
        }
    }
}