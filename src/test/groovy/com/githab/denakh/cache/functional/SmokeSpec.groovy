package com.githab.denakh.cache.functional

import com.githab.denakh.cache.functional.system.CacheRequester
import com.githab.denakh.cache.functional.system.model.Cache
import spock.lang.Specification

class SmokeSpec extends Specification {

    def "Valid cache post request should return status code 200"() {
        when: "Initiate valid cache post request"
        CacheRequester.postCache(Cache.defaultCache())

        then: "Response status code after the request is 200 and then no ApiErrorException"
        notThrown(CacheRequester.ApiErrorException)
    }

//    @allure.title('Test GET status code')
//    def test_get_status_code(cache_url, get_json_file_payload_as_dict):
//    file_name = "payload_with_3_creatives_and_no_uuid.json"
//    post_response = requests.post(cache_url, json=get_json_file_payload_as_dict(file_name))
//
//    response_body = json.loads(post_response.text)
//    for response in response_body["responses"]:
//    uuid = response["uuid"]
//    get_response = requests.get(cache_url, params={"uuid": uuid})
//    assert 200 == get_response.status_code, f"Response text: {get_response.text}"
}
