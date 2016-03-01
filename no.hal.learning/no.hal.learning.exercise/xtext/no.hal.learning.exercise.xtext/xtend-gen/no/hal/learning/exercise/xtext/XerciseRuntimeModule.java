/**
 * generated by Xtext 2.9.1
 */
package no.hal.learning.exercise.xtext;

import no.hal.learning.exercise.xtext.AbstractXerciseRuntimeModule;
import no.hal.learning.exercise.xtext.formatting.XerciseValueConverter;
import no.hal.learning.exercise.xtext.scoping.XerciseFragmentProvider;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.resource.IFragmentProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class XerciseRuntimeModule extends AbstractXerciseRuntimeModule {
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return XerciseValueConverter.class;
  }
  
  @Override
  public Class<? extends IFragmentProvider> bindIFragmentProvider() {
    return XerciseFragmentProvider.class;
  }
}