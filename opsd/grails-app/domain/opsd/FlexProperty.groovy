package opsd

class FlexProperty {

  String id
  String owningResourceId
  

  static mapping = {
                   id column:'fp_id', generator: 'uuid', length:36
              version column:'fp_version'
     owningResourceId column:'fp_owning_resource_id'
  }

  static constraints = {
    owningResourceId(nullable:false, blank:false);
  }

}
