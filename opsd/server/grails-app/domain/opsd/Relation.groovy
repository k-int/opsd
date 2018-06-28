package opsd

class Relation {

  String id
  String name

  static mapping = {
                   id column:'rel_id', generator: 'uuid', length:36
              version column:'rel_version'
                 name column:'rel_name'
  }

  static constraints = {
               name(nullable:false, blank:false)
  }
}
