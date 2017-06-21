/**
 * Created by allan on 6/21/17.
 */

List<Integer> deduplicate(List<Integer> data) {
    Set<Integer> dedup = new TreeSet<>()

    // Put your code here to remove duplicates
    
    return Arrays.asList(dedup.toArray())
}

def data = [1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 7]
println deduplicate(data)