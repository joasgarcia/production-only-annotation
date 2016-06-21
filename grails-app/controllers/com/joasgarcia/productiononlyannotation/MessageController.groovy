package com.joasgarcia.productiononlyannotation

class MessageController {

    def messageService

    def productionOnly() {
        render messageService.runProductionOnly(params.message)
    }

    def alwaysRun() {
        render messageService.alwaysRun()
    }
}
