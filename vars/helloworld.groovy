#!/usr/bin/env groovy
import groovy.json.*
def call (body) {
 def map vars    = [ : ]
 boby.resolveStrategy		= closure.DELEGATE_FIRST
 boby.delegate                  = mapVars
 boby ()

 def name = maVars.name
 def action = maVars.action
 println( action + " " + name + " !! ")




}
