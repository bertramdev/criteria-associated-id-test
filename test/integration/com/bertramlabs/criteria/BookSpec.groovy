package com.bertramlabs.criteria



import spock.lang.*

/**
 *
 */
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test querying by author.id"() {
    	given:
    		def author = new Author(firstName: 'David', lastName: 'Estes', birthDate: new Date())
    		author.save(flush:true)
    		def book = new Book(name: 'Testing GORM', publishDate: new Date(), description: 'Testing GORM withCriteria associations', author:author);
    		book.save(flush:true)

    	when:
    		def result = Book.withCriteria(uniqueResult:true) {
    			eq('author.id', author.id)
    		}
    	then:
    		result?.id == book.id
    }
}
