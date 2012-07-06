package gtunes

class Song {
	String title
	Integer duration
	
	static belongsTo = [album:Album]

    static constraints = {
    	title(blank:false)
    	duration(min:1)
    }
    
    String toString() {
    	title
    }
}
