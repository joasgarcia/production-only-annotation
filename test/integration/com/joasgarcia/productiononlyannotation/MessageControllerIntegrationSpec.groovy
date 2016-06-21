package com.joasgarcia.productiononlyannotation

import grails.test.spock.IntegrationSpec

class MessageControllerIntegrationSpec extends IntegrationSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "This test will fail when run it on production environment"() {
        given:
        def controller = new MessageController()

        when:
        controller.params.message = "Foo"
        controller.productionOnly()

        then:
        controller.response.text == "NOK"
    }

    void "Test method without @ProductionOnly annotation"() {
        given:
        def controller = new MessageController()

        when:
        controller.alwaysRun()

        then:
        controller.response.text == "OK"
    }
}
