/**
Return n-th element of Fibonacci's sequence
(https://en.wikipedia.org/wiki/Fibonacci_number). Example:
Task04.fib(4) == 3
*/

package groovylab

class Task04 {
    public static int fib(int n) {
    	def a = 0, b= 1;
      	n.times{ (a,b) = [b,a+b] }
        return a
    }
}
