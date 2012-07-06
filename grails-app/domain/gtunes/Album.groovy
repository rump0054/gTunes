package gtunes

class Album {
	String title
	
	static hasMany = [songs:Song]
	static belongsTo = [artist:Artist]

    static constraints = {
    	title(blank:false)
    }
    
    String toString() {
    	title
    }
}
