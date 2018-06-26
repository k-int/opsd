package opsd

class OrganisationUnit {

  String id
  String name

  static mapping = {
                   id column:'ou_id', generator: 'uuid', length:36
              version column:'ou_version'
                 name column:'ou_name'
  }

  static constraints = {
               name(nullable:false, blank:false)
  }
}
