package com.joasgarcia.productiononlyannotation.productiononlyannotation

import com.joasgarcia.productiononlyannotation.ProductionOnly
import grails.transaction.Transactional

@Transactional
class MessageService {

    @ProductionOnly
    public String runProductionOnly() {
        return "OK"
    }

    public String alwaysRun() {
        return "OK"
    }
}
