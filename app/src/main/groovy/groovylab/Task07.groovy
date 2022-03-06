/**
Encrypt input string. Conditions:
- string is a space separated words
- you need to encrypt each word using following rules:
  * The first letter needs to be converted to its ASCII code
  * The second letter needs to be switched with the last letter
Example:
Task07.encryptThis("Hello") == "72olle"
Task07.encryptThis("hello world") == "104olle 119drlo"
*/

package groovylab

class Task07 {
    public static String encryptThis(String s) {
        if (s.length()==0) return "";
        List word = s.split(" ")
        def res = []
        for ( def w in word ){
            if (w.length() <= 2){
                if (w.length() <= 1) { res << (int) w[0] }
                else {res << (int) w[0] + w[1]}
            }
            else {     
                res << (int) w[0] + w[-1] + w[2..-2] + w[1]
            }
        }
        return res.join(" ")
    }
}
