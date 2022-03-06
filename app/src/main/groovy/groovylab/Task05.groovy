/**
Define, whether input string have a Ip format. Example:
Task05.isSublist("10.0.152.164") == true
*/

package groovylab

class Task05 {
    public static isIp(String ip) {
    	return ((ip==~ /((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)/)?true:false)
        /*List parts = ip.split("\\.")
        def partsch = [] 
        for (i in parts) {
            partsch.add(i as Integer)
        }
        if (parts.size() != 4) return false
        for (i in partsch){
            if ( i > 255 || i < 0) 
            	return false
        } 
        return true*/    
    }
}
