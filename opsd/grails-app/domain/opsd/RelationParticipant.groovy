package opsd

class RelationParticipant {

  String id

  static mapping = {
                   id column:'rp_id', generator: 'uuid', length:36
              version column:'rp_version'
  }

  static constraints = {
  }

}
