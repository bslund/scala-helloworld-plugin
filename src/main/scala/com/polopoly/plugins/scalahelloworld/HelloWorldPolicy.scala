/**
 *
 */
package com.polopoly.plugins.scalahelloworld

import com.polopoly.cm.app.policy.SingleValued
import com.polopoly.cm.policy.Policy
import com.polopoly.model.ModelTypeDescription

import example.layout.element.ElementPolicy

/**
 * @author Staffan Lundström
 *
 */
class HelloWorldPolicy extends ElementPolicy with ModelTypeDescription {

  def getSalutation = 
    getChildPolicy("salutation") match { 
      case salutation: SingleValued => salutation.getValue()
      case _ => error("field salutation must use SingleValued policy")
    }    
}
