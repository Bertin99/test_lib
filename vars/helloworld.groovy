#!/usr/bin/env groovy
import groovy.json.*

def call(body) {
    // Déclaration correcte de la map
    def vars = [:]

    // Résolution et délégation du corps
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = vars
    body()

    // Récupérer les valeurs de la map
    def name = vars.name
    def action = vars.action

    // Affichage
    println(action + " " + name + " !!")
}

