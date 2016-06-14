package com.joasgarcia.productiononlyannotation

class MessageController {

    def messageService

    def productionOnly() {
        render messageService.runProductionOnly()
    }

    def alwaysRun() {
        render messageService.alwaysRun()
    }
}
