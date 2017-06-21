/**
 * Created by allan on 6/21/17.
 */

def populateHash(Map<String, String> map, size) {
    for (i in 1 .. size) {
        map[i.toString()] = i.toString()
    }
}

def performExperiment(Map<String, String> map, String key) {
    def start = System.nanoTime()
    def value = map[key]
    def end = System.nanoTime()

    println("Access element at key for map of size ${map.size()} takes ${(end-start)/1000000000} s")
}

def smallMap = [:]
populateHash(smallMap, 100)
performExperiment(smallMap, "50")

def mediumMap = [:]
populateHash(mediumMap, 1000)
performExperiment(mediumMap, "500")

def largeMap = [:]
populateHash(largeMap, 10000000)
performExperiment(largeMap, "5000000")
