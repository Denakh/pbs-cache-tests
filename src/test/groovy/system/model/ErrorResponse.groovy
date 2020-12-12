package system.model

import groovy.transform.ToString

@ToString(includeNames = true)
class ErrorResponse {

    String error
    Integer status
    String path
    String message
    Long timestamp
}
