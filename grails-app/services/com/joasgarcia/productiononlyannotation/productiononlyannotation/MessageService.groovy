package com.joasgarcia.productiononlyannotation.productiononlyannotation

import com.joasgarcia.productiononlyannotation.ProductionOnly
import grails.transaction.Transactional

@Transactional
class MessageService {

    @ProductionOnly
    public String runProductionOnly(String message) {
        return "OK - ${message}"
    }

    public String alwaysRun() {
        return "OK"
    }
}
