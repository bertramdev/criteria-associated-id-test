package com.bertramlabs.criteria

class Book {
	Author author

	String name
	String description
	Date publishDate

	String isbn

	static mapping = {
		description type: 'text'
	}
    static constraints = {
    	publishDate nullable:true
    	isbn nullable:true
    }
}
