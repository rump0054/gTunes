package gtunes

class Song {
	String title
	Integer duration
	
	static belongsTo = [album:Album]

    static constraints = {
    	title()
    	duration(min:1)
    }
}
