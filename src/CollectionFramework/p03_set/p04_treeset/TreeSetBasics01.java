package CollectionFramework.p03_set.p04_treeset;

public class TreeSetBasics01 {
}

// 1. Understand TreeSet first:

// 1. Stores unique elements.
// 2. Keeps elements sorted in ascending natural order by default.
// 3. Does not guarantee insertion order.
// 4. Most basic operations take \(O(\log n)\) time.

// 2. For example, adding 30, 10, 40, 20, 10 produces:
// [10, 20, 30, 40]

// 3. The duplicate 10 is removed, and the remaining elements are sorted automatically.

// 4. Create these classes:

//    Class name	                           What you will learn

// 1. TreeSetBasics	                           Sorting and duplicate removal
// 2. TreeSetConstructors                      Different constructors
// 3. TreeSetAddMethods	                       add() and addAll()
// 4. TreeSetRemoveMethods	                   remove(), pollFirst(), pollLast()
// 5. TreeSetSearchMethods	                   contains(), size(), isEmpty()
// 6. TreeSetFirstLast	                       first(), last()
// 7. TreeSetNavigationMethods	               lower(), higher(), floor(), ceiling()
// 8. TreeSetRangeMethods	                   headSet(), tailSet(), subSet()
// 9. TreeSetIteration	                       Loops, iterators, descending iteration
// 10. TreeSetComparatorDemo	               Custom sorting
// 11. TreeSetCustomObjects	                   Sorting custom objects
// 12. TreeSetBulkOperations	               retainAll(), removeAll(), containsAll()
// 13. TreeSetNullDemo	                       Why null usually fails with natural ordering
// 14. TreeSetToArray	                       Converting a set into arrays
// 15. TreeSetRealWorld	                       A practical example
// 16. TreeSetVsHashSet	                       Interview comparison