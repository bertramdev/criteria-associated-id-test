package com.bertramlabs.criteria

class Author {
	String firstName
	String lastName
	Date birthDate
	String biography

	static mapping = {
		biography type:'text'
	}
	
    static constraints = {

    	birthDate nullable:true
    	biography nullable:true
    }
}
