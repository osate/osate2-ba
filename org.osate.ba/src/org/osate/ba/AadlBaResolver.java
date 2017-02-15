/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2011 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify 
 * it under the terms of the Eclipse Public License as published by Eclipse,
 * either version 1.0 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see 
 * http://www.eclipse.org/org/documents/epl-v10.php
 */

package org.osate.ba;

import java.util.Iterator ;
import java.util.List ;

import org.eclipse.core.runtime.Platform ;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager ;
import org.osate.annexsupport.AnnexResolver ;
import org.osate.ba.aadlba.BehaviorAnnex ;
import org.osate.ba.aadlba.BehaviorState ;
import org.osate.ba.aadlba.BehaviorTransition ;
import org.osate.ba.analyzers.AadlBaNameResolver ;
import org.osate.ba.analyzers.AadlBaRulesCheckersDriver ;
import org.osate.ba.analyzers.AadlBaTypeChecker ;
import org.osate.ba.analyzers.AdaLikeDataTypeChecker ;
import org.osate.ba.analyzers.DataTypeChecker ;
import org.osate.ba.analyzers.DeclarativeUtils ;
import org.osate.ba.texteditor.AadlBaHyperlink ;
import org.osate.ba.texteditor.DefaultAadlBaHyperlink ;
import org.osate.ba.texteditor.XtextAadlBaHyperlink ;


public class AadlBaResolver implements AnnexResolver
{
   public static final String ANNEX_NAME = "behavior_specification";
	
   @SuppressWarnings("rawtypes")
   @Override
   public void resolveAnnex(String annexName, List annexElements,
                            AnalysisErrorReporterManager errManager)
   {
     Iterator<?> it = annexElements.iterator() ;
     BehaviorAnnex ba ;
     while(it.hasNext())
     {
        ba = (BehaviorAnnex) it.next() ;
        doResolution(ba, errManager);
     }
   }
   
   public void doResolution(BehaviorAnnex ba, AnalysisErrorReporterManager errManager)
   {
     AadlBaNameResolver nameResolver ;
     AadlBaRulesCheckersDriver semanticAnalysis;
     AadlBaTypeChecker typeChecker ;
     DataTypeChecker dataTypeChecker = new AdaLikeDataTypeChecker(
                                                               errManager) ;
     boolean result = false ;
     
     nameResolver = new AadlBaNameResolver(ba, errManager) ;
     
     result = nameResolver.resolveNames() ;
     
     // It doesnt't perform semantic tests if the name resolution has
     // failed. 
     if (result)
     {
        typeChecker = new AadlBaTypeChecker(ba, dataTypeChecker,
                                                errManager) ;
        
        result = typeChecker.checkTypes() ;
        
        if (result)
        {
          
          semanticAnalysis = new AadlBaRulesCheckersDriver(ba, errManager);
          result = semanticAnalysis.process(ba) ;
        }  
        
        // XXX DEBUG
//        AadlBaUnparser unparser = new AadlBaUnparser() ;
//        System.out.println(unparser.process(ba));
        
        // DEBUG
//        System.out.println("### nb errors : " + errManager.getNumErrors()) ;
     }
   }
}  
