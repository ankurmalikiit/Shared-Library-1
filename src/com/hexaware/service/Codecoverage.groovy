package com.hexaware.service
class Codecoverage implements Serializable{
Script mainScript
Map specs
Map config

  def Codecoverage(Script mainScript, Map specs, Map config){
  this.mainScript = mainScript
  this.specs = specs
  this.config = config
  }
  def codecoverageCheckFunc(Map specs, Map config){
    mainScript.sh config.java.codecoverage.jacoco.command 
  }
}
