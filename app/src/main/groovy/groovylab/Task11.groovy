/**
Insert first input string inside the brackets, near the number, which equals to
the second input parameter (template is set to GSTRING_TEMPLATE static
property). Example:
Task11.gstring("test", 2) == "1() 2(test) 3()"
*/

package groovylab

class Task11 {
    private static final String GSTRING_TEMPLATE = "1() 2() 3()"

    public static String gstring(String text, int num) {
         def res = []
         List temp = GSTRING_TEMPLATE.split(" ")
         if (temp.size() < num)
             return "OUT off range template"
         for(int x = 1; x <= temp.size(); x++)
             x == num ? res.add(x.toString() + "(" + text + ")") : res.add(x.toString() + "()")  
         return res.join(" ")
    }
}
