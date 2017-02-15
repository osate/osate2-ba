package org.osate.xtext.ba;

import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class BehaviorAnnexDerivedStateComputer implements IDerivedStateComputer {
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    InputOutput.<String>println("HELLO !!!");
  }
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
  }
}
