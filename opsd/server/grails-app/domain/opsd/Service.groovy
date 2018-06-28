package opsd

class Service {

  String id
  String name
  OrganisationUnit owner
  

  static mapping = {
                   id column:'s_id', generator: 'uuid', length:36
              version column:'s_version'
                 name column:'s_name'
                owner column:'s_owner_ou_fk'
  }

  static constraints = {
               name(nullable:true, blank:false)
              owner(nullable:false, blank:false)
  }

}
