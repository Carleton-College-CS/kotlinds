// Subinterface of SetADT that adds Comparable capability.
interface ComparableSetADT<E: Comparable<E>>: SetADT<E> {

    // Return a list of all elements from fromElement to toElement, inclusive.
    fun keyList(fromElement: E, toElement: E): List<E>
}