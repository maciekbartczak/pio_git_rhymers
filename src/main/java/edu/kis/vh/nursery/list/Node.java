package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentująca node w linked liście
 */
public class Node {

    private int value;
    private Node prev;
    private Node next;

    /** Konstruktor
     * @param i wartość przechowywana w nodzie
     */
    public Node(int i) {
        setValue(i);
    }

    /** Zwraca wartość przechowywaną w nodzie
     * @return wartośc przechowywaną w nodzie
     */
    public int getValue() {
        return value;
    }

    /** Ustawia wartość przechowywaną w nodzie
     * @param value wartość do przechowania
     */
    public void setValue(int value) {
        this.value = value;
    }


    /** Zwraca referencje do poprzedniego noda
     * @return referencja do poprzedniego noda
     */
    public Node getPrev() {
        return prev;
    }


    /** Ustawia referencje do poprzedniego noda
     * @param prev referencja do poprzedniego noda
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /** Zwraca referencje do następnego noda
     * @return referencja do następnego noda
     */
    public Node getNext() {
        return next;
    }

    /** Ustawia referencje do następnego noda
     * @param next referencja do nastpęnego noda
     */
    public void setNext(Node next) {
        this.next = next;
    }
}

// alt + -> - przełączanie między otwartymi plikami (IntelliJ)