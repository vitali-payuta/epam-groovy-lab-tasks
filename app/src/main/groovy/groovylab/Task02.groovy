/**
Return a list of input elements, where odd numbers are multiplied by 3 and even
numbers by 2. Example:
Task02.mulEvenOdd([4,5,6]) == [8,15,12]
*/

package groovylab

class Task02 {
    public static List mulEvenOdd(List l) {
    	def result = []
    	l.each{(it % 2 == 0)?result.add(it*=2):result.add(it*=3)} 
        return result
    }
}
